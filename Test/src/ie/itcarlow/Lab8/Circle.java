package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Circle extends Shape
{
	private double radius;
    
    public Circle(String name, String colour, double radius)
    {
        super (name, colour);
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

    // Misc Method
    public double area() 
    {
        return Math.PI * Math.pow(getRadius(), 2);    
    }
    
    // toString Method
    @Override
    public String toString()
    {
        return super.toString() + "\nRadius: " + getRadius();
    }
}
