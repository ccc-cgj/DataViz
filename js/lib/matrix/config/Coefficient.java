package config;

/**
 * Created by Sam on 12/12/14.
 */
public class Coefficient {

    public Coefficient(){}

    public double gravitationalConstant = 1.0;

    public double massOverInfluence = 1.0;

    public double scaleConstant = 10000000.0;
    // This scale is set up to minimal the inaccuracy of the calculation due to the limit of n-body problem.
}
