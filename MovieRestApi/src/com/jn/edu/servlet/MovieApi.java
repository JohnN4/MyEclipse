package com.jn.edu.servlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/**
 * Servlet implementation class QueryREST
 */
@WebServlet("/MovieApi")
public class MovieApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieApi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String apiKey = "key";
		String movie = request.getParameter("movie");
		if (movie.contains(" ")) {
			String words[] = movie.split(" ");
			movie = "";
			for (String s : words) {
				if (movie.equals(""))
					movie = s;
				else
					movie += "%20" + s;
			}
		}
		response.getWriter().append("The movie: " + movie + "<br/>");
		HttpHost target = new HttpHost("www.omdbapi.com", 80, "http");
		@SuppressWarnings("deprecation")
		DefaultHttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet("/?apikey=" + apiKey + "&t=" + movie);

		HttpResponse hr = client.execute(target, get);
		HttpEntity entity = hr.getEntity();
		if (entity != null) {
			String entityStr = EntityUtils.toString(entity);

			try {
				JSONObject j = new JSONObject(entityStr);
				Iterator<String> keys = j.keys();

				Object attrActor = null;
				Object attrYear = null;
				Object attrGenre = null;
				while (keys.hasNext()) {
					String key = keys.next();

					// if you want to get all the attr
//					Object attr = j.get(key);
//					response.getWriter().append(key + ":" + attr.toString() + "<br/>");

					attrActor = j.get("Actors");
					attrYear = j.get("Year");
					attrGenre = j.get("Genre");

				}
				response.getWriter().append("Actors: " + attrActor.toString() + "<br/>");
				response.getWriter().append("Year: " + attrYear.toString() + "<br/>");
				response.getWriter().append("Genre: " + attrGenre.toString() + "<br/>");

			} catch (Exception e) {
				response.getWriter().append(e.getMessage() + "<br/>");
			}
		} else {
			response.getWriter().append("Query returned nothing<br/>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		System.out.println("In doPost method");
		// String apiKey = "c5f2547a69msh8ccf2fadb67a113p199017jsne93d0304827f";
	}

}
