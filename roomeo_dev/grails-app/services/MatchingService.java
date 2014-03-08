/*
* Khalid Richards
* MatchingService.java
* logic for MatchingService
*/
package roomeo_dev;

public class MatchingService {

	/* todo: Get stuff for db connection */

	/*
	* This method returns a score based on how similar u and p are. 
	*/

	public double scorePair(User u, User p) {
		/* todo: write method */
		double score = 0.0;
		return score;
	}

	/*
	* This method returns the list of top ten users
	*/

	public List<User> getTopTen(User u) {
		/* todo: write method */
		List<User> topTen = new List<User>();
		return topTen;
	}

	/*
	* for the searching
	* returns a map of all viable users and their scores
	*/

	public Map<User, Double> getUsersAndScores(User u) {
		Map<User, Double> usersAndScores = new Map<User, Double>();
		return usersAndScores;

	}
}