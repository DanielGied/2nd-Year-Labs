package ie.itcarlow.Lab13;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: February 2022

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Lab13 
{
	final static Dimension MAX_SIZE = new Dimension(350, 130);

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(MAX_SIZE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		String[] items = new String[]{"RED"};
		JComboBox<String> comboBox = new JComboBox<String>(items);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		JCheckBox cb1 = new JCheckBox("background");
		JCheckBox cb2 = new JCheckBox("foreground");
		
		panel.add(cb1);
		panel.add(cb2);
		panel.setMaximumSize(MAX_SIZE);
		
		JPanel panel2 = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		JButton b1 = new JButton("Ok");
		JButton b2 = new JButton("Cancel");
		
		panel2.add(b1);
		panel2.add(b2);
		panel2.setMaximumSize(MAX_SIZE);
		
		
		frame.add(comboBox);
		frame.add(panel);
		frame.add(panel2);
		
		frame.setVisible(true);

	}

}
