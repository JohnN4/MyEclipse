/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class Adding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter First Number");
		int input =sc.nextInt();
		
		System.out.println("Please Enter the end Number");
		int input2 =sc.nextInt();

		int startadd=0;
		for(int i=input;i<=input2;i++)
			startadd +=i;
		System.out.println("started from "+input+" end on "+ input2+" = "+ startadd);
	}

}
