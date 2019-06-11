package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationSaver {
	
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		chicken.age = 5;
		chicken.color = "black";
		chicken.eggsPerDay = 1;
		chicken.hasFeathers = true;
		chicken.isFreerange = true;
		
		System.out.println(chicken);
		
		// Create file object so it knows where to create the file
		File file = new File("chicken.ser");
		
		// Get ObjectOutputStream by providing a FileOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			// Save our chicken
			oos.writeObject(chicken);
			System.out.println("Chicken saved!");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}