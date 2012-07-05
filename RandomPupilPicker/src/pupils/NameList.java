package pupils;


// Create arraylist with all pupils names in
import java.util.*; 
class NameList { 
	public static void main(String args[]) { 
// create an array list 
			ArrayList pupil = new ArrayList(); 
			System.out.println("Initial size of al: " + 
					pupil.size()); 
// add elements to the array list 
			pupil.add("C"); 
			pupil.add("A"); 
			pupil.add("E"); 
			pupil.add("B"); 
			pupil.add("D"); 
			pupil.add("F"); 
			pupil.add(1, "A2"); 
			System.out.println("Size of list after additions: " + 
					pupil.size()); 
// display the array list 
			System.out.println("Contents of list: " + pupil); 
// Remove elements from the array list 
			pupil.remove("F"); 
			pupil.remove(2); 
			System.out.println("Size of list after deletions: " + 
					pupil.size()); 
			System.out.println("Contents of list: " + pupil); 
	} 
}