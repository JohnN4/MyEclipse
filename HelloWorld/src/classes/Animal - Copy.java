package classes;
 /**
 * A class is a blueprint for an object. Objects are instances of a class.
 * IF our class is an animal, then the class describes the characterics of an animal.
 * And an object (or instance of the class) would be an animal.
 *
 * In Java, everything but the primitives is a class or an object of a class.
 * 
 * Classes define two things about our objects.
 * 1. State - Fields (or variables)
 * 2. Behavior - Methods (or functions)
 */
public class Animal {
	// Declaring a field
	public String name;
	public int legsCount;
	public int armCount;
	public String furColor;
	public String eyeColor;	
	public double weight;
	public boolean hasWings;
	
	// Declaring a method
	// 1. An Access Modifier: [public, protected, (default), private]
	// 		Note: Default may also be called package-private
	// 2. A return type or void if no return.
	// 3. Method name
	// 4. Method parameters (type name, ...)
	public void move() {
		System.out.println("The "+ this.name +" moves around.");
	}
	
	public void fly() {
		if(this.hasWings) {
			System.out.println("The " + this.name + " flies away!");
		} else {
			System.out.println("The " + this.name + " immediately falls to the ground.");
		}
	}
	
}