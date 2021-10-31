package ie.itcarlow.Lab4;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class Office 
{
	private static int roomCount = 0;
	private int roomNumber;
	private Employee[] assignedEmployees = new Employee[2];
	
	public Office()
	{
		setRoomNumber(roomCount);
		roomCount++;
	}
	

	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = 100 + roomNumber;
	}
	
	public int getRoomNumber() 
	{
		return roomNumber;
	}
	
	public void assignEmployeeToOffice(Employee employee)
	{
		if(assignedEmployees.length >= 2)
		{
			System.out.println("Office can only have 2 Employees");
		}
		else 
		{
			assignedEmployees[assignedEmployees.length] = employee;
		}
	}
	
	public String toString()
	{
		return roomCount + " " + roomNumber;
	}
}
