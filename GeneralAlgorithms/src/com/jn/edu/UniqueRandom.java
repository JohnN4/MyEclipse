/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class UniqueRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int first[] = new int[4];
		boolean randomed = false;
		// int combin[] = new int[first.length + randomed.length];

		int max = 9;
		int min = 0;
		int range = max - min + 1;

		int rand = (int) (Math.random() * range) + min;
		first[0] = rand;

		// System.out.println(rand);

		for (int i = 0; i < first.length;) {
			rand = (int) (Math.random() * range) + min;
			randomed = false;

			for (int x = 0; x < first.length; x++) {
				if (first[x] == rand)
					randomed = true;

			}
			if (randomed) {

			} else {
				first[i] = rand;
				i++;
			}
		}

		for (int i = 0; i < first.length; i++) {

			System.out.print(first[i] + ",");
		}

	}
}
