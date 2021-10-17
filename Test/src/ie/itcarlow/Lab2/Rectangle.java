package ie.itcarlow.Lab2;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class Rectangle 
{
	private int length;
	private int width;
	private String star="";
	private String space="";
	
	public Rectangle()
	{
		setLength(1);
		setWidth(1);
	}
	
	//Set methods for length and width
	public void setLength(int newLength) 
	{
		if(newLength > 0.0 && newLength <= 40.0)
		{
			length = newLength;
		}
	}
	
	public void setWidth(int newWidth) 
	{
		if(newWidth > 0.0 && newWidth <= 40.0)
		{
			width = newWidth;
		}
	}
	
	//Get methods for length and width
	public double getLength() 
	{
		return length;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	//Print statement for Q1 "Length=5, Width=10"
	public String toString()
	{
		return "Length: " + length + ", " + "Width: " + width;
	}
	
	//Get methods for Area and Perimeter
	public int getArea()
	{
		return length * width;
	}
	
	public int getPerimeter()
	{
		return length + length + width + width;
	}
	
	//Method prints out the rectangle using "*"
	public void printRectangle()
    {
		for(int index = 0; index < getWidth(); index++)
		{
			star += "*";
		}
		
		System.out.println(star);
		
		for(int index = 0; index < getWidth()-1; index++)
		{
			space += " ";
		}
		for (int index = 0; index < getLength()-2; index++)
		{
	          System.out.println("*" + space + "*");
	    }
		
		System.out.println(star);
      
    }
}
