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
	
	/**
	 * Returns an Address with some or all of its fields filled out from a given string
	 * @param addressString - The string containing the address. May contain newlines
	 * @return An Address representing the best effort parse results of the given string
	**/
	public static Address getAddressFromString(String addressString)
	{
	    // Parse the address into a mpa
	    def addressMap = AddressParser.parseAddress(addressString)
	    addressMap = AddressStandardizer.normalizeParsedAddress(addressMap)
	    // Make an address and detach it
	    def address = new Address()
	    
	    // Set each component field by field
	    address.streetAddress = addressMap[AddressComponent.NUMBER] + " " + addressMap[AddressComponent.STREET]
	    address.city = addressMap[AddressComponent.CITY]
	    address.state = addressMap[AddressComponent.STATE]
	    if (addressMap[AddressComponent.ZIP] != null)
	        address.zipCode = Integer.parseInt(addressMap[AddressComponent.ZIP])
	    println addressMap
	    return address
	}
	
	/**
	 * Sets a given's User address 
	**/
	public static int setUserAddress(Long userid, Address address)
	{
	    def user = User.get(userid)
	    if (user == null)
	        return -1
        
        def userAddr = Address.get(user.address.id)
        if (user == null)
            return -1
        
        userAddr.getDomainClass().getPersistantProperties().each {
			// Assign each field to each other field
			def field = it.getName()
			userAddr."$field" = address."$field"
		}
		if (userAddr.validate())
		    userAddr.save()
		else
		    return -2
		return 0
	}
	
	static belongsTo = [user: User]
    static constraints = {
		streetAddress blank: false
		city blank: false
		city blank: false
		country blank: false
    }
}
