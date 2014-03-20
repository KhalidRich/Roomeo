package roomeo_dev

import java.security.NoSuchAlgorithmException
import java.security.spec.InvalidKeySpecException
import roomeo_dev.security.PasswordFunctions

class User {
	String email = ""
	String uname
	String password
	Boolean verified
	
	UserAttributes attributes
	UserPersonality personality
	Address address
	
	static hasMany = [matches: UserMatch]
	
	/**
	 * Given a user name and password, creates and saves this user in the database.
	 * @param uname - The to be user name of the user
	 * @param password - The password of the user. No restrictions
	 * @return The userid on success. -1 if the user already existed. -2 for violating password restrictions. -3 for all other errors
	 */
	public static long crayUser(String username, String plainPassword)
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
		user = new User(uname: username, password: pass, attributes: new UserAttributes(), personality: new UserPersonality(), address: new Address())
		if (!user.validate())
		    return -1
		user.save()
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
	public static long verifyUser(String identification, String plainPassword)
	{
		// Get the user object
		def user = User.findByUname(identification)
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
	public static int addUserAttributes(Long userid, Map attributesToAdd)
	{
		// Get the user
		// Get the user
		def user = User.get(userid)
		if (user == null)
		    return -1
		
		def userAttr = UserAttributes.get(user.attributes.id)
		if (userAttr == null)
		    return -1
		    
        userAttr.getDomainClass().getPersistantProperties().each {
			// Retrieve the value of this attribute from the map
			def field = it.getName()
			def attr = attributesToAdd.get(field)
			// Make sure the map contained this field
			if (attr != null && it.getType().isInstance(attr))
			    userAttr."$field" = attr
		}
		
		// Always validate before saving
		if (userAttr.validate())
		    userAttr.save()
		else
		    return -1
		return 0
	}
	
	public static int addUserPersonalities(Long userid, Map personalitiesToAdd)
	{
		// Get the user
		def user = User.get(userid)
		if (user == null)
		    return -1
		
		def userNaly = UserPersonality.get(user.personality.id)
		if (userNaly == null)
		    return -1
		    
        userNaly.getDomainClass().getPersistantProperties().each {
			// Retrieve the value of this attribute from the map
			def field = it.getName()
			def naly = personalitiesToAdd.get(field)
			// Make sure the map contained this field
			if (naly != null && it.getType().isInstance(naly))
			    userNaly."$field" = naly
		}
		
		// Always validate before saving
		if (userNaly.validate())
		    userNaly.save()
		else
		    return -1
		return 0
	}

	/*
=======
	
	
    public static Map getUserPersonality(Long id)
    {
        if (id == null)
            return null

        def user = User.get(id)
        if (user == null)
            return null
        
        def userNality = [:]
        user.personality.getDomainClass().getPersistantProperties().each {
            userNality.put(it.getName(), user.personality.getField(it.getName()))
        }
        return userNality
    }
    
    
    public static Map getUserAttributes(Long id)
    {
        if (id == null)
            return null

        def user = User.get(id)
        if (user == null)
            return null
        
        def userAttr = [:]
        user.attributes.getDomainClass().getPersistantProperties().each {
            userAttr.put(it.getName(), user.attributes.getField(it.getName()))
        }
        return userAttr
    }
	
	/**
>>>>>>> 5e1d5943be77a1e8618ab0109451537a930aab38
	 * With great power comes great responsibility.
	 * Given a userid, returns a User object for you to do whatever you want to it.
	 * @param id - The userid of the User object
	 * @return A User whose User.id == id, or null on error
	 */

	public static Map getUserPersonality(Long id)
    {
        if (id == null)
            return null

        def user = User.get(id)
        if (user == null)
            return null
        
        def userNality = [:]
        user.personality.getDomainClass().getPersistantProperties().each {
            userNality.put(it.getName(), user.personality.getField(it.getName()))
        }
        return userNality
    }
    
    
    public static Map getUserAttributes(Long id)
    {
        if (id == null)
            return null

        def user = User.get(id)
        if (user == null)
            return null
        
        def userAttr = [:]
        user.attributes.getDomainClass().getPersistantProperties().each {
            userAttr.put(it.getName(), user.attributes.getField(it.getName()))
        }
        return userAttr
    }
    
	public static User getUserFromId(Long id)
	{
		return User.get(id)
	}
	
	// static embedded = ['address', 'attributes', 'personality']
	static mapping = {
		attributes index:true
		uname index:true, indexAttributes: [unique:true, dropDups:true]
	}
	static constraints = {
		email email: true, nullable: false, validator: { val -> val.equals("") || val.endsWith(".edu") }
		uname validator: { val, obj -> !(val == null && obj.email == null) }
		password nullable: false, unique: true
		
		attributes nullable: true
		address nullable: true
		personality nullable: true
		verified nullable: true
		uname validator: { val, obj -> !(val == null && obj.email == "") }
		password nullable: false
	}
}
