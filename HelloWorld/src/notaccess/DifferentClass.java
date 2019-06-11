package notaccess;
 import access.MyClass;
 public class DifferentClass {
 	public void test(MyClass myClass) {
//Protected field is not visible
// because we're in a different package
// and DifferentClass is not a subclass
// of MyClass
//		myClass.protectedField = 0;
		myClass.publicField = 0;
	}
	
	
	public static void main(String[] args) {
MyClass myClass = new MyClass();
		
		
		
//		myClass.privateField = 0; can't access this :(
//		myClass.defaultField = 0;
//		myClass.protectedField = 0;
		myClass.publicField = 0;
	}
}