/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Limit");
//		int input = sc.nextInt();
//
//		char[] prime = new char[input];
//
//		for (int i = 0; i < input; i++) {
//			System.out.println(i);
//			int p = 2;
//			while (p < input) {
//
//				prime[p] = 'p';
//
//				for (int x = 2 * p; x < input; x += p)

		int limit = sc.nextInt();

		char primes[] = new char[limit];
		// ignore 0 and 1

		for (int i = 0; i < limit; i++)
			primes[i] = ' ';

		int p = 2;// first prime

		while (p < limit) {

			if (primes[p] == ' ') {
				primes[p] = 'p'; // prime number

				for (int i = 2 * p; i < limit; i += p)

					primes[i] = 'c'; // composite number
			}
			p++;
		}
		for (int i = 0; i < limit; i++) {
			char c = primes[i];

			if (c == 'p')

				System.out.println(i + " is a prime number");
		}

	}
}
