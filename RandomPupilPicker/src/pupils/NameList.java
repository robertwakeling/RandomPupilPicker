package pupils;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Leon
 */

class PupilPicker {
    
    public static void picker() {
       
            ArrayList learners = new ArrayList(); 
 
// add elements to the array list 
learners.add("Lauren"); 
learners.add("Audrina"); 
learners.add("Hiedi"); 
learners.add("Whitney"); 
learners.add("Stephanie"); 
learners.add("Jordan"); 
learners.add("Spencer"); 
learners.add("Lisa"); 
learners.add("Jack"); 
learners.add("Rob"); 
learners.add("Zofja"); 
learners.add("Leon");
learners.add( "Pauline");
learners.add("Mikey");
    }

   
       

  
 ArrayList names = learners;
  // Generate random index reference, print the name and then remove it from 
  // list. 
int groupSize = names.size();
        Random namePicker = new Random();
        int ranPupil = namePicker.nextInt(groupSize);
  //      int ranPupil = namePicker.nextInt(groupSize)-1;
        System.out.println(groupSize);
        System.out.println(ranPupil + ": " + names.get(ranPupil) + " ");
        names.remove(ranPupil);
        names.trimToSize();
        int newGroupSize = names.size();
        System.out.println(newGroupSize);
        System.out.println(names);
       
        
    }
