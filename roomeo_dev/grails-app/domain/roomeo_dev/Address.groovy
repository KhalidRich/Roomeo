package roomeo_dev

import net.sourceforge.jgeocoder.us.AddressParser
import net.sourceforge.jgeocoder.us.AddressStandardizer
import net.sourceforge.jgeocoder.AddressComponent

class Address {
	String streetAddress
	String city
	String state
	String country
	Integer zipCode
	
	public static Address getAddressFromString(String addressString)
	{
	    // Parse the address into a mpa
	    def addressMap = AddressParser.parseAddress(addressString)
	    addressMap = AddressStandardizer.normalizeParsedAddress(addressMap)
	    // Make an address and detach it
	    def address = new Address()
	    
	    address.streetAddress = addressMap[AddressComponent.NUMBER] + " " + addressMap[AddressComponent.STREET]
	    address.city = addressMap[AddressComponent.CITY]
	    address.state = addressMap[AddressComponent.STATE]
	    address.zipCode = Integer.parseInt(addressMap[AddressComponent.ZIP])
	    println addressMap
	    return address
	}
	
	static belongsTo = [user: User]
    static constraints = {
		streetAddress blank: false
		city blank: false
		city blank: false
		country blank: false
    }
}
