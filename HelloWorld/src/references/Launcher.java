package references;

import java.util.Arrays;

public class Launcher {
	
	/** Primitive types point to a location in memory which stores
	 * their literal value. Assigning a new variable the same value
	 * as an existing one, just creates a new place in memory
	 * holding the same value. There is no link between the two.
	 * Changing one will not change the other.
	 */
	static void primitivesDemo() {
		int x = 10;
		int y = x;
		
		x *= x;
		modifyInt(x);
		
		System.out.println(x); // 100
		System.out.println(y); //  10
	}
	
	static void modifyInt(int a) {
		a = a * 2;
	}

	static void referenceTypeDemo() {
		int[] myArr = {1, 2, 3, 4};
		int[] altArr = myArr;
		
		for(int i = 0; i < altArr.length; i++) {
			altArr[i] = 2 * altArr[i];
		}
		
		System.out.println(myArr);
		System.out.println(altArr);
		modArr(myArr);
		
		Arrays.stream(altArr).forEach(System.out::print);
		System.out.println();
		Arrays.stream(myArr).forEach(System.out::print);
		
	}
	
	public static void modArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 2 * arr[i];
		}
	}
	
	public static void main(String[] args) {
//		primitivesDemo();
		referenceTypeDemo();
	}
}

