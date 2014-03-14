package services
import roomeo_dev.User

class MatchingService
{
	final TIME_MAP = ["10PM":1, "12AM":2, "2AM":3, "12PM":4]
	final WAKE_UP_MAP = ["6AM":1, "10AM":2, "12AM":3, "4PM":4]
	final FREQ_MAP = ["1/daily":1, "1/weekly":2, "1/biweekly":3, "1/monthly":4]
	final RELIGIOUS_MAP = ["none":1, "somewhat":2, "mostimportant":3]

	def scorePair (user, person)
	{
		double score = 0.0
		def u = vectorize(user)
		def v = vectorize(person)
		score = cosBtwn(u,v)
		return (score + 1) / 2
	}

	/*def getTopTen(user) 
	{
		results = searchingService.searchUsersByLocation(user.attributes.location)
		def topTen = []

		for(person in results) {

		}
		return topTen
	}*/

	def getUserMatchScores(userId, params)
	{
		def user = User.find(id:userId)
		HashMap<User, Double> matchScores = new HashMap<User, Double>()

		def results = []
		
		if(user.personality == null) {
			results = User.find()
		} else { 
			results = trim(user.personality, params)
		}

		for(person in results) {
			score = scorePair(user, person)
			matchScores.put(user, score)
		}
		return matchScores
	}

	def trim(plty, params)
	{
		if(plty == null) {
			return User.find()
		}
		trimmed = User.find([(personality.desiredLocation):plty.desiredLocation, 
			(personality.dogFriendly):params.dogFriendly,
			(personality.catFriendly):params.catFriendly])

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

	def vectorize(personality) 
	{
		def vector = []
		vector.add(TIME_MAP[personality.bedtime])
		vector.add(WAKE_UP_MAP[personality.wakeup])
		vector.add(FREQ_MAP[personality.numSocialEvents])
		vector.add(FREQ_MAP[personality.bathroomCleanFreq])
		vector.add(FREQ_MAP[personality.freqGuests])
		vector.add(RELIGIOUS_MAP[personality.religion])

		return vector
	}
}