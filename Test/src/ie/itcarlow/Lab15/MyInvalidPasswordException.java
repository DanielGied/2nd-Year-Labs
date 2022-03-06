package ie.itcarlow.Lab15;

//Student Name:Daniel Giedraitis
//Student Id Number:C00260331 
//Date:March 05 2022 

public class MyInvalidPasswordException extends Exception 
{
	public MyInvalidPasswordException() 
	{
		super("Password is not strong enough!, Must be atleast 8 characters");
	}
}
