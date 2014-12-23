/**
 * Created by Sam on 12/11/14.
 */

import laws.*;
import object.*;
import org.w3c.dom.ls.LSException;
import quantity.*;
import universe.Particle;
import java.util.*;

public class Main {
    public Main(){

    }

    private static List<Particle> constructParticles(){
        Post post1 = new Post(10000, 1);
        Post post2 = new Post(10000, 1);
        Post post3 = new Post(10000, 1);
        User user1 = new User("1", 1);
        User user2 = new User("2", 1);
        User user3 = new User("3", 1);
        user1.addPost(post1);
        user2.addPost(post2);
        user3.addPost(post3);
        Mass mass1 = new Mass(user1);
        Mass mass2 = new Mass(user2);
        Mass mass3 = new Mass(user3);
        // construct mass

        Velocity velocity1 = new Velocity(0.0,0.0,0.0);
        Velocity velocity2 = new Velocity(0.0,0.0,0.0);
        Velocity velocity3 = new Velocity(0.0,0.0,0.0);
        // construct velocity

        Position position1 = new Position(10.0, 0.0, 0.0);
        Position position2 = new Position(0.0, 10.0, 0.0);
        Position position3 = new Position(0.0, 0.0, 10.0);
        // construct position

        Particle p1 = new Particle(velocity1, mass1, position1);
        Particle p2 = new Particle(velocity2, mass2, position2);
        Particle p3 = new Particle(velocity3, mass3, position3);
        // construct particles

        List<Particle> lstParticle = new ArrayList<Particle>();
        lstParticle.add(p1);
        lstParticle.add(p2);
        lstParticle.add(p3);

        return lstParticle;
    }

    private static Velocity sumOfGravitationalPotential(List<Particle> lstParticle, Particle particle){
        List<Velocity> lstV = new ArrayList<Velocity>();
        for (int i = 0; i < lstParticle.size(); i++){
            Particle thisParticle = lstParticle.get(i);
            if (!thisParticle.equals(particle)){
                Gravitation gravitation = new Gravitation(particle, thisParticle);
                Velocity v = gravitation.getGravitationalPotentialVelocity(1);
                lstV.add(v);
            }
        }
        Velocity resultantVelocity = new SumOfVelocity(lstV).getResult();
        return resultantVelocity;
    }

    public static List<Particle> updateAllMotion(List<Particle> lstParticle){
        List<Particle> resultantParticleList = new ArrayList<Particle>();
        for (int i = 0; i < lstParticle.size(); i++){
            Particle p = lstParticle.get(i);
            MotionChange motionChange = new MotionChange(p, sumOfGravitationalPotential(lstParticle, p));
            p = motionChange.getParticle();
            resultantParticleList.add(p);
        }
        return resultantParticleList;
    }

    private static void printPositionInAList(List<Particle> lstParticle){
        for (int i = 0; i < lstParticle.size(); i++){
            Particle p = lstParticle.get(i);
            p.printPosition();
        }
    }

    public static void run(){

        List<Particle> lstParticle = constructParticles();

        printPositionInAList(lstParticle);
        System.out.println("------------");
        for (int i = 0; i < 10000000; i++){
            lstParticle = updateAllMotion(lstParticle);
            if (i % 100000 == 0) {
                printPositionInAList(lstParticle);
                System.out.println("------------");
            }
        }

    }

    public static void main(String[] args){
        run();
    }

}
