package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public abstract class Person 
{
	private String name;
    
    public Person(String name)
    {
        setName(name);
    }

    // Getter and Setter Method
    private void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract String getDescription();

}
