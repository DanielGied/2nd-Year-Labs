package ie.itcarlow.Lab7;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Dog extends Animal
{
	//Constructor
	public Dog(String type, int age, char gender) {
		super(type, age, gender);
	}
	
	//Misc methods
	public void eat() {
		System.out.println("The dog is eating");
	}
	
	public void sleep() {
		System.out.println("The dog is sleeping");
	}
	
	public void makeSound() {
		System.out.println("Woof woof");
	}
	
	//toString method
	public String toString() {
		return "Dog: " + super.toString();
	}

}
