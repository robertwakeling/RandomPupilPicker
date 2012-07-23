package pupils;

public class PupilName {
	private String name;
	private boolean picked = false;
	
	public PupilName(String pupil) {
		name = pupil;
	}

	public void beenPicked() {
		picked = true;
		
	}
	public static void main(String[] args) {
	PupilName leon = new PupilName("Leon");
	PupilName ted = new PupilName("Ted");
	PupilName zofja = new PupilName("Zofja");
	PupilName[] pupilNames = {leon, ted, zofja};
	//pupil1.beenPicked();
	String a = leon.name;
	System.out.println(pupilNames.length);
	}
}