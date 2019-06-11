package scanner;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me a range!");
		
		while(!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("I said, a number between 1 and 10!");
		}
		
		int max = scanner.nextInt();
		
		
		int num = ((int) (Math.random() * max)) + 1;
		System.out.println("Pick a number between 1 and " + max + "!");
		while(true) {
			while(!scanner.hasNextInt()) {
				scanner.nextLine();
				System.out.println("I said, a number between 1 and 10!");
			}
			
			int guess = scanner.nextInt();
			if(guess == num) break;
			System.out.println("Nope! You were off by " + Math.abs(guess - num) + "!");
			
		}
		System.out.print("You got it!");
		
		
	}
	
}