package roomeo_dev

class UserPersonality {
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
	
    static constraints = {
		bedtime range: 0..2400
		wakeUp range: 0..2400
    }
}
