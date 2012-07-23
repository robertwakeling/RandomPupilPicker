package pupils;


import java.io.IOException;
import java.awt.event.*;
import java.util.*; //Random number and such
import javax.swing.*;//for GUI Components 


class NamePicker { 
	public static void RanNam() { 

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
			
			String name = pupil.get(new Random().nextInt(pupil.size()));
	
			System.out.println(name);//outputs name
			resultFrame(name);
			//TODO put name remover into own method
			pupil.remove(name);
			pupil.trimToSize( );
			listSize = pupil.size();
		
			if (listSize == 0)
			{
				ArrayList<String> next = getNames();
				pupil = next;
			}
			
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
	
	public static void resultFrame(String pupil) {
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
	
	//TODO sort out frame
	
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		}
}
	
