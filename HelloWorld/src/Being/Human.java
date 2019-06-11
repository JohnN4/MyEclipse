package Being;

public class Human {
private String humanbeing;
private int height;
private boolean shoes;
private boolean pride;

public String beinghuman() {
	return humanbeing;
	
}

public String getHumanbeing() {
	return humanbeing;
}

public void setHumanbeing(String humanbeing) {
	this.humanbeing = humanbeing;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public boolean isShoes() {
	return shoes;
}

public void setShoes(boolean shoes) {
	this.shoes = shoes;
}

public boolean isPride() {
	return pride;
}

public void setPride(boolean pride) {
	this.pride = pride;
}

public void like() {
	System.out.println("shoes.");
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


}
