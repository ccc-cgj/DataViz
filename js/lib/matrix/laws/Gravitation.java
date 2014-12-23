package laws;

import config.Coefficient;
import quantity.*;
import universe.*;

/**
 * Created by Sam on 12/11/14.
 */
public class Gravitation {

    private Coefficient coefficient = new Coefficient();

    private Mass mass1;
    private Mass mass2;
    private double G = coefficient.gravitationalConstant;
    private Distance distance;

    private Particle p1;
    private Particle p2;

    public Gravitation(Mass mass1, Mass mass2, Distance distance){
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.distance = distance;
    }

    public Gravitation(Particle p1, Particle p2){
        this.mass1 = p1.getMass();
        this.mass2 = p2.getMass();
        this.distance = new Distance(p1, p2);

        this.p1 = p1;
        this.p2 = p2;
    }

    public double getGravitationalForce(){
        double gravity = G * mass1.getMass() * mass2.getMass() / Math.pow(distance.getDistance(), 2);
        return gravity;
    }

    public Velocity getGravitationalPotentialVelocity(int whichOne, Position p1, Position p2){
        // GV = G * M / r^2
        double bigM = mass1.getMass();
        // if whichOne == 1, it means Mass1, vice versa.
        if ( whichOne == -1 ){
            bigM = mass2.getMass();
        }
        double gravitationalPotential = G * bigM / Math.pow(distance.getDistance(), 2);
        double doubleDistance = whichOne * distance.getDistance();

        double speedX = (p2.getX() - p1.getX()) / doubleDistance * gravitationalPotential;
        double speedY = (p2.getY() - p1.getY()) / doubleDistance * gravitationalPotential;
        double speedZ = (p2.getZ() - p1.getZ()) / doubleDistance * gravitationalPotential;

        return new Velocity(speedX, speedY, speedZ);
    }

    public Velocity getGravitationalPotentialVelocity(int whichOne){
        return getGravitationalPotentialVelocity(whichOne, p1.getPosition(), p2.getPosition());
    }
}
