package roomeo_dev

import java.security.NoSuchAlgorithmException
import java.security.spec.InvalidKeySpecException
import roomeo_dev.security.PasswordFunctions;

class User {
	String email = ""
	String uname
	String password
	Boolean verified
	
	UserAttributes attributes = new UserAttributes()
	static hasMany = [matches: UserMatch]
	Address address = new Address()
	UserPersonality personality = new UserPersonality()
	
	/**
	 * Given a user name and password, creates and saves this user in the database.
	 * @param uname - The to be user name of the user
	 * @param password - The password of the user. No restrictions
	 * @return The userid on success. -1 if the user already existed. -2 for violating password restrictions. -3 for all other errors
	 */
	public static Long crayUser(String username, String plainPassword)
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
		user.save(failOnError: true)
		// Done
		return user.id
	}
	
	/**
	 * Given some identification and password, returns whether or not the pair identifies a user
	 * in our database.
	 * @param identification - The user's email or username
	 * @param plainPassword - The password in plain text (or maybe the eventual short hash)
	 * @return The userid on success, -1 if the pair does not describe a valid user, and -2 on error
	 */
	public static Long verifyUser(String identification, String plainPassword)
	{
		// Get the user object
		def user = User.findByUnameOrEmail(identification)
		if (user == null)
			return -1
		// Get the user's actual password
		def truePass = user.password
		// Verify the user
		def valid
		try {
			valid = PasswordFunctions.verifyPassword(plainPassword, truePass)
		} catch (InvalidKeySpecException e) {
			return -2
		} catch (NoSuchAlgorithmException e) {
			return -2
		}
		if (valid)
			return user.id
		return -1
	}
	
	/**
	 * Adds a map of attributes to the specified user.
	 * @param userid - the id of the user
	 * @param attributes - a map of attributes to add
	 * @return 0 on success. -1 on error
	 */
	public static int addUserAttributes(Long userid, Map attributes)
	{
		// Get the user
		def user = User.get(userid)
		if (user == null)
			return -1
	}
	
	public static int addUserPersonalities(Long userid, Map personalities)
	{
		
	}

	/*
	 * With great power comes great responsibility.
	 * Given a userid, returns a User object for you to do whatever you want to it.
	 * @param id - The userid of the User object
	 * @return A User whose User.id == id, or null on error
	 */
	public static User getUserFromID(Long id)
	{
		return User.get(id)
	}
	
	static mapping = {
		attributes index:true
	}
	static embedded = ['address', 'personality', 'attributes']
	static constraints = {
		email email: true, nullable: false, validator: { val -> val.equals("") || val.endsWith(".edu") }
		uname validator: { val, obj -> !(val == null && obj.email == null) }, unique: true
		password nullable: false, unique: true
		
		attributes nullable: true
		address nullable: true
		personality nullable: true
		verified nullable: true
	}
}
