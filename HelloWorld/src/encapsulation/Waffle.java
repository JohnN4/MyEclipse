package encapsulation;

public class Waffle {
	private String texture;
	private boolean glutenFree;
	private float crunchiness;

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public float getCrunchiness() {
		return crunchiness;
	}

	public void setCrunchiness(float crunchiness) {
		this.crunchiness = crunchiness;
	}


	
	public Waffle(String texture, boolean glutenFree, float crunchiness) {
		super();
		this.texture = texture;
		this.glutenFree = glutenFree;
		this.crunchiness = crunchiness;
	}

	public static void main(String[] args) {
//		Waffle myWaffle = new Waffle("Soft", true, 0.4f);
		
		// Default constructor
		// A constructor that every class is provided IF AND ONLY IF it has no
		// other constructor
		Waffle basicWaffle = new Waffle();
	}
}