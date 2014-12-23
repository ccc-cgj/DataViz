package object;

/**
 * Created by Sam on 12/12/14.
 */
public class Post {

    private int commentNum;
    private int relatedFriendNum;

    public Post(int commentNum, int relatedFriendNum){
        this.commentNum = commentNum;
        this.relatedFriendNum = relatedFriendNum;
    }

    public int getCommentNum(){
        return commentNum;
    }

    public int getRelatedFriendNum(){
        return relatedFriendNum;
    }

    public int getAbsoluteInfluence(){
        return commentNum * relatedFriendNum;
    }

}
