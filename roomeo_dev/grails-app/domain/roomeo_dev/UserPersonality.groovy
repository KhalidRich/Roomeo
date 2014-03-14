package roomeo_dev

class UserPersonality {
	String bedtime
	String wakeUp
	String numSocialEvents
	String bathroomCleanFreq
	String comfortTemp
	String numGuests
	String freqGuests
	LikertScale religion
	Double desiredLongitude
	Double desiredLatitude
	List desiredLocation
	Boolean haveRoom
	Boolean needRoom
	Boolean dogFriendly
	Boolean catFriendly
	
    static constraints = {
		bedtime range: 0..2400
		wakeUp range: 0..2400
    }
}
