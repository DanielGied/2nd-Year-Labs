package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Employee extends Person
{
	private double annualSalary;    

    public Employee(String name, double annualSalary)
    {
        super(name);
        setAnnualSalary(annualSalary);
    }

    // Setter and Getter Method
    private void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }
    
    // toString Method
    @Override
    public String getDescription()
    {
        return "An employee with a salary of: " + getAnnualSalary() + " euro";
    }
}
