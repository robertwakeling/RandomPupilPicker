package pupils;


import java.awt.Color; //for GUI 
import java.awt.FlowLayout;//for GUI
import java.io.IOException;
import java.util.*; //Random number and such
import javax.swing.*;//for GUI Components 


class NamePicker { 
	public static void main(String args[], Object name) { 

		ArrayList<String> pupil = getNames(); //set up arraylist
		
//Pick a random name from the arraylist
		int listSize = pupil.size();
		
		while (listSize >= 0) {
			System.out.print("Press enter to choose pupil; ");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String name1 = pupil.get(new Random().nextInt(pupil.size()));
	
			System.out.println(name1);//outputs name
			//resultFrame(name);
		
	
			pupil.remove(name1);
			pupil.trimToSize( );
			listSize = pupil.size();
		
			if (listSize == 0)
			{
				ArrayList<String> reset = getNames();
				pupil = reset;
			}
			
			//TODO set up an escape from while loop
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
				/*	pupil.add("Tayla"); 
					pupil.add("Archie");
					pupil.add("Harley");
					pupil.add("Declan");
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
	
/*	public static void resultFrame(String pupil) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Name Picker");
		frame.setLayout(new FlowLayout());
	
		JButton button1 = new JButton();
		button1.setText("Name Picker");
		button1.setBackground(Color.RED);
		frame.add(button1);
		JLabel label = new JLabel();
		label.setText(pupil);
	
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		}*/
}
	
