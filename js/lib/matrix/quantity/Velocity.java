package quantity;


import config.Coefficient;
/**
 * Created by Sam on 12/15/14.
 */
public class Velocity {

    private Coefficient coefficient = new Coefficient();

    public double speedX;
    public double speedY;
    public double speedZ;

    public Velocity(double speedX, double speedY, double speedZ){
        this.speedX = speedX;
        this.speedY = speedY;
        this.speedZ = speedZ;
    }

    public Velocity scaleDown(){
        double speedX1 = this.speedX / coefficient.scaleConstant;
        double speedY1 = this.speedY / coefficient.scaleConstant;
        double speedZ1 = this.speedZ / coefficient.scaleConstant;
        return new Velocity(speedX1, speedY1, speedZ1);
    }

}
