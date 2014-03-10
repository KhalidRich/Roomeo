package roomeo_dev

class UserAttributes {
	String name
	String email
	String uname
	Gender gender

	String password
	Double longitude
	Double latitude
	List location

	static mapping = { location geoIndex:true }
	static constraints = {
	}
}
