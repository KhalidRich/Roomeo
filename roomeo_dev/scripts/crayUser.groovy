def userid = roomeo_dev.User.verifyUser("ma2799", "mountain")
roomeo_dev.User.addUserAttributes(userid, ["name":"Mark Aligbe"])
def user = roomeo_dev.User.getUserFromId(userid)
if (user.validate())
    user.save(flush:true)

_________________________________________________________________

def address = roomeo_dev.Address.getAddressFromString("7508 Lerner Hall, 2920 Broadway, New York, New York, 10027")
def userid = roomeo_dev.User.verifyUser("ma2799","mountain")
address.getDomainClass().getPersistentProperties().each {
    def field = it.getName()
    print "${it.getName()}: "
    print address."$field"
    println ""
}
println ""
println roomeo_dev.Address.setUserAddress(userid, address)
