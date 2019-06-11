package edu.sollers.bootcamp.spring.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class DiExampleApplication1 {

	public static void main(String[] args) {
		//SpringApplication.run(DiExampleApplication.class, args);
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Part1 p = (Part1)context.getBean(Part1.class);
		Composite1 c = (Composite1)context.getBean(Composite1.class);
		p.setName("Frame");
		p.setDesc("Skeleton of the composite");
		c.setPart(p);
		c.printAll();
	}

}
