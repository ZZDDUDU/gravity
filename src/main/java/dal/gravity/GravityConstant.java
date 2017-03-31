package dal.gravity;

public class GravityConstant implements GravityModel{

    public static final double EARTHGRAVITY = 9.80665;
    public static final double JUPITERGRAVITY = 25;

    private double gravity;
    public double getGravitationalField() {
	        return gravity;
    }
    
    public GravityConstant(double gravity) {
        this.gravity = gravity;
    }
   
}
