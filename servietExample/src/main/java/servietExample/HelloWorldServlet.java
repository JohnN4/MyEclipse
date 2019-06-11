package servietExample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
/**
 * Servlet Hierarchy
 * Starts with interface:  Servlet
 * Implemented by:         GenericServlet
 * Extended by:            HttpServlet
 * Extended by:            DefaultServlet
 * Extended by:            you
 * @author lion4
 *
 */


public class HelloWorldServlet extends DefaultServlet {
	private static final long serialVersionUID = 5773746432327540430L;

	/**
	 * Service (in an HttpServlet) is a method used to delegate requests to an appropriate
	 * handler method based on the HTTP method utilized to make the request.
	 * HTTP method	Handler Method      CRUD operation			SQL
	 * GET 			-> doGet				read   				SELECT
	 * POST 		-> doPost				create				INSERT
	 * PUT 			-> doPut				update				UPDATE
	 * DELETE 		-> doDelete				delete				DELETE
	 */
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// Gets parameter in Servlet scope
		System.out.println(getInitParameter("name"));
		
		// Gets parameter in application scope
		System.out.println(getServletContext().getInitParameter("animal"));
		super.service(request, response);
		
		request.getSession().getAttribute("key");
		
		
		request.getAttribute("key");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Request received");
		String str = request.getRequestURI();
		System.out.println(str);
		String[] strArr = str.split("/");
		String name = strArr.length > 1 && strArr[3].length() > 0 ? strArr[3] : null;
		String htmlPrefix = "<!DOCTYPE html><html><head></head><body><h1>";
		String htmlSuffix = "</h1></body></html>";
		String message = "Hello";
		if(name != null) message += " " + name;
		response.getWriter().write(htmlPrefix + message + "!" + htmlSuffix);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write("Post request received!");
	}
}