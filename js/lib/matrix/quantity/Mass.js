function Mass(user1){
	this.user = user1;

	this.getMass = function(){
		return massOverInfluence * this.user.getRelativeInfluence();
	}
}