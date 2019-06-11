package characters;

import util.ScannerHelper;

public class PlayerCharacter extends Character {

	
	
	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
	public void heal(Character target) {
		int healed = (int)(Math.random() * this.getMagic());
		
		// This will allow them to get more health than max health
		target.setCurrentHealth(target.getCurrentHealth() + healed);
	}

	@Override
	public void action(Character target) {		
		System.out.println("1. Attack");
		System.out.println("2. Cast Heal");
		System.out.println("3. Run");
		System.out.println("4. Cry");
		
		int choice = ScannerHelper.getInput(4);
		
		switch(choice) {
			case 1: attack(target); break;
			case 2: heal(this); break;
			case 3: System.out.println("The developers didn't finish this option yet. sorry. :("); break;
			case 4: System.out.println(this.getName() + " is crying.");
		}
	}

	public PlayerCharacter() {
		super();
	}

	public PlayerCharacter(String name, int level, int power, int speed, int currentHealth, int maxHealth, int magic) {
		super(name, level, power, speed, currentHealth, maxHealth, magic);
	}
	
	
	
}