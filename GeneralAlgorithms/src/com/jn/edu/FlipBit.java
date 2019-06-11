/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class FlipBit {
	public static int invertBits(int n) {
		int pow2 = 1;
		int bit = 0;
		int newnum = 0;
		while (n > 0) {
			bit = (n & 1);
			if (bit == 0)
				newnum += pow2;
			n = n >> 1;
			pow2 *= 2;
		}
		System.out.println(newnum);
		return newnum;
	}

	public static int complementIt(int c) {
		return c ^ (int) (Math.pow(2, Math.ceil(Math.log(c) / Math.log(2))) - 1);
	}

	public static byte reverseBitsByte(byte x) {
		int intSize = 8;

		byte y = 0;
		for (int position = intSize - 1; position >= 0; position--) {
			y += ((x & 1) << position);
			x >>= 1;
		}
		System.out.println(y);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		invertBits(01001101);
		System.out.println(complementIt(01001101));
		reverseBitsByte((byte) 01001101);

		int x = 01001101;
		x = ~x & 0xFF;
		System.out.println(x);
	}

}
