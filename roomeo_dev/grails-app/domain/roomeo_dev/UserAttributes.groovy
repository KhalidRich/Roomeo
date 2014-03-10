package roomeo_dev

class UserAttributes {
	String name
	Gender gender
	Integer age

	Double longitude
	Double latitude
	List location
	Address desiredLocation
	Boolean hasRoom

	static mapping = { location geoIndex:true }
	static constraints = {
		age min: 18, nullable: false
		name blank: false
	}
}
