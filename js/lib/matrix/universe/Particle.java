package universe;

import quantity.*;

/**
 * Created by Sam on 12/15/14.
 */
public class Particle {

    private Velocity velocity;
    private Mass mass;
    private Position position;

    public Particle(Velocity velocity, Mass mass, Position position) {
        this.velocity = velocity;
        this.mass = mass;
        this.position = position;
    }

    public void changeVelocity(Velocity newVelocity){
        this.velocity = newVelocity;
    }

    public void changeMass(Mass newMass){
        this.mass = newMass;
    }

    public void changePosition(Position newPosition){
        this.position = newPosition;
    }

    public Velocity getVelocity(){
        return velocity;
    }

    public Mass getMass(){
        return mass;
    }

    public Position getPosition(){
        return position;
    }

    public void printPosition(){
        System.out.println("My position is:");
        System.out.println("x = " + position.getX() + "; y = " + position.getY() + "; z = " + position.getZ());
        System.out.println("");
    }

}
