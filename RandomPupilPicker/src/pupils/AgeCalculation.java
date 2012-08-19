package pupils;

import java.util.*;
import java.io.*;
//Alternative way of getting age
//TODO re arrange code to except parameters
public class AgeCalculation{
	public static void main(String[] args) throws IOException{
		int day = 1, month = 0, year = 1, ageYears, ageMonths, ageDays;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Calendar cd = Calendar.getInstance();
		try{
			System.out.print("Enter year of your date of birth : ");
			year = Integer.parseInt(in.readLine());
			if(year > cd.get(Calendar.YEAR)){

		System.out.print("Invalid date of birth.");
				System.exit(0);
			}
			System.out.print("Enter month of your date of birth : ");
			month = Integer.parseInt(in.readLine());
			if(month < 1 || month > 12){
				System.out.print("Please enter monthe between 1 to 12.");
				System.exit(0);
			}
			else{
				month--;
			}
			System.out.print("Enter day of your date of birth : ");
			day = Integer.parseInt(in.readLine());
			if(month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11){
				if(day > 30 || day < 1){
					System.out.print("Please enter day between 1 to 30.");
					System.exit(0);
				}
			}
			else if(month == 3 || month == 5 || month == 8 || month == 10){
				if(day > 31 || day < 1){
					System.out.print("Please enter day between 1 to 31.");
					System.exit(0);
				}
			}
			else{
				if(new GregorianCalendar().isLeapYear(year)){
					if(day < 1 || day > 29){
						System.out.print("Please enter day between 1 to 29.");
						System.exit(0);
					}
				}
				else if(day < 1 || day > 28){
					System.out.print("Please enter day between 1 to 28.");
					System.exit(0);
				}
			}
		}
		catch(NumberFormatException ne){
			System.out.print(ne.getMessage() + " is not a legal entry!");
			System.out.print("Please enter number.");
			System.exit(0);
		}
		Calendar bd = new GregorianCalendar(year, month, day);
		ageYears = cd.get(Calendar.YEAR) - bd.get(Calendar.YEAR);
		if(cd.before(new GregorianCalendar(cd.get(Calendar.YEAR), month, day))){
			ageYears--;
			ageMonths = (12 - (bd.get(Calendar.MONTH) + 1)) + (bd.get(Calendar.MONTH));
			if(day > cd.get(Calendar.DAY_OF_MONTH))
				ageDays = day - cd.get(Calendar.DAY_OF_MONTH);
			else if(day < cd.get(Calendar.DAY_OF_MONTH))
				ageDays = cd.get(Calendar.DAY_OF_MONTH) - day;
			else
				ageDays = 0;
		}
		else if(cd.after(bd)){
			ageMonths = (12 - (bd.get(Calendar.MONTH) + 1)) - 1;
			if(day > cd.get(Calendar.DAY_OF_MONTH))
				ageDays = day - cd.get(Calendar.DAY_OF_MONTH) - day;
			else if(day < cd.get(Calendar.DAY_OF_MONTH))
				ageDays = cd.get(Calendar.DAY_OF_MONTH) - day;
			else
				ageDays = 0;
		}
		else{
			ageYears = cd.get(Calendar.YEAR) - bd.get(Calendar.YEAR);
			ageMonths = 0;
			ageDays = 0;
		}
		System.out.print("Age of the person : " + ageYears + " year, " + ageMonths + " months and " + ageDays + " days.");
	}
}
