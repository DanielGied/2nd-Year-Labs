package ie.itcarlow.Lab7;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class AnimalTest {

	public static void main(String[] args) 
	{
		Vet vet  = new Vet("Daniel");
		
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();
		
		vet.vaccinate(cat);		
		System.out.println();
		vet.vaccinate(dog);

	}

}
