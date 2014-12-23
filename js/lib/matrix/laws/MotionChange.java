package laws;

import quantity.Position;
import quantity.Velocity;
import universe.Particle;
import config.Coefficient;
import laws.VelocityAddition;

/**
 * Created by Sam on 12/15/14.
 */
public class MotionChange {

    private Particle p;
    private Velocity additionalVelocity;

    private Coefficient coefficient = new Coefficient();

    public MotionChange(Particle p, Velocity additionalVelocity){
        this.p = p;
        this.additionalVelocity = additionalVelocity;
    }

    private void updatePosition(){
        double positionX = p.getPosition().getX() + p.getVelocity().speedX / coefficient.scaleConstant;
        double positionY = p.getPosition().getY() + p.getVelocity().speedY / coefficient.scaleConstant;
        double positionZ = p.getPosition().getZ() + p.getVelocity().speedZ / coefficient.scaleConstant;
        p.changePosition(new Position(positionX, positionY, positionZ));
    }

    private void updateVelocity(){
        VelocityAddition va = new VelocityAddition(p.getVelocity(), additionalVelocity.scaleDown());
        Velocity newVelocity = va.getResultVelocity();
        p.changeVelocity(newVelocity);
    }

    private void update(){
        updateVelocity();
        updatePosition();
    }

    public Particle getParticle(){
        update();
        return p;
    }

}
