package inheritance;
 public class DesktopComputer extends Computer {
	private int[] pciSlot;
 	
	public int[] getPciSlot() {
		return pciSlot;
	}
 	
	public void setPciSlot(int[] pciSlot) {
		this.pciSlot = pciSlot;
	}
	
	/**
	 * This is overridding the method definition in Computer.
	 * We can make a method unoverridable by including
	 * the keyword final in its definition.
	 */
	public void relocate() {
		System.out.println("You power down the desktop computer, and begin unplugging all the cables" +
	". During the process you find several cables that you believe weren't attached to anything to begin"
	+ "with, but your not sure so you include those to. Then, piece by piece you begin moving the "
	+ "computer from one room to the next. Component by component. Eventually, you realize the place "
	+ " you had intended to move it, has no direct internet access or wifi.  You have made a mistake "
	+ "and shall live regretfully. You move to a third location, which presents a significant glare on"
	+ " the screen. However, due to your pride, you cannot the bear the looks of your loved ones as you"
	+ "move the computer a third time and insist that the glare is fine. You get nothing done for the "
	+ "next week.");
	}
}