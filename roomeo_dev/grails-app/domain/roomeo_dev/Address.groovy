package roomeo_dev

class Address {
    User user
    
	String streetAddress
	String city
	String state
	String country
	Integer zipCode
	
    static constraints = {
		streetAddress blank: false
		city blank: false
		city blank: false
		country blank: false
    }
}
