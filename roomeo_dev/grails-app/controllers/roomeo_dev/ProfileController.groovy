package roomeo_dev

class ProfileController {

	def index() { }
	def matches() { 
		redirect(controller:"MatchesController",action:"index")
	}
	def search() {
		redirect(controller:"SearchController",action:"index")
	}
	def signout() {
		
	}
}
