package com.revature.frontcontroller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContainerController {

	
	public void get(HttpServletRequest request, HttpServletResponse response) {
	
		//Get cookie from request-cookie sent by the client
		Cookie[] cookies=	request.getCookies();
		if(!(cookies==null || cookies.length<1)) {
		
			for(Cookie cookie : cookies){
			System.out.println(cookie.getName()+ ":" + cookie.getValue());
		}
		}
		Cookie cookie=new Cookie("my-cookie","super-test-value");
		response.addCookie(cookie);
		
		// Session 
				// A session is intended to identify a user who is sending requests.
				// Sessions collect key value pairs which can then be accessed between requests
				// This allows us to store information about a user throughout the lifetime of 
				// session.
				// How it works:
				// Java produces a cookie called the J_SESSION_ID that contains a unique token
				// This token is then provided on future requests, which identifies which value
				// map should be provided for the session.
				// Limitations:
				// 1. Session information is stored in memory, this means when the application shuts
				// down, the session and all session data are lost.
				// 2. Also due to information being stored in memory, this makes application stateful.
				// The application must store data for individual users in memory. As a consequence,
				// the memory requirements of the application will grow with the number of users.
				// This results in an application that will not scale well.
		
		
		HttpSession session= request.getSession();
		session.setAttribute("name", "John");
		
	}
	
	/**
	 * 
	 * print out what is included in the request body
	 * throws IOException
	 */
	
public void post(HttpServletRequest request, HttpServletResponse response) throws IOException {
	//Getting the session object
	HttpSession session= request.getSession();
	//Getting the value stored with the key 'name'
	String name=(String)session.getAttribute("name");
	//Printout out a massage using 'name'
	System.out.println("Message from" +name);
	String line=null;
	while(( line =	request.getReader().readLine())!=null) {
	System.out.println(line);
	}
		
	}
}
