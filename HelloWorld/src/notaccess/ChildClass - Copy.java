package notaccess;
 import access.MyClass;
 public class ChildClass extends MyClass {
	
	// This 'name' field hides the 'name'
	// field defined in MyClass
	String name;
	
	private void accessProtected() {
		// Can access this way
		this.protectedField = 1;
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
//		myClass.privateField = 0; //can't access this :(
//		myClass.defaultField = 0; // can't access
//		myClass.protectedField = 0; // can't access
		myClass.publicField = 0;
	}
}