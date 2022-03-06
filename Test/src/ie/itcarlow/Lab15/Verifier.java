package ie.itcarlow.Lab15;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331 
//Date: March 05 2022 

public class Verifier 
{
	private MyOutOfRangeException MyOutOfRangeException;
	private MyInvalidPasswordException MyInvalidPasswordException;
	
	public Verifier()
	{
		MyOutOfRangeException = new MyOutOfRangeException();
		MyInvalidPasswordException = new MyInvalidPasswordException();
	}
	
	public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException
	{
		if(value < low || value > high) 
		{
			throw MyOutOfRangeException;
		} 
		else 
		{
			System.out.print("Number in range!!!");
		}	
	}
	
	public void verifyPasswordStrength(String password) throws MyInvalidPasswordException 
	{
		if(password.length() < 8) 
		{
			throw MyInvalidPasswordException;
		}
	}
}
