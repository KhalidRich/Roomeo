def userid = roomeo_dev.User.verifyUser("ma2799", "mountain")
roomeo_dev.User.addUserAttributes(userid, ["name":"Mark Aligbe"])
def user = roomeo_dev.User.getUserFromId(userid)
if (user.validate())
    user.save(flush:true)


