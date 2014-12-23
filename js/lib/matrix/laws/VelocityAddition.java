package laws;

import quantity.Velocity;

/**
 * Created by Sam on 12/15/14.
 */
public class VelocityAddition {

    private Velocity v1;
    private Velocity v2;

    public VelocityAddition(Velocity v1, Velocity v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public Velocity getResultVelocity(){
        double speedX = v1.speedX + v2.speedX;
        double speedY = v1.speedY + v2.speedY;
        double speedZ = v1.speedZ + v2.speedZ;
        return new Velocity(speedX, speedY, speedZ);
    }

}
