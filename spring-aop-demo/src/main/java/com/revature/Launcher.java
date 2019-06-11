package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.revature.beans.MyBean;

@Configuration
@ComponentScan(basePackageClasses= {MyBean.class})
@EnableAspectJAutoProxy
public class Launcher {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.revature");
		MyBean myBean = context.getBean(MyBean.class);
		myBean.jumpOutOfAirplane();
		System.out.println(myBean.getName());
	}
}
