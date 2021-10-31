package ie.itcarlow.Lab4;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class ManagerCar 
{
	private String make;
	private int price;
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return make + " " + price;
	}
}

