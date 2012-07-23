package pupils;

import java.util.Random;

// Pupil class attributes
public class PupilName {
	private String name;
	private boolean pickedToAnswer = false;
	private boolean pickedForGroup = false;
	
	//Method to pick a random element from pupilNames array
	public static PupilName get (PupilName[] pupilNames) {
	    Random generator = new Random();
		int rnd = generator.nextInt(pupilNames.length);
		return pupilNames[rnd];
	    }
	
	//pupil constructor
	public PupilName(String pupil) {
		name = pupil;
	}
	
	//method to change picked to answer a question to true
	public void beenPicked() {
		pickedToAnswer = true;
	}
	
	//Method to print state of pupils name
	void printName() {
		System.out.println("Picked to answer question? " + pickedToAnswer);
		System.out.println("Picked to be in a group? " + pickedForGroup);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		
		PupilName[] pupilNames = namesArrayMaker();
	

	PupilName choosenOne = PupilName.get(pupilNames);
	choosenOne.beenPicked();
	choosenOne.printName();
	
}

	/**
	 * @return
	 */
	private static PupilName[] namesArrayMaker() {
		PupilName bethany = new PupilName("Bethany"); 
		PupilName mahalah = new PupilName("Mahalah"); 
		PupilName paige = new PupilName("Paige"); 
		PupilName finley = new PupilName("Finley"); 
		PupilName skye = new PupilName("Skye"); 
		PupilName tayla = new PupilName("Tayla"); 
		PupilName archie = new PupilName("Archie");
		PupilName harley = new PupilName("Harley");
		PupilName declan = new PupilName("Declan");
		PupilName sam = new PupilName("Sam");
		PupilName joseph = new PupilName("Joseph");
		PupilName molly = new PupilName("Molly");
		PupilName lillie = new PupilName("Lillie");
		PupilName veralee = new PupilName("Vera-Lee");
		PupilName mitchell = new PupilName("Mitchell");
		PupilName joshua = new PupilName("Joshua");
		PupilName millissa = new PupilName("Millissa");
		PupilName vinnie = new PupilName("Vinnie");
		PupilName henry = new PupilName("Henry");
		PupilName elijah = new PupilName("Elijah");
		PupilName toby = new PupilName("Toby");
		PupilName isabella = new PupilName("Isabella");
		PupilName lillyann = new PupilName("Lillyann");
		PupilName aoife = new PupilName("Aoife");
		PupilName billy = new PupilName("Billy");
		PupilName junior = new PupilName("Junior");
	
	PupilName[] pupilNames = {bethany, mahalah, paige, finley, skye, tayla, 
			archie, harley, declan, sam, joseph, molly, lillie, veralee, mitchell,
			joshua, millissa, vinnie, henry, elijah, toby, isabella, lillyann, aoife, 
			billy, junior};
		return pupilNames;
	}


}