/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class Masks {

	static byte Clear = 1; // 00000001;
	static byte Sunny = 2; // 00000010;
	static byte Cloudy = 4; // 00000100;
	static byte Storm = 8; // 00001000;
	static byte Snow = 16; // 00010000;
	static byte Sleet = 32; // 00100000;
	static byte Rain = 64; // 01000000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for weather");
		byte Order = sc.nextByte();
		String contains = contain(Order);
		System.out.println("The Wealther It " + contains);

	}

	public static String contain(byte mask) {

		String Val = "";
		if ((mask & Clear) != 0) {
			Val = " Clear";
		}
		if ((mask & Sunny) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " sunny";
		}
		if ((mask & Cloudy) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " cloudy";
		}
		if ((mask & Storm) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " stormy";
		}
		if ((mask & Snow) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " snowing";
		}
		if ((mask & Sleet) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " sleet";
		}
		if ((mask & Rain) != 0) {
			if (!Val.equals(""))
				Val += ", ";
			Val += " raining";
		}
		if ((((mask & 1) != 0) & ((mask & 4) != 0)) | (((mask & 2) != 0) & ((mask & 4) != 0))
				| (((mask & 8) != 0) & ((mask & 1) != 0)) | (((mask & 2) != 0) & ((mask & 8) != 0)))
			System.out.println("Invalid weather");
		return Val;

	}

}
