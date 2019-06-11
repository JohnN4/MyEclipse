package inheritance;
 /**
 * Your task:
 * 
 * Create a class with both fields and methods.
 * Then extend the class twice.
 * 
 * You should override at least one method from the 
 * parent class.
 * 
 * You should demonstrate that fields defined on the 
 * parent class are accessible within the extending
 * class.
 * 
 * @author mitch
 *
 */
public class Launcher {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.setMotherboard("Zoinks 8200x");
		System.out.println(computer);
		computer.relocate();
		
		// This is a form of Abstraction
		Computer laptop = new LaptopComputer();
		laptop.relocate();
		// Our variable / field can hold anything that is
		// considered of that type, HOWEVER, we only have
		// access to information defined on the type the field
		// or variable is defined with, not the actual content
		// of the field/variable
		
		
		DesktopComputer desktop = new DesktopComputer();
		desktop.relocate();
		// instanceof - Comparison Operator
		//   		returns true if object is of that type
		
		if(laptop instanceof Computer) {
			System.out.println("You do.");
		} else {
			System.out.println("It wasn't.");
		}
		
		
		
		
 	}
}