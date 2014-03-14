package roomeo_dev
import roomeo_dev.User;  
import roomeo_dev.Gender.*; 

class ProfileController {

	def index() { 
		System.out.println("index" + params.name);

	}
	def edit() {
		//redirect(controller:"ProfileController",action:"createuser")
	}
	def createuser(){
		def attrmap = [:];
		def name = params.name;
		if (name){
			attrmap["name"]= name; 
		}
		def age = params.age;
		if (age){
			attrmap["age"] = age.toInteger(); 
		}
		def gender = params.gender;
		if (gender){
			attrmap["gender"] = Gender.valueOf(gender); 
		}
		def college = params.college;
		if (college){
			attrmap["college"] = college;
		}
		def study = params.study;
		if(study){
			attrmap["study"] = study; 
		}
		def price = params.price;
		if(price){
			attrmap["price"] = price; 
		}
		System.out.println("edit" + attrmap);
		java.lang.Long userid = session.userID; 
		System.out.println("uid" + userid); 
		//ad user attrs
		Map map = [:];
		User.addUserAttributes(userid, map);
		
		redirect(controller:"SearchController",action:"index")
		
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
