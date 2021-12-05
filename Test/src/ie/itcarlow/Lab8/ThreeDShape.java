package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
