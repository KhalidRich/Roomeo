package roomeo_dev

class User {
	UserAttributes attributes
	UserMatch matches
	Address address
	UserPersonality personality
	
	static embedded = ['address', 'personality', 'attributes']
    static constraints = {
    }
}
