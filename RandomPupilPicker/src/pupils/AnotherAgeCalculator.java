package pupils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AnotherAgeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a calendar object with the date of birth
		Calendar dateOfBirth = new GregorianCalendar(1973, Calendar.NOVEMBER, 03);
		
		// create calendar object with todays date
		Calendar today = Calendar.getInstance();
		
		//Get age based on year
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		
		//Add tentative age to the date of birth to get this years birthday
		dateOfBirth.add(Calendar.YEAR, age);
		
		//If this year's birthday has not happened yet, subtract one
		if(today.before(dateOfBirth)) {
			age--;
		}
		

	}

}
