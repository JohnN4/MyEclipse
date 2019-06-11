package souper;

public class SuperDemo {

	
	public static void main(String[] args) {
		C c = new C(10);
		c.printThings();
	}
	
}

class A {
	int value;
	public A () {
		System.out.println("Constructing A");
	}
	
}

class B extends A {
	public B () {
		// Call to the parent constructor
		System.out.println("Constructing B without int");
		// this references current object
		// super references the parent class
	}
	public B (int v) {
		// Calls the constructor on B matching the arguments
		this();
		System.out.println("Constructing B with int");
	}
	public void printThings() {
		System.out.println("Printing B things");
	}
}

class C extends B {
	public C(int v) {
		super(v);
		System.out.println("Constructing C");
	}
	
	@Override
	public void printThings() {
		System.out.println("Printing C things");
	}
}