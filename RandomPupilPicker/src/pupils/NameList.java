package pupils;


import java.io.IOException;
import java.util.*; 
import javax.swing.*;//for GUI Components 

//Create arraylist with all pupils names in

class NameList { 
	
	
	public static void main(String args[]) { 
		
// create an array list 
		//TODO read names from file
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
			pupil.add("Junior");
			
			
			
		
			//Pick a random name from the arraylist
			int listSize = pupil.size();
		while (listSize >= 0) {
			System.out.println("Pupils left to choose from: \n" + pupil); 
			System.out.print("Press enter to choose pupil; ");
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String name = pupil.get( new Random().nextInt( pupil.size() ) );
			
			System.out.println(name);
			
			//JOptionPane.showMessageDialog(null, name);
			
			pupil.remove(name);
			pupil.trimToSize( );
			listSize = pupil.size();
		
			if (listSize == 0)
			{
				pupil.add("Bethany"); 
				pupil.add("Mahalah"); 
				pupil.add("Paige"); 
				pupil.add("Finley"); 
				pupil.add("Skye"); 
				pupil.add("Tayla"); 
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
				pupil.add("Junior");
			}
			
			//TODO set up an escape from while loop
			//TODO create method
			//TODO create GUI	
			//TODO multiple names
		}	
		
	} 
}