package com.revature.frontcontroller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CandyController {

	List<Candy>candies=new ArrayList<>();
	{
		candies.add(new Candy(0,"twix","carmel,chocolate, cookie","chocolate bar",true,true,2,new BigDecimal(2)));
		
		
		
	}
	
	
	public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//localhost:8080/HalloweenCandy/candy?candy=1
		//http://localhost:8080/HalloweenCandy/static/test.html
		String param=request.getParameter("candy");
		ObjectMapper mapper=new ObjectMapper();
		
		if(param==null) {
			//send all candy
			
//			response.getWriter().write(candies.toString());
			mapper.writeValue(response.getWriter(), candies);
		}else {
		int id=Integer.parseInt(param);
		mapper.writeValue(response.getWriter(), candies.get(id));
		}
		
	}
	
	
	public void post(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		Candy candy =mapper.readValue(request.getReader(), Candy.class);
		candy.setId (candies.size()-1);
		candies.add(candy);
		System.out.println("Added candy:"+ candy);
		mapper.writeValue(response.getWriter(), candy);
		
		
		
	}
	
	
	
	
	
	
	// b4 we created Candy class
//	List<String>candies=new ArrayList<>();
//	{
//		candies.add("snickers");
//		candies.add("candy corn");
//		candies.add("caramel m&ms");
//		candies.add("svenska fish");
//		candies.add("hot tamales");
//	}
//	
//	public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		//localhost:8080/HalloweenCandy/candy?candy=1
//		//http://localhost:8080/HalloweenCandy/static/test.html
//		String param=request.getParameter("candy");
//		if(param==null) {
//			response.getWriter().write(candies.toString());
//		}else {
//		int id=Integer.parseInt(request.getParameter("candy"));
//		response.getWriter().write(candies.get(id));
//		}
//		
//	}
	
//	public void post(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		candies.add(request.getParameter("candy"));
//		response.getWriter().write(request.getParameter("candy")
//				+ "added with id" + (candies.size()-1));
//	}
	
}
