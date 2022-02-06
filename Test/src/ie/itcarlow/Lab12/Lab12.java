package ie.itcarlow.Lab12;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: February 2022

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Lab12 
{
	Lab12(){  
        JFrame f= new JFrame("Align"); 
        
        JCheckBox checkBox1 = new JCheckBox("Snap to Grid");  
        checkBox1.setBounds(10, 20, 120, 30);  
        JCheckBox checkBox2 = new JCheckBox("Show Grid");  
        checkBox2.setBounds(10, 60, 120 ,30);  
        
        JButton b1= new JButton("OK");
        b1.setBounds(230, 10, 100, 30);
        JButton b2= new JButton("Cancel");  
        b2.setBounds(230, 50, 100, 30); 
        JButton b3= new JButton("Help");
        b3.setBounds(230, 90, 100, 30); 
        
        JLabel l1=new JLabel("X:");    
        l1.setBounds(150, 20, 80, 25);
        JLabel l2=new JLabel("Y:");    
        l2.setBounds(150, 65, 80, 25); 
        
        JTextField text1 = new JTextField("8");  
        text1.setBounds(170, 20, 40, 30); 
        JTextField text2 = new JTextField("8");
        text2.setBounds(170, 65, 40, 30);
        
        
        f.add(checkBox1);  
        f.add(checkBox2); 
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(text1);
        f.add(text2);
        f.add(l1);
        f.add(l2);
        f.setSize(400,180);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.addWindowListener(new WindowCloser());

     }  
	class WindowCloser extends WindowAdapter 
	{
		public void windowClosing(WindowEvent evt) 
		{
			System.exit(0);
		}
	}
}
