package ie.itcarlow.Lab3;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab3aq3 {

	public static void main(String[] args) 
	{
		BankCustomer bankCustomer = new BankCustomer("Daniel Giedraitis", "51 BrownesHill Rise");
		bankCustomer.addAccount(new SavingsAccount());
		BankCustomer bankCustomer2 = new BankCustomer("John Baker", "Carlow");
		bankCustomer2.addAccount(new SavingsAccount());
		
		System.out.println("---First Bank Customer---");
		System.out.println("Bank Customer name is: "+ bankCustomer.getName());
		
		System.out.println("Bank Customer address is: "+ bankCustomer.getAddress());
		
		System.out.println("Bank Customer has: " + bankCustomer.getNumberOfAccounts() + " account");
		
		System.out.println();
		
		System.out.println("---Second Bank Customer---");
		System.out.println("Bank Customer name is: "+ bankCustomer2.getName());
		
		System.out.println("Bank Customer address is: "+ bankCustomer2.getAddress());
		
		System.out.println("Bank Customer has: " + bankCustomer2.getNumberOfAccounts() + " account");
		
		
		
	}

}
