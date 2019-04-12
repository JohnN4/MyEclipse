/**
 * 
 */
package com.jn.edu;
import java.util.Date;
import java.util.Calendar;

/**
 * @author JohnN
 *
 */
public class AgeCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int yy=99;
		int mm=9;
		int dd= 28;
		Calendar bd = Calendar.getInstance();
		bd.set(yy + 1900 ,mm,dd,0,0);
		Calendar now = Calendar.getInstance();
		int age = (int)((now.getTimeInMillis()-bd.getTimeInMillis())/(86400000*365.25));
		//int age = now.get(Calendar.YEAR)- bd.get(Calendar.YEAR);
		System.out.println("Age = "+age);
		String output = (age<18)?"Minor":
			(age<21)?"Vote but cannot drink":
				(age<25)?"Major but high car insurance rates": "Woohoo";
		
//		if(age<18)
//			System.out.println("Minor");
//		else if (age< 21)
//			System.out.println("Can vote but cannot drink");
//		else if(age<25)
//			System.out.println("Major but high car insurance rates");
//		else
//			System.out.println("Woohoo !");
		
		System.out.println(output);
		
	}

}
