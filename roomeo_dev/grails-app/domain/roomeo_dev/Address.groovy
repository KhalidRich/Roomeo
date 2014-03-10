package roomeo_dev

class Address {
	String streetAddress
	String city
	String state
	String country
	int zipCode
	
    static constraints = {
		streetAddress blank: false
		city blank: false
		city blank: false
		country blank: false
    }
}
