def userID = roomeo_dev.User.verifyUser("ma2799", "mountain")
def user = roomeo_dev.User.getUserFromID(userID)
user.email = "ma2799@gmail.edu"
user.save(flush: true)
