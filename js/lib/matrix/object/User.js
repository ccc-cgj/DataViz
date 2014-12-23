function User(uid1, friendNum1){
    this.uid = uid1;
    this.friendNum = friendNum1;
    this.lstPost = [];

    this.addPost = function(newPost){
        this.lstPost[this.lstPost.length] = newPost;
    }
    this.getRelativeInfluence = function(){
        var sumOfRelativeInfluence = 0.0;
        for ( var i = 0; i < this.lstPost.length; i++ ){
            var post = this.lstPost[i];
            sumOfRelativeInfluence += post.getAbsoluteInfluence() / this.friendNum;
        }
        return sumOfRelativeInfluence;
    }
}