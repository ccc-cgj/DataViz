package object;

import java.util.*;

import object.Post;

/**
 * Created by Sam on 12/12/14.
 */
public class User {

    private List<Post> lstPost = new ArrayList<Post>();
    private String uid;
    private int friendNum;

    public User(String uid, int friendNum){
        this.uid = uid;
        this.friendNum = friendNum;
    }

    public void addPost(Post post){
        lstPost.add(post);
    }

    public double getRelativeInfluence(){
        double sumOfRelativeInfluence = 0.0;
        for (int i = 0; i < lstPost.size(); i++){
            Post post = lstPost.get(i);
            int absoluteInfluence = post.getAbsoluteInfluence();
            double relativeInfluence = absoluteInfluence / friendNum;
            sumOfRelativeInfluence += relativeInfluence;
        }
        return sumOfRelativeInfluence;
    }


}
