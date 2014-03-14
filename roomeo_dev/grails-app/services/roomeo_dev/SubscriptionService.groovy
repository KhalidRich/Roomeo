package roomeo_dev

import grails.transaction.Transactional
import grails.events.Listener


@Transactional
class SubscriptionService {

    @Listener(namespace='plugin.emailConfirmation', topic='confirmed')
		def userConfirmedSubscription(confirmation) {
			def user = User.findByEmail(confirmation.email)
				if (subscription) {
					user.verified = true
					return [controller:'subscription', action:'welcome']
				} else {
				log.error "We don't have any record of this user"
				return [controller:'subscription', action:'oops']
				}
		}
		
	@Listener(namespace='plugin.emailConfirmation', topic='invalid')
		def invalidUserConfirmedSubscription(info) {
		log.warn "Invalid confirmation received for token [${info.token}]"
		return [controller:'subscription', action:'invalid']
	}
		
}
