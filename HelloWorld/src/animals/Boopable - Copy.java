package animals;

/**
 * An interface is used to define the external
 * way of interacting with a class.
 * 
 * Classes implement interfaces.
 * Interfaces can extend other interfaces.
 * 
 * Classes can implement multiple interfaces.
 * 
 * All methods in an interface are implicitly:
 * 
 * public and abstract
 *
 */
public interface Boopable {
	
	// All fields on an interface are implicitly : public static final
	int myField = 3;

	// All methods on an interface are implicitly: abstract
	public void boop();
	public void boop(Dog dog);
	
	// Since Java 8 we can provide an implementation using the default
	
	public default void defaultMethod() {
		System.out.println("Doing defaulty things");
	}
}