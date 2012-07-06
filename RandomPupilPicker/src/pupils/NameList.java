package pupils;


import java.io.IOException;
import java.util.*; 

//Create arraylist with all pupils names in

class NameList { 
	
	
	public static void main(String args[]) throws IOException { 
		
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
			
			System.out.println("Press enter to choose pupil");
			System.in.read();
			
// display the array list 
			System.out.println("Pupils left to choose from: \n" + pupil); 
			

	} 
	
	
}