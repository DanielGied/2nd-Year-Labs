package ie.itcarlow.Lab4;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class MyHR 
{
	private Employee[] employees = new Employee[5];
	private Office[] offices = new Office[3];
	
	public MyHR()
	{
		for(int i = 0; i < 3; i++)
		{
			offices[i] = new Office();
		}
	}
	
	public void listAllEmployees()
	{
		for(int i = 0; i < employees.length; i++)
		{
			System.out.println(employees[i]);
		}
	}
	
	public void listAllOffices()
	{
		for(int i = 0; i < offices.length; i++)
		{
			System.out.println(offices[i]);
		}
	}
	
}
