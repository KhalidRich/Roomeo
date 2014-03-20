package roomeo_dev

class HomeController {

    def index() { }
	def about() {
		redirect(controller:"AboutController",action:"index")
	}
	def signup() {
		redirect(controller:"SignupController",action:"index")
	}
	def signin() {
		redirect(controller:"SigninController",action:"index")
	}
	def index2() {
		
	}
}
