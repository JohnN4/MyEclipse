/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a = " + a + ";b = " + b);
		int temp = b; // a=a+b a=a^b other ways of swapping()
		b = a; // b=a-b b=a^b
		a = temp; // a=a-b a=a^b
		System.out.println("a = " + a + "; b = " + b);
	}

}

//a=10
//b=12
//a= a + b = 10 + 12 = 22
//b=a - b = 22 - 12 =10
//a= a - b =22-10=12
//now b=10 and a =12
//will not work with large #(bec of overflow)
//
//a=8 =00001000
//b=32=00010000
//a=a^b=40 =00011000
//b=a^b=00011000 ^ 00010000 =00001000
//a=a^b=00011000 ^ 00001000=00010000
//this method will work with any integer
//
//true ^ true =false
//true ^ false=true
//false ^true =true
//false ^false=false
//
//
//mask =binary number that can be used with & | ^ operations to set or reset states
//
//Overcast<->sunny
//storm<->clear sky
//rain
