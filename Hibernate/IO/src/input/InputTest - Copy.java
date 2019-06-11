package input;
 import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
 /**
 * Reading input from a file
 *
 */
public class InputTest {
	public static void main(String[] args) throws InterruptedException {
		// Declare file we intend to work with
		File file = new File("./stored-string.txt");
		byte[] buffer = new byte[10];
		// Open resource using try-with-resource and FileInputStream
		try (InputStream is = new FileInputStream(file)) {
			int bytesRead = 0;
			// While we've not reached end of file (and each time writing new bytes from file to the buffer)
			while((bytesRead = is.read(buffer)) != -1) {
				// Print string created from byte buffer
				System.out.print(new String(buffer).substring(0, bytesRead));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}