package roomeo_dev

import java.lang.reflect.Field

class UserAttributes {
	String name
	String profilePicturePath
	Gender gender = Gender.UNDISCLOSED
	Integer age
    
	Double longitude
	Double latitude
	List location
	String desiredLocation
	Boolean hasRoom
    Double startPriceRange, endPriceRange

    String college
    String areaOfStudy
    
    public Object getField(String field)
	{
        Field member = this.getClass().getDeclaredField(field)
        if (member == null)
            return null

        def ret
        if (!member.isAccessible()) {
            member.setAccessible(true)
            ret = member.get(this)
            member.setAccessible(false)
        } else
            ret = member.get(this)
        return ret
	}
    
	static belongsTo = [user: User]
	static mapping = { location geoIndex:true }
	static constraints = {
		age min: 18
		name blank: false
	}
}
