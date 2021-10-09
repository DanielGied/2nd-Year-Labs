package ie.itcarlow.Lab1;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab1q1 {

	public static void main(String[] args) 
	{
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		Thermometer thermB = new Thermometer(10.0);
		double tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB);

	}

}
