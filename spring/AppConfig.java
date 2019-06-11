/**
 * 
 */
package edu.sollers.bootcamp.spring.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author praka
 *
 */
@Configuration

public class AppConfig {
	@Bean
	public Composite1 getComposite() {
		Composite1 c = new Composite1();
		return c;
	}
	
	@Bean
	public Part1 getPart() {
		Part1 p = new Part1();
		return p;
	}
}
