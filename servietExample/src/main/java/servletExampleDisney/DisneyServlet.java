package servletExampleDisney;


import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.servlets.DefaultServlet;

/**
 * Servlet implementation class DisneyServlet
 */
public class DisneyServlet extends DefaultServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    private DisneyService disneyService =new DisneyService();   
	
    /**
     * @see DefaultServlet#DefaultServlet()
     */
    public DisneyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarding example
//		System.out.println("Forward from Disney to Hello world");
//		getServletContext().getRequestDispatcher("/hello/").forward(request, response);
		
//		redirect
//		response.sendRedirect("http://www.google.com");
		response.setHeader("Location", "http://www.google.com");//other way of doing redirect
		response.setStatus(302);
		
//		String uri=request.getRequestURI();
//		String movie=uri.substring("/servietExample/disney/".length()).split("/")[0];
//		String character =disneyService.getCharacter(movie);
//		response.getWriter().write(character);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
