package inheritance;
 public class LaptopComputer extends Computer {
	private int batteryLife;
 	
	public int getBatteryLife() {
		return batteryLife;
	}
 	
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	
	public void relocate() {
		System.out.println("You walk to the other room with a laptop dangling from your hand. That was easy.");
	}
}