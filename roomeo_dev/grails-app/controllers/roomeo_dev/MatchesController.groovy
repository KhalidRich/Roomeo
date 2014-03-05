package roomeo_dev

class MatchesController {

    def index() { }
	def profile() {
		redirect(controller:"ProfileController",action:"index")
	}
	def search() {
		redirect(controller:"SearchController",action:"index")
	}
}
