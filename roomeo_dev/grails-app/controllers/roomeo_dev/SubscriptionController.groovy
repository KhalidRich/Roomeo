package roomeo_dev

import java.util.Map;

class SubscriptionController {
	def emailConfirmationService
	
    def index() {
		
	}
	
	def subscribe = { 
		// this is where the user is created
		def userId = User.crayUser(params.username, params.password)
		def user = User.getUserFromID(userId)
		user.email = params.schoolemail
//		if(userId >= 0){
//			User.addUserAttributes(userId, [email:params.schoolemail])
//		}
//		// notify user that this username has already been used
//		else if(userId == -1){
//			def errorMessage = "This user exists, try again!"
//			[errorMessage:errorMessage]
//		}
//		// notify error occurred
//		else{
//			def errorMessage = "Please enter a valid username/password"
//			[errorMessage:errorMessage]
//		}
		
		// Send the email confirmation
		emailConfirmationService.sendConfirmation([
		to: params.schoolemail,
		from: 'noreply@roomeo.com',
		subject: 'Confrim Roomeo Membership!',
		event: 'signup',
		eventNamespace: 'roomeo_dev',
		view: "/mailtemplates/_signup_confirmation",
		model: [promoBrandName:'Roomeo']
		])
		
	}
	
	def welcome = {
		
	}
	
	def oops = {
		
	}
	
	def invalid = {
	}
	
	
	
}
