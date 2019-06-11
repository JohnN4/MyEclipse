package statiic;
 /**
 * What is a class?
 * 
 * 		A blue print for an object.
 * 
 * What is an object?
 * 
 * 		An instance of a class.
 * 
 * Fields and methods are generally associated with objects.
 *
 */
public class StaticDemo {
 	int field;
	static int staticField;
	
	public void doStuff() {
		System.out.println("Doing object things");
		// Objects have a context of 'this' - the current object or the calling object
		this.field = 3;
		field = 4;
		staticField = 3;
	}
	
	public StaticDemo() {
		staticField++;
		field++;
		System.out.println("staticField: " + staticField);
		System.out.println("field: " + field);
	}
	
	/**
	 * Static methods are associated with the class.
	 * Static methods & fields are often used for utility.
	 * Static methods have no context of this.
	 */
	public static void doStaticStuff() {
		System.out.println("Doing static stuff");
//		this.field = 2;
//		field = 2;
		staticField = 5;
	}
	
	public static void main(String[] args) {
		StaticDemo object = new StaticDemo();
		object.doStuff();
		StaticDemo.doStaticStuff();
		object.doStaticStuff(); // <-- bad, call using Class
		
		for(int i = 0; i < 10000; i++) {
			new StaticDemo();
		}
	}
}
