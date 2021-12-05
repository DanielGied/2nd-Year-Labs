package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Sphere extends ThreeDShape
{
	private double radius;
    
    public Sphere(String name, String colour, double radius)
    {
        super(name, colour);
        setRadius(radius);
    }

    // Setter and Getter Method
    private void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    // Misc Methods
    public double volume() // Volume of Sphere = 4/3 πr^3
    {
        double volume = 4 / 3 * (Math.PI * Math.pow(getRadius(), 3));
        return volume;
    }

    public double area() // Area of Sphere = 4πr^2
    {
        double area = 4 * (Math.PI * Math.pow(getRadius(), 2));
        return area;
    }

    // toString Method
    @Override
    public String toString()
    {
        return super.toString() + "\nRadius: " + getRadius();
    }
}
