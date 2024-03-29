

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
    
    @Override
    public void init() {
    	System.out.println("Disney Servlet Initializing");
    	
    }
    @Override
    public void destroy() {
    	System.out.println("Disney Servlet Shutting Down");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		String movie=uri.substring("/ServletExample/disney/".length()).split("/")[0];
		String character =disneyService.getCharacter(movie);
		response.getWriter().write(character);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uri=request.getRequestURI();
	String[] arr=uri.substring("/ServletExample/disney/".length()).split("/");
	
	//Check to ensure that array is big enough
	if(arr.length <2) {
		response.setStatus(400);
		return;
	}
	//Call service method
	disneyService.setCharacter(arr[0], arr[1]);
	response.setStatus(201);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
