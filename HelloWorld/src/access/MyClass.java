package access;

public class MyClass {
	
	public int publicField;
	protected int protectedField;
	int defaultField;
	private int privateField;
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		// From within this class, all fields are accessible
		myClass.privateField = 0;
		myClass.defaultField = 0;
		myClass.protectedField = 0;
		myClass.publicField = 0;
	}
}