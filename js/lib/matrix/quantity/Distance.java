package quantity;

import universe.Particle;

/**
 * Created by Sam on 12/12/14.
 */
public class Distance {

    private double distance;

    public Distance (Particle p1, Particle p2){
        this.distance = Math.pow(
                Math.pow( p1.getPosition().getX() - p2.getPosition().getX(), 2 ) +
                Math.pow( p1.getPosition().getY() - p2.getPosition().getY(), 2 ) +
                Math.pow( p1.getPosition().getZ() - p2.getPosition().getZ(), 2 ), 0.5 );

    }

    public double getDistance(){
        return distance;
    }
}
