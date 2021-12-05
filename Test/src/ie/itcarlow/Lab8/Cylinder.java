package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Cylinder extends ThreeDShape
{
	private double height;
    private double radius;

    public Cylinder(String name, String colour, double radius, double height) 
    {
        super(name, colour);
        setRadius(radius);
        setHeight(height);
    }

    // Setter and Getter Methods
    private void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    private void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    // Misc Methods
    public double volume() // Volume of Cylinder = πr^2h
    {
        double volume = (Math.PI * Math.pow(getRadius(), 2)) * getHeight() ;  
        return volume;
    }

    public double area() // Area of Cylinder = 2πrh+2πr^2
    {
        double area = (2 * Math.PI * getRadius() * getHeight()) + (2 * (Math.PI * Math.pow(    getRadius(), 2   ) ) );
        return area;
    }

    // toString Method
    @Override
    public String toString()
    {
        return super.toString() + "\nRadius: " + getRadius() + "\nHeight: " + getHeight();
    }
}
