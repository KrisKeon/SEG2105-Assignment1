public class PointCP2 extends PointCP5{

    //Stores polar coordinates only

    private double rho;

    private double theta;

    //Constructor
    public PointCP2(double rho, double theta){

        this.rho = rho;

        this.theta = theta;
    }

    //Instance Methods

    //Instance methods **************************************************


    public double getX()
    {

        return (Math.cos(Math.toRadians(this.theta)) * this.rho);
    }

    public double getY()
    {

        return (Math.sin(Math.toRadians(this.theta)) * this.rho);
    }

    public double getRho()
    {
        return this.rho;
    }

    public double getTheta()
    {
        return this.theta;
    }


    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public void convertStorageToPolar()
    {
       //Points are already Polar
        System.out.println("Points are already in polar coordinates.");
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public void convertStorageToCartesian()
    {
        //Calculate X and Y
        double temp = getX();
        this.theta = getY();
        this.rho = temp;

    }
}
