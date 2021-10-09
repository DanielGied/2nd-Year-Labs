package ie.itcarlow.Lab1;

// Student Name 	: Daniel Giedraitis
// Student Id Number: C00260331
// Date: October 2021
// Purpose: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
	} // end main
} // end class ThermTest
