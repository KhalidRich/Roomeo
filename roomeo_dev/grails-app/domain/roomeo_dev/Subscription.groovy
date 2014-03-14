package roomeo_dev

class Subscription {
	String email
	boolean optedIn
	
    static constraints = {
		email(email:true)
    }
}
