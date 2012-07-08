package pupils;


import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.*; 
import javax.swing.*;//for GUI Components 
import javax.swing.plaf.LabelUI;

//Create arraylist with all pupils names in

class NameList { 
	
	
	public static void main(String args[]) { 
		

	
	ArrayList<String> pupil = getNames();
		
			//Pick a random name from the arraylist
			int listSize = pupil.size();
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.setSize(new Dimension(300, 100));
			frame.setTitle("Name Picker");
			frame.setLayout(new FlowLayout());
			
			JButton button1 = new JButton();
			button1.setText("Random");
			button1.setBackground(Color.RED);
			frame.add(button1);
			
		while (listSize >= 0) {
			System.out.println("Pupils left to choose from: \n" + pupil); 
			System.out.print("Press enter to choose pupil; ");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String name = pupil.get( new Random().nextInt( pupil.size() ) );
			
			System.out.println(name);
			JLabel label = new JLabel();
			
			frame.add(label);
			frame.pack();
			frame.setVisible(true);
		
			
			//JOptionPane.showMessageDialog(null, name);
			
			pupil.remove(name);
			pupil.trimToSize( );
			listSize = pupil.size();
		
			if (listSize == 0)
			{
				ArrayList<String> next = getNames();
				pupil = next;
			}
			
			//TODO set up an escape from while loop
			//TODO create method
			//TODO create GUI	
			//TODO multiple names
		}	
		
	} 



	public static ArrayList<String> getNames() {
		ArrayList<String> pupil = new ArrayList<String>(); 

		// add elements to the array list 
					
					pupil.add("Bethany"); 
					pupil.add("Mahalah"); 
					pupil.add("Paige"); 
					pupil.add("Finley"); 
					pupil.add("Skye"); 
					pupil.add("Tayla"); 
					pupil.add("Archie");
					pupil.add("Harley");
			/*		pupil.add("Declan");
					pupil.add("Sam");
					pupil.add("Joseph");
					pupil.add("Molly");
					pupil.add("Lillie");
					pupil.add("Vera-Lee");
					pupil.add("Mitchell");
					pupil.add("Joshua");
					pupil.add("Millissa");
					pupil.add("Vinnie");
					pupil.add("Henry");
					pupil.add("Elijah");
					pupil.add("Toby");
					pupil.add("Isabella");
					pupil.add("Lillyann");
					pupil.add("Aoife");
					pupil.add("Billy");
					pupil.add("Junior");*/
					
					
		return pupil;
		
	}

	
/*public static void frame() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//frame.setSize(new Dimension(300, 100));
	frame.setTitle("Name Picker");
	frame.setLayout(new FlowLayout());
	
	JButton button1 = new JButton();
	button1.setText("Random Name:");
	button1.setBackground(Color.RED);
	frame.add(button1);
	JLabel label = new JLabel();
	frame.add(label);
	frame.pack();
	frame.setVisible(true);

}*/
	
}
	
