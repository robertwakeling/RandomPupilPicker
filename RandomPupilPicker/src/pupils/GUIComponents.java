
package pupils;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIComponents {
	
	public static void frame() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(new Dimension(300, 100));
		frame.setTitle("Name Picker");
		frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton();
		button1.setText("Random Name:");
		button1.setBackground(Color.RED);
		frame.add(button1);
		JLabel label = new JLabel("Name");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);

	}

}
