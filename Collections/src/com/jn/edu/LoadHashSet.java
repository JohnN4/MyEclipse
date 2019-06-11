/**
 * 
 */
package com.jn.edu;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author JohnN
 *
 */
public class LoadHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String strings[] = new String[1000];
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\word_list.txt"))) {
			String currentLine;
			int i = 0;
			while ((currentLine = br.readLine()) != null && i < 1000) {
				strings[i++] = currentLine;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String s : strings) {
			System.out.println(s);
		}

	}

}
