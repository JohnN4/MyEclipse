/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class QuanitityString {
	static String fruits[] = { "Strawberries", "Bananas", "Oranges", "Apples", "Mangoes", "Pineapples" };
	static double costs[] = { 0.89, 0.79, 0.3, 1.39, 1.50, 0.99 };
	static double quantities[] = { 20, 40, 90, 12, 24, 8 };

	// public static double

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputanweser;
		do {
			System.out.println("Enter Fruit");
			String inputFruit = sc.next();
			System.out.println("Enter Quanitiy");
			double inputQ = sc.nextDouble();
			for (int i = 0; i < fruits.length; i++) {

				if ((inputFruit.equals(fruits[i])) & (inputQ == quantities[i])) {
					inputFruit = fruits[i];

					String pFruit = String.format("We have an %s", inputFruit);

					String pCost = String.format("it cost %s", costs[i]);
					System.out.println(pFruit);
					System.out.println(pCost);
				}

			}
			for (int q = 0; q < quantities.length; q++) {
				if ((inputQ == quantities[q]) & (inputFruit == fruits[q])) {
					inputQ = quantities[q];
					String pquantity = String.format("We have only %s", inputQ);
					System.out.println(pquantity);
				}
			}

			System.out.println("Do you want to Try Again(Yes)");
			inputanweser = sc.next();

		} while (inputanweser.toLowerCase().equals("yes"));
	}

}