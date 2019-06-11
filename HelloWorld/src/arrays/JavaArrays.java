package arrays;
 public class JavaArrays {
	public static void main(String[] args) {
		
		char[] arr = new char[26];
 		// All primitive values have a default value upon creation.
		// 0, 0.0, false
		
		for(int i = 0; i < arr.length; i++) {
			// a char literal is a single character surrounded by single quotes
			// Note: Double quotes represent string literals, not chars
			
			// Process of explicitly converting a type to another is called casting.
			// To cast, we should include to the type in parenthesis before the value to cast
			arr[i] = ('a'+'b');
			
//			System.out.println(i + ": " +  arr[i]);
		}
		
		byte maxValue = Byte.MAX_VALUE;
		System.out.println(maxValue++);
		System.out.println(maxValue);
		
	}
}