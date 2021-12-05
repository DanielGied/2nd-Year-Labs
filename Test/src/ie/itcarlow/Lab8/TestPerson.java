package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class TestPerson 
{

	public static void main(String[] args) 
	{
		 Person e1 = new Employee("Daniel", 70000);

	     Person s1 = new Student("Barry", "Software Development");
	        
	     Person[] personList = {e1, s1};

	     for ( int i = 0; i < personList.length ; i++)
	     {
	    	 System.out.println("\nDetails of element: " + (i + 1));
	         System.out.println("Name: " + personList[i].getName());
	         System.out.println("Description: " + personList[i].getDescription());
	     }       
	}

}
