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
		int uid = User.verifyUser(params.username, params.password)
		if(uid >= 0 ){
			session.userId = uid
			if(User.getUserFromID(uid).verfied){
				return
			}
			else{
				def errorMessage = "Please register!"
				[errorMessage:errorMessage]
			}
		}
		else{
			def errorMessage = "Invalid username/password. Try again!"
			[errorMessage:errorMessage]
		}
	}
	def logout() {
		session.userId = null
		redirect(controller:'home', action: 'index')	
	}
	def register(){
		redirect(controller:'subscription', action:'index')
	}
}
