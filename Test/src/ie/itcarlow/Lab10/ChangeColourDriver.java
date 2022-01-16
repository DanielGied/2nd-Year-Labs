package ie.itcarlow.Lab10;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: January 2022

import javax.swing.JFrame;

public class ChangeColourDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(200, 200);
		changeColour.setVisible(true);

	}//end main

}//end class