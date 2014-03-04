package roomeo_dev

class SignupController {

    def index() { }
	def home(){
		redirect(controller:"HomeController",action:"index")
	}
	def about() {
		redirect(controller:"AboutController",action:"index")
	}
	def signin() {
		redirect(controller:"SigninController",action:"index")
	}
	def signup(){
		
	}
}
