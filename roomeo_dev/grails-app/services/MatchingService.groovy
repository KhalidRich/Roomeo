package roomeo_dev
import User

class MatchingService
{

	def scorePair (user, person)
	{
		double score = 0.0
		def u = vectorize(user)
		def v = vectorize(person)
		score = cosBtwn(u,v)
		return score
	}

	def getTopTen(user) 
	{
		results = searchingService.searchUsersByLocation(user.attributes.location)
		def topTen = []

		for(person in results) {

		}
		return topTen
	}

	def getUserMatchScores(userId, params)
	{
		def user = User.find({id = userId})
		HashMap<User, Double> matchScores = new HashMap<User, Double>()
		results = trim(user.personality, params)
		for(person in results) {
			score = scorePair(user, person)
		}
		return matchScores
	}

	def trim(plty, params)
	{
		trimmed = User.find({personality.desiredLocation : plty.desiredLocation}, 
			{personality.dogFriendly : params.dogFriendly},
			{personality.catFriendly : params.catFriendly})

		return trimmed
	}

	//Returns the cosine between vectors u and v
	def cosBtwn(u, v) 
	{
		if(norm(u,2) == 0.0 || norm(v, 2) == 0.0) {
			return 0.0
		}
		return dot(u,v) / (norm(u,2) * norm(v,2))  
	}

	def dot(u, v) 
	{
		def dp = 0.0
		for(i in 1..u.size()) {
			dp += u[i] + v[i]
		}
		return dp
	}

	def norm(u, n) 
	{
		nNorm = 0.0
		for(elem in u) {
			nNorm += elem ** n
		}
		return nNorm
	}

	def vectorize(u) 
	{
		
	}
}