package roomeo_dev

import grails.converters.JSON
import MatchesController

class SearchController {
	MatchingService matchingService = new MatchingService()

    def index() { 
		if(request.post){
			def matches = matchingService.getUserMatchScores(session.userId, params)
			def users = new JSON([["sabina", 1245, "New York,NY"],["katrina", 1245, "Brooklyn,NY"]]);
			return [users: users]
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
