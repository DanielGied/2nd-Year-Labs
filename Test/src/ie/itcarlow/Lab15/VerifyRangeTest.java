package ie.itcarlow.Lab15;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331 
//Date: March 05 2022 

import java.util.Scanner;

public class VerifyRangeTest 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int input = s.nextInt();
		Verifier verifier = new Verifier();
		
		try 
		{
			verifier.verifyIntRange(input, 1, 100);
		} 
		catch (MyOutOfRangeException MyOutOfRangeException) 
		{
			System.out.println(MyOutOfRangeException);
		}
		System.out.println();
		System.out.println();
		System.out.println("Please enter a password:");
		String password = s.next();
		try 
		{
			verifier.verifyPasswordStrength(password);
			System.out.println("Good password.");
		} 
		catch (MyInvalidPasswordException MyInvalidPasswordException) 
		{
			System.out.println(MyInvalidPasswordException);
		}	
	}
}