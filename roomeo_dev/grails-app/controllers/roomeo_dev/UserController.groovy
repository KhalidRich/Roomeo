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
//			if(User.getUserFromID(uid).verfied){
//				return
//			}
//			else{
//				def errorMessage = "Please register!"
//				[errorMessage:errorMessage]
//			}
			redirect(controller:'profile', action:'index')
		}
		else{
			def errorMessage = "Invalid username/password. Try again!"
			[errorMessage:errorMessage]
			redirect(controller:'home', action:'index')
		}
	}
	def logout() {
		session.userId = null
		redirect(controller:'home', action: 'index')	
	}
	def register(){
			System.out.println("in here")
			def userId = User.crayUser(params.username, params.password)
			if(userId >= 0){
				def user = User.getUserFromID(userId)
				user.email = params.schoolemail
				session.userId = userId
				redirect(controller:'search', action: 'index')
				return
			}
			// notify user that this username has already been used
			else if(userId == -1){
				def errorMessage = "This user exists, try again!"
				redirect(controller:'subscription', action: 'index', params: [errorMessage:errorMessage])
			}
			// notify error occurred
			else{
				def errorMessage = "Please enter a valid username/password"
				[errorMessage:errorMessage]
				redirect(controller:'subscription', action: 'index', params: [errorMessage:errorMessage])
			}
	}
}
