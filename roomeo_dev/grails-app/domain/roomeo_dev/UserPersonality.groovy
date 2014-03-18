package roomeo_dev

import java.lang.reflect.Field

class UserPersonality {
    User user
    
	Integer bedtime
	Integer wakeUp
	Integer numSocialEvents
	Integer bathroomCleanFreq
	Integer comfortTemp
	Integer numGuests
	Integer freqGuests
	LikertScale religion
	Double desiredLongitude
	Double desiredLatitude
	Address desiredLocation
	Boolean haveRoom
	Boolean needRoom
	Boolean dogFriendly
	Boolean catFriendly
	
	public Object getField(String field)
	{
	    Field member = this.getClass().getDeclaredField(field)
	    def ret
	    if (!member.isAccessible()) {
	        member.setAccessible(true)
	        ret = member.get(this)
	        member.setAccessible(false)
	    } else
	        ret = member.get(this)
	    return ret
	}
	
    static constraints = {
		bedtime range: 0..2400
		wakeUp range: 0..2400
    }
}
