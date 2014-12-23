function Post(commentNum1, relatedFriendNum1){
    this.commentNum = commentNum1;
    this.relatedFriendNum = relatedFriendNum1;
    
    this.getAbsoluteInfluence = function(){
        return this.commentNum * this.relatedFriendNum;
    }
}
