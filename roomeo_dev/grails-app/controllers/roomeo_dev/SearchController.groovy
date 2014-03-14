package roomeo_dev

import grails.converters.JSON

class SearchController {

    def index() { 
		if(request.post){
			def users = new JSON([["Ruby", 1245, "Brooklyn,NY",98, "${resource(dir: 'images', file: 'ruby.jpg')}"],
								  ["Khalid", 1300, "Ridgewood,NY",54, "${resource(dir: 'images', file: 'khalid.jpg')}"],
								  ["Mark", 1345, "Asoria,NY",23, "${resource(dir: 'images', file: 'mark.jpg')}"],
								  ["Sabina", 1262, "Bedford,NY",68, "${resource(dir: 'images', file: 'sabina.jpg')}"],
								  ])
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
