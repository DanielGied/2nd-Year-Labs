package ie.itcarlow.Lab3;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class BankCustomer 
{
	private String customerName;
	private String customerAddress;
	private int numberOfAccounts = 0;
	private SavingsAccount[] savingsAccounts = new SavingsAccount[3];


	public BankCustomer(String customerName, String customerAddress)
	{
		setName(customerName);
		setAddress(customerAddress);
	}

	public void setName(String name) 
	{
		customerName = name; // Set name
	}	

	public void setAddress(String address)	
	{
		customerAddress = address; // Set Address
	}
	
	public String getName()	
	{
		return customerName;	// Get name
	}
	
	public String getAddress()	
	{
		return customerAddress;	// Get address
	}
	
	public int getNumberOfAccounts()
	{
		return numberOfAccounts; // Get number of accounts
	}
	
	public void addAccount(SavingsAccount newAccount)
	{
		if(numberOfAccounts < 3)
		{
			savingsAccounts[numberOfAccounts] = newAccount;
			numberOfAccounts++;
		}
	}
	
	/* public double totalBalance()
	{
		
	}*/

}