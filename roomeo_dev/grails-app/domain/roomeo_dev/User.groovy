package roomeo_dev

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
	 * @return The userid on success. -1 if the user already existed. -2 for all other errors
	 */
	public Long createUser(String uname, String password)
	{
		User databaseUser = User.findByUname(uname)
		if (databaseUser != null)
			return -1
		databaseUser = User.create();
		return 0
	}
	
	static mapping = {
		attributes index:true, indexAttributes: [unique:true, dropDups:true]
	}
	static embedded = ['address', 'personality', 'attributes']
	static constraints = {
	}
}
