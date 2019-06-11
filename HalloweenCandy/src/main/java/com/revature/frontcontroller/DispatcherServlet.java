package com.revature.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

public class DispatcherServlet extends DefaultServlet{

	
	CandyController candyController = new CandyController();
	ContainerController containerController = new ContainerController();
	CostumesController costumesController = new CostumesController();

	
	
	//Header
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		super.service(request, response);
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
//		response.getWriter().write("Hello servlet");
		Routes routes =getRoutes(request);
		
		switch(routes) {
		case CANDY: candyController.get(request,response);break;
		case CONTAINERS: containerController.get(request, response); break;
		case COSTUMES: costumesController.get(request, response); break;
		case STATIC: writeStaticFile (request, response);break;
		case NOT_FOUND:
		default: response.setStatus(404);
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Routes route = getRoutes(request);
		
		switch(route) {
			case CANDY: candyController.post(request, response); break;
			case CONTAINERS: containerController.post(request, response); break;
			case COSTUMES: costumesController.post(request, response); break;
			case NOT_FOUND:
			default: response.setStatus(404);
		}
	}
	
	static Routes getRoutes(HttpServletRequest request) {
		System.out.println(request.getRequestURI());
		String suffix=request.getRequestURI().substring("/HalloweenCandy/".length());
		String routesString=suffix.split("/")[0];
		try {
			return Routes.valueOf(routesString.toUpperCase());
		}catch(IllegalArgumentException e) {
			return Routes.NOT_FOUND;
		}
		
		
	}
	
	void writeStaticFile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getNamedDispatcher("default");
		HttpServletRequest wrapped = new HttpServletRequestWrapper(request) {
			public String getServletPath() { return ""; }
		};
		rd.forward(wrapped, response);
	}
	
	
}





