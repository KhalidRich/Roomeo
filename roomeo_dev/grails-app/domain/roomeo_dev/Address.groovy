package roomeo_dev

class Address {
	String streetAddress
	String city
	String state
	String country
	Integer zipCode
	
	static belongsTo = [user: User]
    static constraints = {
		streetAddress blank: false
		city blank: false
		city blank: false
		country blank: false
    }
}
