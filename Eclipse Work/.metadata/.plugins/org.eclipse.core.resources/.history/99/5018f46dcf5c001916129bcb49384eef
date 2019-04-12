/**
 * 
 */
package com.jn.edu;

import java.util.Random;
import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter a Number");
		int input=sc.nextInt();
		double error = 0.000001;
		int est = 2;
			
		
		if(input<0) input=-input; //neg check
		if(input==0) System.out.println("the Square root of 0 is "+ 0); //zero check
		if(input>0) 
		{
			double result=input;
			while((result-input/result)>error) //loop until it get the number that satisfied the error 
				result=(result+input/result)/2;
			System.out.println("Number found is "+ result);
		}
			}
		
	}
	


