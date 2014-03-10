package roomeo_dev

import java.security.NoSuchAlgorithmException
import java.security.spec.InvalidKeySpecException
import roomeo_dev.security.PasswordFunctions;

class User {
	String email
	String uname
	String password
	
	UserAttributes attributes
	UserMatch matches
	Address address
	UserPersonality personality
	
	/**
	 * Given a user name and password, creates and saves this user in the database.
	 * @param uname - The to be user name of the user
	 * @param password - The password of the user. No restrictions
	 * @return The userid on success. -1 if the user already existed. -2 for violating password restrictions. -3 for all other errors
	 */
	public Long createUser(String username, String plainPassword)
	{
		// First, check to see if a user by this name exists
		def user = User.findByUname(username)
		if (user != null)
			return -1
		// Then, hash their password
		def pass
		try {
			pass = PasswordFunctions.createHash(plainPassword)
		} catch (InvalidKeySpecException e) {
			return -3
		} catch (NoSuchAlgorithmException e) {
			return -3
		}
		// Make sure they gave us a valid password
		if (pass == null)
			return -2
		// Create this user
		user = new User(uname: username, password: pass)
		user.save()
		// Done
		return user.id
	}
	
	static mapping = {
		attributes index:true, indexAttributes: [unique:true, dropDups:true]
	}
	static embedded = ['address', 'personality', 'attributes']
	static constraints = {
	}
}
