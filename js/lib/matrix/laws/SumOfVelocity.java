package laws;

import laws.VelocityAddition;
import quantity.Velocity;
import java.util.*;
/**
 * Created by Sam on 12/19/14.
 */
public class SumOfVelocity {

    List<Velocity> lstVelocity = new ArrayList<Velocity>();

    public SumOfVelocity(List<Velocity> lstVelocity){
        this.lstVelocity = lstVelocity;
    }

    public Velocity getResult(){
        Velocity v = lstVelocity.get(0);
        for (int i = 1; i < lstVelocity.size(); i++){
            v = new VelocityAddition(v, lstVelocity.get(i)).getResultVelocity();
        }
        return v;
    }

}
