package roomeo_dev

class User {
	UserAttributes attributes
	UserMatch matches
	Address address
	UserPersonality personality
	
	static mapping = {
		attributes index:true, indexAttributes: [unique:true, dropDups:true]
	}
	static embedded = ['address', 'personality', 'attributes']
    static constraints = {
    }
}
