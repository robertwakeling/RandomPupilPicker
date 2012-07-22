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
	PupilName pupil1 = new PupilName("Leon");
	pupil1.beenPicked();
	Boolean a = pupil1.picked;
	System.out.println(a);
	}
}