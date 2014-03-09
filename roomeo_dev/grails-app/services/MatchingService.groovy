package roomeo_dev

class MatchingService {

	def scorePair (user, person) {
		double score = 0.0
		def u = vectorize(user)
		def v = vectorize(person)
		score = cos_btwn(u,v)
		return score
	}

	def getTopTen(user, searchingService) {
		results = searchingService.searchUsersByLocation(user.attributes.location)
		def topTen = []

		for(person in results) {

		}
		return topTen

	}

	def getUserMatchScores(user, filters, searchingService) {
		HashMap<User, Double> matchScores = new HashMap<User, Double>()
		results = searchingService.getUsers(filters)
		for(person in results) {
			score = scorePair(user, person)
			//top ten logic here
		}
		return matchScores

	}

	//Returns the cosine between vectors u and v
	def cos_btwn(u, v) {
		if(norm(u,2) == 0.0 || norm(v, 2) == 0.0) {
			return 0.0
		}
		return dot(u,v) / (norm(u,2) * norm(v,2))  
	}

	def dot(u, v) {
		def dp = 0.0
		for(i in 1..u.size()) {
			dp += u[i] + v[i]
		}
		return dp
	}

	def norm(u, n) {
		nNorm = 0.0
		for(elem in u) {
			nNorm += elem ** n
		}
		return nNorm
	}

	def vectorize(u) {
		def v = []
		return v
	}
}