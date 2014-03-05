package roomeo_dev

class ProfileController {

	def index() { 
		
		/*DATA
		 * email
		 * first name, last name
		 * picture
		 * age
		 * gender
		 * area of study
		 * price range
		 * need/have apt
		 */
	}
	def matches() { 
		redirect(controller:"MatchesController",action:"index")
	}
	def search() {
		redirect(controller:"SearchController",action:"index")
	}
	def signout() {
		
	}
}
