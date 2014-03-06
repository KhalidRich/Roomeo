package roomeo_dev

class MatchesController {

    def index() { 
		
		/*DATA
		 * names
		 * pictures
		 * need/have apt
		 * age
		 * price range
		 */
	}
	def profile() {
		redirect(controller:"ProfileController",action:"index")
	}
	def search() {
		redirect(controller:"SearchController",action:"index")
	}
}
