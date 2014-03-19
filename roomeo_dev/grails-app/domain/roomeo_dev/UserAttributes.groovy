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
    
    public int setField(String field, Object value)
    {
        Field member = this.getClass().getDeclaredField(field)
        // The field actually exists
        if (member == null)
            return -1

        // The field is of the 
        if (!value.getClass().equals(member.getType()))
            return -2

        boolean notAccessible = false
        if (!member.isAccessible()) {
            member.setAccessible(true)
            notAccessible = true
        }
        member.set(this, value)
        if (notAccessible)
            member.setAccessible(false)
        
        return 0
    }
    
	static mapping = { location geoIndex:true }
	static constraints = {
		age min: 18
		name blank: false
	}
}
