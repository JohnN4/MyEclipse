package characters;
public abstract class Character {
    private String name;
    private int level;
    private int power;
    private int speed;
    private int currentHealth;
    private int maxHealth;
    private int magic;
    public abstract void die();
    public abstract void action(Character target);
    public void takeDamage(int damage) {
        currentHealth -= damage;
        System.out.println(this.name + " takes " + damage + " damage!");
        if (currentHealth <= 0) {
            die();
        }
    }
    
    public void attack(Character target) {
        // We should probably if the character is dead
        int damage = (int)(Math.random() * this.getPower());
        System.out.println(this.name + " attacks " + target.name);
        target.takeDamage(damage);
    }
    
    public boolean isDead() {
        return currentHealth <= 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getMagic() {
        return magic;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public Character(String name, int level, int power, int speed, int currentHealth, int maxHealth, int magic) {
        super();
        this.name = name;
        this.level = level;
        this.power = power;
        this.speed = speed;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.magic = magic;
    }
    public Character() {
        super();
        // TODO Auto-generated constructor stub
    }
}