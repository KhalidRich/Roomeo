package roomeo_dev
import java.lang.reflect.Field

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
    
    public Object getField(String field)
	{
	    def member = this.getClass().getDeclaredField(field)
	    def ret
	    if (!member.isAccessible()) {
	        member.setAccessible(true)
	        ret = member.get(this)
	        member.setAccessible(false)
	    } else
	        ret = member.get(this)
	    return ret
	}
    
	static mapping = { location geoIndex:true }
	static constraints = {
		age min: 18
		name blank: false
	}
}