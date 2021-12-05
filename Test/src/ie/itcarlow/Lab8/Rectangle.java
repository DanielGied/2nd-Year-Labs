package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Rectangle extends TwoDShape
{
	private double length;
    private double width;

    public Rectangle(String name, String colour, double length, double width)
    {
        super (name, colour);
        setLength(length);
        setWidth(width);
    }

    // Setter and Getter Methods
    private void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    private void setWidth(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    // Misc Methods
    public double area() 
    {
        return length * width;
    }

    // toString Method
    @Override
    public String toString()
    {
        return super.toString() + "\nLength: " + length + "\nWidth: " + width;
    }
}
