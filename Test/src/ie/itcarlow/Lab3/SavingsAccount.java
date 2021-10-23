package ie.itcarlow.Lab3;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class SavingsAccount 
{
	private int accountNumber;
	private static int numberOfAccounts = 0;
	private static double annualInterestRate = 0;
	private double savingsBalance = 0;
	
	public SavingsAccount()
	{
		numberOfAccounts++;
		accountNumber = numberOfAccounts;
	}
	
	public void calculateMonthlyInterest()
	{
		setSavingsBalance(savingsBalance +(savingsBalance * annualInterestRate)/12);
	}
	
	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
	
	public void setSavingsBalance(double newBal)
	{
		savingsBalance = newBal;
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
