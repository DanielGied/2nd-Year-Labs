package ie.itcarlow.Lab3;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab3aq2 
{

	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1 balance after interest is: " + saver1.getSavingsBalance());
		System.out.println("Saver2 balance after interest  is: " + saver2.getSavingsBalance());
		
		System.out.println();
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1 balance after interest is: " + saver1.getSavingsBalance());
		System.out.println("Saver2 balance after interest is: " + saver2.getSavingsBalance());
		

	}

}
