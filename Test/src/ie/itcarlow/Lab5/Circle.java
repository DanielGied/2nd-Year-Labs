package ie.itcarlow.Lab5;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Circle extends Point
{
	private double radius;

    public Circle(int x, int y, int radius) 
    {
        super(x, y);
        setRadius(radius);
    }


    //Getter & Setter method
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getX()=" + getX() + ", getY()=" + getY() + "]";
    }
}
