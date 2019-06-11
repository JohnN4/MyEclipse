package encapsulation;

public class EncapsulatedElevator {
	private float position;
	private boolean doorsOpen;
	private float speed;
	private int maxFloor;
	private int minFloor;
	private boolean musicPlaying;
	private int goalFloor;
	
	// Constructor Method
	// 1. NO return type! Not even void
	// 2. The name of the method must be the same
	// as the class.
	
	public EncapsulatedElevator(float position, int maxFloor, int minFloor, float speed) {
		// shadowed variable, two variables named position
		// You need to use 'this' to access the object field
		this.position = position;
		// this one does nothing!
		// position = position;
		this.maxFloor = maxFloor;
		this.minFloor = minFloor;
		this.speed=speed;
		this.goalFloor = Math.round(position);
	}
	
	public void updateLocation() {
			
		if(Math.abs(position - goalFloor) < speed) {
			// If we're close enough to the goal, stop at the goal
			position = goalFloor;
			if(!doorsOpen) doorOpen();
		} else {
			// If we are above the goal floor
			if (position > goalFloor) {
				// Move down
				position -= speed;
			} else {
				// Move up
				position += speed;
			}
		}
	}
	
	public void exit() {
		if(!doorsOpen) {
			System.out.println("The door was closed. Ouch.");
			return;
		}
		
		if (Math.abs(position - Math.round(position)) < 0.1) {
			System.out.println("You have successfully exited the elevator. Good work!");
			System.exit(1);
		} else {
			System.out.println("Elevators are dangerous. :(");
			System.exit(1);
		}
	}
	
	public void selectFloor(int floor) {
		if(floor < minFloor || floor > maxFloor) {
			System.out.println("There is no button for that floor");
			return;
		}
		
		goalFloor = floor;
		doorClose();
	}
	
	private void doorOpen() {
		System.out.println("The doors open");
		this.doorsOpen = true;
	}
	
	private void doorClose() {
		System.out.println("The doors close");
		this.doorsOpen = false;
	}
}