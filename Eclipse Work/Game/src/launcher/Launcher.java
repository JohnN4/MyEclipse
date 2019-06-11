package launcher;

import characters.Monster;
import characters.PlayerCharacter;

public class Launcher {

	public static void main(String[] args) {
		PlayerCharacter player = new PlayerCharacter("Homer", 10, 5, 3, 200, 200, 5);
		Monster peter = new Monster("Peter", 1, 6, 2, 50, 50, 4);
		
		while(!peter.isDead() && !player.isDead()) {
			player.action(peter);
			peter.action(player);
		}
		
		if(!player.isDead()) {
			System.out.println("You win!");
		} else {
			System.out.println("You lost! :(");
		}
	}
}