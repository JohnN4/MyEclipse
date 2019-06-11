package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationLoader {
	public static void main(String[] args) {
		Chicken chicken =null;
		
		File file=new File("./chicken.ser");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			chicken = (Chicken)ois.readObject();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(chicken);		
	}
}
