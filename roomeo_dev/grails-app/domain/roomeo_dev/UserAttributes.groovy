package roomeo_dev

class UserAttributes {
	String name
	Gender gender

	Double longitude
	Double latitude
	List location

	static mapping = { location geoIndex:true }
	static constraints = {
	}
}
