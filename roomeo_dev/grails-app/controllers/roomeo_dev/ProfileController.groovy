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
	def edit() {
//		System.out.println("hi");
		def attrmap = []; 
//		
		def name = params.name;
		if (name){
		   assert attrmap == ["name": name];
		}
//		def age = params.age;
//		if (age){
//		   assert attrmap == ["age": age];
//		}
//		def gender = params.gender;
//		if (gender){
//		   assert attrmap == ["gender": gender];
//		}
		System.out.println("hey" + attrmap);
//		
//		redirect(controller:"MatchesController",action:"index")
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
