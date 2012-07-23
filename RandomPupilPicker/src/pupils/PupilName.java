package pupils;

import java.util.Random;

public class PupilName {
	private String name;
	private boolean picked = false;
	
	public PupilName(String pupil) {
		name = pupil;
	}

	public void beenPicked() {
		picked = true;
	}
	
	void printName() {
		System.out.println(ranpup.name);
		
	}
	public static void main(String[] args) {
		
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
	//pupil1.beenPicked();
	PupilName[] name = pupilNames;
	name.printName();
	}


}