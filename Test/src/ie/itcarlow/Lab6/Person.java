package ie.itcarlow.Lab6;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Person 
{
	// Variables
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
       this.name = name;
       this.address = address;
    }

    // Getters & Setters
    public String getName() {
       return name;
    }
    public String getAddress() {
       return address;
    }
    
    public void setAddress(String address) {
		this.address = address;
	}

	//toString
    public String toString() {
       return name + "(" + address + ")";
    }
}
