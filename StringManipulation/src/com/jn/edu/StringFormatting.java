/**
 * 
 */
package com.jn.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class StringFormatting {
	static String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	static String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		formatting();
		// formmd.formatting();
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
		// System.out.println(date);
		System.out.println(String.format("Today is    %10.10s, %12.12s %02d, %4d", days[today.getDay()],
				months[today.getMonth()], today.getDate(), today.getYear() + 1900));
		System.out.println(String.format("Your dob is %10.10s, %12.12s %02d, %4d", days[dob.getDay()],
				months[dob.getMonth()], dob.getDate(), dob.getYear() + 1900));

	}

	static void formatting() throws IOException {
		File file = new File("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\filewriter.txt");

		BufferedWriter br = new BufferedWriter(new FileWriter(file));
		br.write(String.format("|%-20s|", months));
		br.close();
	}

}

//class formmd {
//
//	static String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
//			"October", "November", "December" };
//
//	static void formatting() throws IOException {
//		File file = new File("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\filewriter.txt");
//
//		BufferedWriter br = new BufferedWriter(new FileWriter(file));
//		br.write(String.format("|%-20s|", months));
//		br.newLine();
//		br.close();
//	}
