package quantity;

import object.User;
import config.Coefficient;
/**
 * Created by Sam on 12/12/14.
 */
public class Mass {

    private User user;

    public Mass(User user){
        this.user = user;
    }

    public double getMass(){
        Coefficient coefficient = new Coefficient();
        double mass = coefficient.massOverInfluence * user.getRelativeInfluence();
        return mass;
    }
}