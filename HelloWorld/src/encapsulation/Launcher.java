package encapsulation;

import java.util.Scanner;

public class Launcher {

	
	public static void main(String[] args) {
		
		UnencapsulatedElevator elevator = new UnencapsulatedElevator();
		elevator.maxFloor = 20;
		elevator.minFloor = 1;
		
		//Autoimport -> ctrl+shift+o
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose an option: ");
			
			System.out.println("1: Exit the elevator");
			System.out.println("2. Press down button");
			System.out.println("3. Press up button");
			System.out.println("4. Check position");
			
			int option = scanner.nextInt();
			
			elevator.updateLocation();
			
			switch(option) {
				case 1: elevator.exit();
				case 2: elevator.downButton();
				case 3: elevator.upButton();
				case 4: System.out.println(elevator.position);break;
			}
			
			elevator.updateLocation();
		}
		
	}
}