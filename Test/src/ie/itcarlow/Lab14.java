package ie.itcarlow.Lab14;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331 
//Date: February 26 2022 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class Lab14 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Printer");
		frame.setSize(400, 200);
		frame.setMinimumSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Printer: MyPrinter");
		frame.add(label, BorderLayout.NORTH);
		
		JPanel firstMenu = new JPanel();
		firstMenu.setLayout(new BoxLayout(firstMenu, BoxLayout.Y_AXIS));
		firstMenu.add(new JButton("Ok"));
		firstMenu.add(new JButton("Cancel"));
		firstMenu.add(new JButton("Setup..."));
		firstMenu.add(new JButton("Help"));
		frame.add(firstMenu, BorderLayout.EAST);

		JPanel center = new JPanel();
		GridBagLayout middle = new GridBagLayout();
		GridBagConstraints option = new GridBagConstraints();
		center.setLayout(middle);
		
		JPanel firstBlank = new JPanel();
		firstBlank.setBackground(Color.WHITE);
		option.gridx = 0;
		option.gridy = 0;
		option.gridheight = 3;
		option.fill = GridBagConstraints.VERTICAL;
		center.add(firstBlank, option);
		
		JCheckBox image = new JCheckBox("Image");
		option.gridx = 1;
		option.gridy = 0;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(image, option);
		
		JCheckBox text = new JCheckBox("Text");
		option.gridx = 1;
		option.gridy = 1;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(text, option);
		
		JCheckBox code = new JCheckBox("Code");
		option.gridx = 1;
		option.gridy = 2;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(code, option);
		
		JPanel secondBlank = new JPanel();
		secondBlank.setBackground(Color.WHITE);
		option.gridx = 2;
		option.gridy = 0;
		option.gridheight = 3;
		option.fill = GridBagConstraints.VERTICAL;
		center.add(secondBlank, option);
		
		JRadioButton selection = new JRadioButton("Selection");
		option.gridx = 3;
		option.gridy = 0;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(selection, option);
		
		JRadioButton all = new JRadioButton("All");
		option.gridx = 3;
		option.gridy = 1;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(all, option);
		
		JRadioButton applet = new JRadioButton("Applet");
		option.gridx = 3;
		option.gridy = 2;
		option.gridheight = 1;
		option.fill = GridBagConstraints.HORIZONTAL;
		center.add(applet, option);
		
		JPanel thridBlank = new JPanel();
		thridBlank.setBackground(Color.WHITE);
		option.gridx = 4;
		option.gridy = 0;
		option.gridheight = 3;
		option.fill = GridBagConstraints.VERTICAL;
		center.add(thridBlank, option);
		
		frame.add(center, BorderLayout.CENTER);
		
		JPanel secondMenu = new JPanel();
		secondMenu.setLayout(new BoxLayout(secondMenu, BoxLayout.X_AXIS));
		secondMenu.add(new JLabel("Print Quality: "));
		String[] items = new String[] {"High","Low"};
		secondMenu.add(new JComboBox<String>(items));
		secondMenu.add(new JCheckBox(" Print To File"));
		frame.add(secondMenu, BorderLayout.SOUTH);
		
		
		frame.pack();
		frame.setVisible(true);
	}
}