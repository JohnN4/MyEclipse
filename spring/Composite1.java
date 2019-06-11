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
public class Composite1 {
	//@Autowired
	Part1 part;
	
	@Autowired
	public void setPart(Part1 part) {
		this.part = part;
	}
	public Part1 getPart() {
		return part;
	}
	
	public void printAll() {
		System.out.println("Composite with part:");
		System.out.println(part.name + ": " + part.desc);
	}
}
