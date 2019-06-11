package serialization;

import java.io.Serializable;

/**
 * The Serializable interface is what is called a "Marker Interface".
 * A Marker Interface is a kind of interface which has no methods. A Marker Interface
 * is simply used to define that something is something, for use in some external
 * code.
 * 
 * Serialization: It writes the current object state to file as Java bytecode 
 * (proprietary to Java). 
 *
 */
public class Chicken implements Serializable {
	
	// we should update this everytime we change this class
	private static final long serialVersionUID = 8520945356056688598L;
	
	// Object state is the values of fields
	public boolean hasFeathers;
	public boolean isFreerange;
	public int age;
	public int eggsPerDay;
	public String color;
	
	public void fly() {
		if(hasFeathers) {
			System.out.println("The chicken briefly flies through the air");
		} else {
			System.out.println("The chicken futily flaps its featherless wings.");
		}
	}
	
	public void cluck() {
		System.out.println("Cluck");
	}
	
	public void crossRoad() {
		cluck();
	}

	@Override
	public String toString() {
		return "Chicken [hasFeathers=" + hasFeathers + ", isFreerange=" + isFreerange + ", age=" + age + ", eggsPerDay="
				+ eggsPerDay + ", color=" + color + "]";
	}
	
	
}