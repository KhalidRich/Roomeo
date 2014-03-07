package roomeo_dev

class SearchController {

    def index() { 
		
	}
	def profile() {
		redirect(controller:"ProfileController",action:"index")
	}
	def matches() {
		redirect(controller:"MatchesController",action:"index")
	}
	def test(){
		
	}
	
	def getsearchmatches(){
		render('index')
		return
//		render(view:"home")
//		redirect(view:"index")
//		redirect(template: "book", collection: [b1, b2, b3])
	}
}
