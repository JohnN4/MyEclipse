package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	Logger log = Logger.getRootLogger();
	
	
	/**
	 * Types of Advice
	 * @Before - Code is woven prior to join point method execution
	 * @After - Code is woven following join point method execution
	 * @AfterReturning - Code is woven following the return of a joint point method execution
	 * @AfterThrowing - Code is woven following join point throwing unhandled exception
	 * @Around - Code is woven before and after joint point execution
	 * 
	 * All types other than around can accept a JoinPoint reference, which is an object
	 * referring to the JoinPoint (method we are targeting)
	 * Around gets a PreceedingJoinPoint object which is similar to a JoinPoint object, but allows
	 * the targeted method to be called.
	 */
	// v-- Advice
	@Before("within(com.revature.beans..*)") // <-- pointcut
	public void logging(JoinPoint jp) {
		log.info("Calling method: " + jp.getSignature());
	}

//	@Pointcut("execution (public StringBuilder MyBean.*())")
	@Around("execution (public StringBuilder com.revature.beans.MyBean.*())")
	public StringBuilder aroundEx(ProceedingJoinPoint pjp) {
		
		System.out.println("Prior to");
		StringBuilder sb = null;
		try {
			sb = (StringBuilder) pjp.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		sb.append("!!!!!");
		System.out.println("After");
		return sb;
	}
}
