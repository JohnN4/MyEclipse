/**
 * 
 */
package com.jn.edu;

import java.util.HashSet;

/**
 * @author JohnN
 *
 */
public class UsingHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");

		System.out.println(fruits);

	}

}
