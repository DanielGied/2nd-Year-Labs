package ie.itcarlow.Lab4;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class Employee 
{
	private int employeeNum;
	private static int employeeRecordCount = 0;
	private String employeeRole; // Either "Staff or "Manager"
	private Address address;
	private ManagerCar car = null;
	
	public Employee()
	{
		setEmployeeNum(employeeRecordCount);
		employeeRecordCount++;
	}
	
	public void setEmployeeNum(int employeeNum)
	{
		this.employeeNum = 1000 + employeeNum;
	}
	
	public int getEmployeeNum()
	{
		return employeeNum;
	}
	
	public int getEmployeeRecordCount()
	{
		return employeeRecordCount;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public void setEmployeeRole(String employeeRole)
	{
		this.employeeRole = employeeRole;
	}
	
	public String getEmployeeRole()
	{
		return employeeRole;
	}
	
	public void setManagerCar(ManagerCar car)
	{
		this.car = car;
	}
	
	public ManagerCar getManagerCar()
	{
		return car;
	}
	
	public String toString()
	{
		return employeeNum + " " + employeeRecordCount + " " + address + " " + car + " " + employeeRole;
	}
	
}
