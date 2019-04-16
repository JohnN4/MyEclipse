/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class BinaryMask {
	static byte WHOLE_MILK = 1; // 00000001;
	static byte LOWFAT_MILK = 2; // 00000010;
	static byte SKIM_MILK = 4; // 00000100;
	static byte WHIPPED_CREAM = 8; // 00001000;
	static byte CHOCOLATE_DRIZZLE = 16; // 00010000;
	static byte CARAMEL_DRIZZLE = 32; // 00100000;
	static byte SPRINKLES = 64; // 01000000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		byte drinkOrder = reader.nextByte();
		String contains = contents(drinkOrder);
		System.out.println("Drink contains " + contains);
	}

	public static String contents(byte mask) {
		String retVal = "";
		if ((mask & WHOLE_MILK) != 0) {
			retVal = "Whole milk";
		}
		if ((mask & LOWFAT_MILK) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Lowfat milk";
		}
		if ((mask & SKIM_MILK) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Skim milk";
		}
		if ((mask & WHIPPED_CREAM) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Whipped Cream";
		}
		if ((mask & CHOCOLATE_DRIZZLE) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Chocolate Drizzle";
		}
		if ((mask & CARAMEL_DRIZZLE) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Caramel Drizzle";
		}
		if ((mask & SPRINKLES) != 0) {
			if (!retVal.equals(""))
				retVal += ", ";
			retVal += "Sprinkles";
		}
		// obviously, the drink cannot have all kinds of milk at the same time
		if ((((mask & 1) != 0) & ((mask & 2) != 0)) | // (WHOLE_MILK | LOWFAT_MILK)
				(((mask & 1) != 0) & ((mask & 4) != 0)) | // (WHOLE_MILK | SKIM_MILK)
				(((mask & 2) != 0) & ((mask & 4) != 0)))// (LOWFAT_MILK | SKIM_MILK)
			System.out.println("Invalid combination of ingredients");
		return retVal;
	}

}