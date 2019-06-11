/**
 * 
 */
package edu.sollers.bootcamp.spring.simple;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author praka
 *
 */
@Component
public class Composite {
	@Autowired
	Part part;
	
	
	public Part getPart() {
		return part;
	}
	
	public void printAll() {
		System.out.println("Composite with part:");
		System.out.println(part.name + ": " + part.desc);
	}
}
