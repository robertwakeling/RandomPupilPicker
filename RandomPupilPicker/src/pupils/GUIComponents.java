package pupils;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIComponents {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(new Dimension(300, 100));
		frame.setTitle("Name Picker");
		frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton();
		button1.setText("Random Name:");
		button1.setBackground(Color.BLUE);
		frame.add(button1);
		
		
		frame.pack();
		frame.setVisible(true);

	}

}
