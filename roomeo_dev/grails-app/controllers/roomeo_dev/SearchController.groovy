package roomeo_dev

import grails.converters.JSON
import services.MatchingService

class SearchController {
	MatchingService matchingService = new MatchingService()

    def index() 
    { 
			def matches = matchingService.getUserMatchScores(session.userId, params)
			def kvPairs = matches.entrySet().toArray()
			def users = []

			for(pair in kvPairs) {
				def u = []
				def user = pair.getKey()
				u.add(user.uname)
				u.add(pair.getValue())
				users.add(u)
			}
			//def users = new JSON([["sabina", 1245, "New York,NY"],["katrina", 1245, "Brooklyn,NY"]]);
			return [users: new JSON(users)]
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
