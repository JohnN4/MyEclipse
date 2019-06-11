package Types;

public class Types {
	/**
	 * Java has 8 primitive types in four categories:
	 * 
	 * -Integer Primitives Types
	 * 	1. byte (8-bit signed integer value) (range: -128 ~ 127)
	 *  2. short (16-bit signed integer value) (range: -32,768 ~ 32767)
	 *  3. int (32-bit signed integer value) (range: -2^31 ~ (2^31)-1)
	 *  4. long (64-bit signed integer value) (range: -2^63 ~ (2^63)-1)
	 *  
	 * -Floating Point Primitive Types
	 *  5. float (32-bits of precision)
	 *  6. double (64-bits of precision) (number in JavaScript)
	 *  
	 * -Boolean Types
	 *  7. boolean (true or false)
	 *  
	 * -Character Types
	 *  8. char (16-bit unsigned integer value represented as a character)
	 *          unsigned - means no negative values
	 */
	public static void main(String[] args) {
	// variable declaration requires two things!
	//[data-type][variable name]
		
	byte myByte;
	// assignment of value
	myByte=2;
	
	//all together
	short myShort=5;
	int myInt=5000;
	long myLong=12345678900L; // L means that it's a long literal
	
	// A whole number typed without any other qualifier, is considered an int literal
	
	float myFloat=2.5f; // f qualifier is a float literal
	double myDouble=2.5; // any value with a decimal point and
						// other qualifier is a double literal
	
	double myBigDouble=2.75648476e22;
	
	System.out.println(myBigDouble);
	System.out.printf("20f%n", myBigDouble);
	
	
	/** 
	 * what are primitives?
	 * primitive types in java are the only types that are not objects.
	 * everything else in java is represented as an object with a defining class.
	 * this makes primitives a somewhat lower level concept than other types in java.
	 * 
	 * primitive s are also always define with a lower case -however calssses are traditionally
	 * (and should be) defined with an upper case.
	 * 
	 * math operations can be used driectly on primitives in the same way as javascript
	 * math operators: +-/*%
	 * logical operators: || && == ^ | &
	 * control structures, largely the same except for declarations.
	 * ex)
	 * for(int i=0,i
	 * */
	}
}
