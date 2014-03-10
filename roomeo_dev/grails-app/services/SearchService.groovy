package roomeo_dev

@Grab(group='com.gmongo', module='gmongo', version='0.9.3') 
import com.gmongo.GMongo 

class SearchService {
	def mongo = new Gmongo()
	def db = mongo.getDB(twerk) //twerk is the db name...

	def getUsers(filters) {

	}

	def searchUsersByLocation(user, location) {
		
	}
}