package services

import roomeo_dev.User
import roomeo_dev.LikertScale

class MatchingService
{

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
		def user = User.getUserFromId(userId)
		HashMap<User, Double> matchScores = new HashMap<User, Double>()

		def personality = User.getUserPersonality(userId)
		def results = trim(params)

		println results == null

		if(results == null) {
			return null
		}

		for(person in results) {
			score = scorePair(user, person)
			matchScores.put(user, score)
		}
		return matchScores
	}

	def trim(params)
	{
		def trimmed = User.findByDesiredLocation(params.location)
		/*([(personality.desiredLocation):plty.desiredLocation, 
			(personality.dogFriendly):params.dogFriendly,
			(personality.catFriendly):params.catFriendly])*/

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

	def nNorm(u, n) 
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
		vector.add(personality.bedtime)
		vector.add(personality.wakeup)
		vector.add(personality.numSocialEvents)
		vector.add(personality.bathroomCleanFreq)
		vector.add(personality.freqGuests)
		vector.add(LikertScale.getValue(personality.religion))

		return vector
	}
}