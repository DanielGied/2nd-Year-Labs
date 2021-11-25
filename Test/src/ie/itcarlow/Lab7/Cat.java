package ie.itcarlow.Lab7;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Cat  extends Animal
{
	//Constructor
	public Cat(String type, int age, char gender) {
		super(type, age, gender);
		
	}
	
	//Misc methods
	public void eat() {
		System.out.println("The cat is eating");
	}
	
	public void sleep() {
		System.out.println("The cat is sleeping");
	}
	
	public void makeSound() {
		System.out.println("Purrrr");
	}
	
	//toString method
	public String toString() {
		return "Cat: " + super.toString();
	}
}
