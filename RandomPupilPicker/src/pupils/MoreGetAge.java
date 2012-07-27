package pupils;

import java.util.Calendar;
import java.util.Date;

public class MoreGetAge {

	/**
	 * @param args
	 * @return 
	 */
	public static int main(String[] args) {
		Calendar dob = Calendar.getInstance();
		Date dateOfBirth = null;
		dob.setTime(dateOfBirth);
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
		age--;
		return age;

	}

}
