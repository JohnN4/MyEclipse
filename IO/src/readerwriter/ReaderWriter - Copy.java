package readerwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter
 * FileReader
 * 
 */
public class ReaderWriter {
	public static void main(String[] args) {
		File file = new File("Writer.txt");
		try(PrintWriter pw = new PrintWriter(file)) {
			pw.write("Hello every body");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}