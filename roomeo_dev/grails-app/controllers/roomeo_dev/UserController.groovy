package roomeo_dev

class UserController {

    def index() { }
	def home(){
		redirect(controller:"HomeController",action:"index")
	}
	def about() {
		redirect(controller:"AboutController",action:"index")
	}
	def login() {
//		redirect(controller:"SigninController",action:"index")
//		render "login succeed"
		// add simple validation to check username and password sent from client
		// all parameters sent from client is stored in variable named params
		if(params.username == "admin" && params.password=="pass"){
			flash.message = "login succeed"
			session.user = params.username
			redirect(controller: 'profile', action: 'index')
			}
		else{
			flash.message = "login failed"
			redirect(controller: 'home', action: 'index')
		}
	}
	def logout() {
		session.user = null
		redirect(controller:'home', action: 'index')	
	}
	def signup(){
		
	}
}
