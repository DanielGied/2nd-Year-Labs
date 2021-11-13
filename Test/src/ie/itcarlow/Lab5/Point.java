package ie.itcarlow.Lab5;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Point 
{
	private int x;
    private int y;

    public Point(int x, int y) 
    {
        setX(x);
        setY(y);
    }

    // Getter & Setter methods
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
