package inheritance;
 /**
 * Inheritance is a pillar of object oriented programming. Inheritance is the
 * idea and behavior of reutilizing class definitions by extending them to
 * provide more detailed implementation.
 * 
 * For instance, we could create a more generic class called 'Computer' and
 * extend Computer to create more specific implementations, such as
 * 'DesktopComputer' and 'LaptopComputer'
 * 
 * When inheriting from a class, the inheriting class can utilize all of the
 * inherited classes fields and methods, although access modifiers must still be
 * respected.
 */
public class Computer {
	private String motherboard;
	private int GHz;
	private int ram;
 	public String getMotherboard() {
		return motherboard;
	}
 	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
 	public int getGHz() {
		return GHz;
	}
 	public void setGHz(int gHz) {
		GHz = gHz;
	}
 	public int getRam() {
		return ram;
	}
 	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void relocate() {
		System.out.println("You relocate the computer.");
	}
 	/**
	 * toString method is used to describe how an object should be presented when
	 * output as a String.
	 * 
	 * toString is an inherited method, if not defined it is still present because
	 * it was defined by the Object class, which every class extends implicitly
	 */
	@Override
	public String toString() {
		return "Computer [motherboard=" + motherboard + ", GHz=" + GHz + ", ram=" + ram + "]";
	}
 }