package characters;
public class Monster extends Character {
    @Override
    public void die() {
        System.out.println("The " + this.getName() + " perishes!");
    }
    @Override
    public void action(Character target) {
        attack(target);
    }
    public Monster() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Monster(String name, int level, int power, int speed, int currentHealth, int maxHealth, int magic) {
        super(name, level, power, speed, currentHealth, maxHealth, magic);
        // TODO Auto-generated constructor stub
    }
    
    
    
}