package pupils;
import pupils.Age;
import java.util.Random;

// Pupil class attributes
public class PupilName {
	private String name;
	private String dob;
	private boolean pickedToAnswer = false;
	private boolean pickedForGroup = false;
	
	//Method to pick a random element from pupilNames array
	public static PupilName get (PupilName[] pupilNames) {
	    Random generator = new Random();
		int rnd = generator.nextInt(pupilNames.length);
		return pupilNames[rnd];
	    }
	
	//pupil constructor
	public PupilName(String pupil, String birthday) {
		name = pupil;
		dob = birthday;
	}
	
	//method to change picked to answer a question to true
	public void beenPicked() {
		pickedToAnswer = true;
	}
	
	//Method to print state of pupils name
	void printName() {
		System.out.println("Picked to answer question? " + pickedToAnswer);
		System.out.println("Picked to be in a group? " + pickedForGroup);
		System.out.print(name + " " + dob);
		
	}
	public static void main(String[] args) {
		
		PupilName[] pupilNames = namesArrayMaker();
	

	PupilName choosenOne = PupilName.get(pupilNames);
	choosenOne.beenPicked();
	choosenOne.printName();
	Age.findAge("2005-11-02");
}

	/**
	 * @return
	 */
	private static PupilName[] namesArrayMaker() {
		PupilName bethany = new PupilName("Bethany", "2005-11-05"); 
		PupilName mahalah = new PupilName("Mahalah", "2006-06-04"); 
		PupilName paige = new PupilName("Paige", "2006-08-22"); 
		PupilName finley = new PupilName("Finley", "2006-09-05"); 
		PupilName skye = new PupilName("Skye", "2006-12-06"); 
		PupilName tayla = new PupilName("Tayla", "2007-01-05"); 
		PupilName archie = new PupilName("Archie", "2007-01-05");
		PupilName harley = new PupilName("Harley", "2007-01-26");
		PupilName declan = new PupilName("Declan", "2007-01-29");
		PupilName sam = new PupilName("Sam", "2007-02-19");
		PupilName joseph = new PupilName("Joseph", "2007-02-22");
		PupilName molly = new PupilName("Molly", "2007-04-11");
		PupilName lillie = new PupilName("Lillie", "2007-05-15");
		PupilName veralee = new PupilName("Vera-Lee", "2007-06-03");
		PupilName mitchell = new PupilName("Mitchell", "2007-12-02");
		PupilName joshua = new PupilName("Joshua", "2007-12-07");
		PupilName millissa = new PupilName("Millissa", "2008-01-31");
		PupilName vinnie = new PupilName("Vinnie", "2008-01-31");
		PupilName henry = new PupilName("Henry", "2008-04-23");
		PupilName elijah = new PupilName("Elijah", "2008-05-08");
		PupilName toby = new PupilName("Toby", "2008-06-03");
		PupilName isabella = new PupilName("Isabella", "208-06-07");
		PupilName lillyann = new PupilName("Lillyann", "2008-06-09");
		PupilName aoife = new PupilName("Aoife", "2008-06-09");
		PupilName billy = new PupilName("Billy", "2008-06-11");
		PupilName junior = new PupilName("Junior", "2008-08-27");
	
	PupilName[] pupilNames = {bethany, mahalah, paige, finley, skye, tayla, 
			archie, harley, declan, sam, joseph, molly, lillie, veralee, mitchell,
			joshua, millissa, vinnie, henry, elijah, toby, isabella, lillyann, aoife, 
			billy, junior};
		return pupilNames;
	}


}