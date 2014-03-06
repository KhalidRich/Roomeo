package roomeo_dev

class AboutController {

    def index() { 
		
	}
	def home() {
		redirect(controller:"HomeController",action:"index")
	}
	def signin(){
		redirect(controller:"SigninController",action:"index")
	}
	def signup() {
		redirect(controller:"SignupController",action:"index")
	}
}
