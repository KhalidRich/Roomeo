package roomeo_dev

class UserMatch {
	Long userId
	Double compatibility
    
    
    static belongsTo = [user: User]
	static constraints = {
		userId nullable: false, unique: true
		compatibility nullable: false, range: 0.0..1.0
	}
}

