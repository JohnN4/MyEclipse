package finaal;
 /**
 * Final Keyword
 * 
 * 1. For fields and variables: Final is like const
 * 		For primitive types this means the value cannot be changed.
 * 		For reference types (objects) it means the reference cannot
 * 			be changed
 * 		Note: Final does not imply immutable.
 * 
 * 2. For methods final dictates that the method cannot be overridden.
 * 
 * 3. For classes final dictates that the class cannot be extended.
 *
 */
public final class FinalUsage extends BaseClass {
 	final int y = 2;
	int field = 2;
	// Cannot override the final method from BaseClass
//	public void finalMethod() {
//		
//	}
	
	public static void main(String[] args) {
		final int x = 0;
		//Cannot reassign a value on final variable x
//		x++;
	}
	
}
 class BaseClass {
	
	public final void finalMethod() {
		System.out.println("Doing stuff");
	}
}
 // Not possible because FinalUsage is final - can't be extended
//class InheritingClass extends FinalUsage {
//	
//}
