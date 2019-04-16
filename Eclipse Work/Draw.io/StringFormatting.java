/**
 * 
 */
package edu.sollers.fsj.stringmanipulation;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author praka
 *
 */
public class StringFormatting {
	static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	static String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date today = new Date(), dob = new Date();
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter DOB as mm/dd/yyyy: ");
		String dobString = reader.next();
		System.out.println();
		StringBuffer stringBuffer = new StringBuffer();
		String pattern = "MM/dd/yyyy";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		try {
			dob = simpleDateFormat.parse(dobString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String date = simpleDateFormat.format(today);
		//System.out.println(date);
		System.out.println(String.format("Today is    %10.10s, %12.12s %02d, %4d", days[today.getDay()], months[today.getMonth()], today.getDate(), today.getYear()+1900));
		System.out.println(String.format("Your dob is %10.10s, %12.12s %02d, %4d", days[dob.getDay()], months[dob.getMonth()], dob.getDate(), dob.getYear()+1900));
	}

}
