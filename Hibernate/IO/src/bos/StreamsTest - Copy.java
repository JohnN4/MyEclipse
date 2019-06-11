package bos;
 import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 /**
 * IO - Input/Output - Communication Outside of our Application
 * Using IO to write to files and read from files
 * 
 * The IO architecture is quite large. There are three main categories of IO
 * that have been introduced over the years. These are in three separate packages:
 * 
 * io package <---- This is what we will be doing
 * nio (new io) package
 * nio2 (new io 2) package
 * 
 * IO involves a lot of new and fun exceptions. Most of these will be kinds of
 * IOException. Which means, we can catch almost all of these using the parent class
 * IOException, rather than individually for the more specific exception types.
 * 
 * Using IO requires us to gain access to external systems. We should use these resources
 * responsibly. When you're done with a file, close the resource. The keyword 'finally' will be
 * very useful for closing resources.
 * 
 * Try-With-Resources : Is a fairly new Java language feature that allows Java to manage the
 * closing of resources that implement the AutoClosable interface automatically at the end
 * of a try/catch block.
 * 
 * try (resource declaration) {
 * 
 * }
 */
public class StreamsTest {
	
	public static void main(String[] args) {
		
		// Declares the location of the file we intend to utilize
		File file = new File("./stored-string.txt");
		
		// Try with resources block - OutputStream will be automatically closed
		try(OutputStream os = new FileOutputStream(file)) {
			// auto-import : ctrl/cmd+shift+o 			
			String outputString = "Hello everyone, this is IO";
			os.write(outputString.getBytes());
		} catch(IOException e) {
			System.out.println("Something has gone horribly wrong");
			e.printStackTrace();
		}
	}
	
}