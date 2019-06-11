package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {
	// auto import with ctrl+shift+o
	public static Scanner scanner = new Scanner(System.in);
	
	/*
	 * Try-Catch block
	 *	A try catch block is a block of code which generally contains
	 *	dangerous code - meaning it could throw an exception. We put the
	 * the dangerous code in the 'try' section. And provide handling 
	 *  instructions in the 'catch' section.  
	 */
	
	/**
	 * Gets a user choice between 1 and the supplied maxChoice
	 * @param maxChoice - Max value selectable
	 * @return value user inputs in valid range
	 */
	public static int getInput(int maxChoice) {
		int choice = 0;
		
		// Do until they give a choice in the range
		while(choice <= 0 || choice > maxChoice) {
			try {
				// Get user input
				choice = scanner.nextInt();
				
				// Handles bad input
			} catch(InputMismatchException ex) {
				System.out.println("Please enter a number between 1 and " + maxChoice);
				scanner.nextLine();
			}
		}
		
		// Return result
		return choice;
	}
}
