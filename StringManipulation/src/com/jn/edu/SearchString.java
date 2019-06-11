/**
 * 
 */
package com.jn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class SearchString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> textFile = new HashSet<String>();

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\word_list.txt"))) {
			String currentLine;

			while ((currentLine = br.readLine()) != null) {
				textFile.add(currentLine);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter Word to Search ");
		String input = sc.next();
		if (textFile.contains(input)) {
			System.out.println("Text File Contains " + input);
		} else {
			System.out.println("Text File does not Contains " + input);
		}

	}

}
