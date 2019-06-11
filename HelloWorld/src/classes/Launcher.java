package classes;
 public class Launcher {
	public static void main(String[] args) {
		// Instantiation of an object
		Animal myAnimal = new Animal();
		myAnimal.name = "Wallaby";
		myAnimal.armCount = 2;
		myAnimal.furColor = "brown";
		myAnimal.eyeColor = "black";
		myAnimal.weight = 30.0;
		myAnimal.hasWings = false;
		
		myAnimal.move();
		myAnimal.fly();
		
		Animal bird = new Animal();
		bird.name = "bird";
		bird.hasWings = true;
		bird.fly();
	}
}