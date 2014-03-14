package roomeo_dev

class UserAttributes {
    User user
    
	String name
	String profilePicturePath
	Gender gender
	Integer age
    
	Double longitude
	Double latitude
	List location
	Address desiredLocation
	Boolean hasRoom
    Double startPriceRange, endPriceRange

    String college
    String areaOfStudy
    
	static mapping = { location geoIndex:true }
	static constraints = {
		age min: 18
		name blank: false
	}
}
