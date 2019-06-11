/**
 * 
 */
package com.jn.edu;

import java.util.Random;

/**
 * @author JohnN
 *
 */
public class BlueRedBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] balls = new char[28];
		char[] color = { 'b', 'r' };
		float ratio = 3 / 7;
		int count = 0;
		Random rand = new Random();

		for (int x = 0; x < ratio; x++) {

			for (int i = 0; i < balls.length; i++) {

				// random balls
				balls[i] = color[rand.nextInt(color.length)];

				System.out.print(balls[i]);

				if (balls[0] == 'b') {
					balls[0]++;

				} else {

					balls[i]++;
				}

			}
		}
	}
}
