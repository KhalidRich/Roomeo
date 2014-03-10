package roomeo_dev

class SubscriptionController {
	def emailConfirmationService
	
    def index() {
		
	}
	
	def subscribe = { 
//		if (form.hasErrors()) {
//		// We wouldn't do this in real life
//		redirect(action:'index')
//		return
//		}
		System.out.print(params.schoolemail)
		def subscription = new Subscription(email:params.schoolemail)
		subscription.save()
		
		// Send the email confirmation
		emailConfirmationService.sendConfirmation([
		to: params.schoolemail,
//		from: 'noreply@roomeo.com',
		subject: 'Confrim Roomeo Membership!'
		])
		
	}
	
	def welcome = {
		
	}
	
	def oops = {
		
	}
	
	def invalid = {
	}
	
	
	
}
