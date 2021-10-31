package ie.itcarlow.Lab4;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class Address 
{
	private String street;
	private String city;
	private String county;
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCounty(String county)
	{
		this.county = county;
	}
	
	public String getCounty()
	{
		return county;
	}
	
	public String toString()
	{
		
		return street + " " + city + " " + county;
	}
	
	
	
}
