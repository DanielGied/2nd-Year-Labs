package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Triangle extends TwoDShape
{
	private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height)
    {
        super(name, colour);
        setBase(base);
        setHeight(height);
    }

    // Setter and getter methods
    private void setBase(double base)
    {
        this.base = base;
    }

    public double getBase()
    {
        return base;
    }

    private void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    // Misc Method
    public double area() // Area of Triangle = 1/2 × b × h
    {
        double area = ( getBase() * getHeight() ) / 2;
        return area;
    }

    // toString Method
    @Override
    public String toString()
    {
        return super.toString() + "\nBase: " + getBase() + "\nHeight: " + getHeight();
    }
}
