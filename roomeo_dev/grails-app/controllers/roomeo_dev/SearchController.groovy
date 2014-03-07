package roomeo_dev

class SearchController {

    def index() { 
		if(request.post){
			def user1 = ["Sabina", 2343, "New York, NY"]
			def user2 = ["Sally", 2343, "Ithca, NY"]
			def users = [user1, user2]
			[users: users]
		}
	}
	def profile() {
		redirect(controller:"ProfileController",action:"index")
	}
	def matches() {
		redirect(controller:"MatchesController",action:"index")
	}
	def test(){
		
	}
	
//	def getsearchmatches(){
//		render('../test/index')
//		return
////		render(view:"home")
////		redirect(view:"index")
////		redirect(template: "book", collection: [b1, b2, b3])
//	}
}
