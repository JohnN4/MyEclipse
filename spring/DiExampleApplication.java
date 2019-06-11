package edu.sollers.bootcamp.spring.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DiExampleApplication.class, args);
		AbstractApplicationContext context = new AnnotationConfigApplicationContext("edu.sollers.bootcamp.spring.simple");
		Composite c = (Composite)context.getBean("composite");
		Part p = c.getPart();
		p.setName("Frame");
		p.setDesc("Skeleton of the composite");
		c.printAll();
	}

}
