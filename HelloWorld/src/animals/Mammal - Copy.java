package animals;


/**
 * Abstract classes cannot be instantiated*.
 * 
 * *Technically, we can define a constructor which will be called, but we 
 * cannot create types of exactly this class.
 *
 * Abstract classes imply hierarchy. They are part of the
 * inheritance hierarchy of the class. It should also be noted
 * generally regarding inheritance that you can only inherit
 * directly from one class.
 * 
 * The reason for single inheritance is the diamond problem.
 *
 */
public abstract class Mammal {

	String name;
	
	// This is an abstract method
	// Any subclass of mammal, anything inheriting from it has the responsibility
	// of defining its own implementation for this method.
	public abstract void breathe();
	
}