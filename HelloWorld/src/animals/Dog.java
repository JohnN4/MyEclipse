package animals;

public class Dog extends Mammal implements Boopable {

	
	/**
	 * Anything with the @ symbol is called an
	 * annotation (in Java), in JavaScript it would
	 * be called a decorator. 
	 * 
	 * Annotations and decorators are used for a type
	 * of meta-programming.
	 * 
	 * @Override annotation states that the method
	 * it is above is intended to override another
	 * method. Our IDE uses this to give us feedback
	 * based on this assumption. It will add red
	 * squigglies under the annotation if it does
	 * not properly override a method.
	 * 
	 * One problem people run into is that they
	 * accidentally fail to correctly override
	 * a method, and so their implementation is
	 * not actually overridden. Note: This presents
	 * no error in compilation, just a different
	 * and perhaps unexpected behavior.
	 */
	@Override
	public void breathe() {
		System.out.println("The dog breathes");
	}

	@Override
	public void boop() {
		System.out.println("Snoop boop the " + this.name);
	}

	@Override
	public void boop(Dog dog) {
		System.out.println(dog.name + " Snoop boops " + this.name);
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Spot";
		Dog otherDog = new Dog();
		otherDog.name = "Cookie";
		
		dog.boop();
		otherDog.boop(dog);
	}
	
	
	
	
}