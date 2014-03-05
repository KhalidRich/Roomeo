package roomeo_dev

class SigninController {

    def index() { 
		
		/*DATA
		 * log-in info: email and password
		 */
	}
	def home() {
		redirect(controller:"HomeController",action:"index")
	}
	def about() {
		redirect(controller:"AboutController",action:"index")
	}
	def profile(){
		redirect(controller:"ProfileController",action:"index")
	}
	def signin(){
		
	}
}
