/**
 * 
 */
package com.jn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JohnN
 *
 */
public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:\\path.txt"));
			String fruitflower;
			int quantity;
			String line;
			while ((line = br.readLine()) != null) {
				String strings[] = line.split("//s+");
				fruitflower = strings[0];
				quantity = Integer.parseInt(strings[1]);
				System.out.println("we have " + quantity + "of" + fruitflower + "on hand");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
