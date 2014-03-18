package roomeo_dev
import roomeo_dev.User.*;
import roomeo_dev.Gender.*;

class ProfileController {

	def index() {
		java.lang.Long userid = session.userId;

		if(userid){
			def attrmap = (User.getUserFromID(userid)).attributes;
			def name = attrmap["name"];
			def age = attrmap["age"];
			def gender = attrmap["gender"];
			def college = attrmap["college"];
			def study = attrmap["study"];
			def desired = attrmap["desiredLocation"];
			def startprice = attrmap["startPriceRange"];
			def endprice = attrmap["endPriceRange"];
			["name":name, "age":age, "gender":gender, "college": college, "study": study, "desired": desired, "startprice": startprice, "endprice":endprice];
		}
		
		System.out.println("atts" + attrmap);
		//System.out.println("index" + params.name);

	}
	def edit() {
		//redirect(controller:"ProfileController",action:"createuser")
	}
	def createuser(){
		java.lang.Long userid = session.userId;
		def attrmap = [:];
		def permap = [:];
		
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
			def (minPrice, maxPrice) = price.tokenize( '-' )
			attrmap["startPricerRange"] = minPrice.toDouble();
			attrmap["endPriceRange"]	= maxPrice.toDouble(); 	
		}
		System.out.println("edit" + attrmap);
		//ad user attrs
		User.addUserAttributes(userid, attrmap);

		def bedtime = params.bedtime;
		if(bedtime){
			permap["bedtime"]= bedtime.toInteger();
		}
		def wakeup = params.wakeup;
		if(wakeup){
			permap["wakeUp"]= wakeup.toInteger();
		}
		def clean = params.clean;
		if(clean){
			permap["cleanliness"] = clean.toInteger();
		}
		def desired = params.desired;
		if(desired){
			permap["desiredLocation"] = desired;
		}
		def stay = params.stay;
		if(stay){
			permap["stay"] = stay;
		}
		def room = params.room;
		if(room){
			Boolean have, need;
			if(room =="have"){
				permap["haveRoom"] = true;
				permap["needRoom"] =false; 
			}
			if(room == "need"){
				permap["haveRoom"] = false;
				permap["needRoom"] = true;
			}
		}
		def guests = params.guests;
		if(guests){
			permap["freqGuests"] = guests.toInteger();
		}
		def religious = params.religious;
		if(religious){
			permap["religion"] = religious;
		}
		User.addUserPersonalities(userid, permap);
		//System.out.println("permap" + permap);
		
		redirect(view:"index")
	
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
