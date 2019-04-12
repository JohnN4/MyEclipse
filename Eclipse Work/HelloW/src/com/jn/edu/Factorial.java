/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int input =sc.nextInt();
		int factorial =1;
		for (int i =0; i<input;i++)
			factorial*=i;//the same as factorial = factorial *i;
		
		System.out.println("Factorial of" + input + "= " + factorial);

	}

}
