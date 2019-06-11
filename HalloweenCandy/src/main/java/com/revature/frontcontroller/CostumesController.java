package com.revature.frontcontroller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.frontcontroller.Costume;
import com.revature.frontcontroller.CostumeService;

public class CostumesController {

	CostumeService costumeService = new CostumeService();
	
	public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uri = request.getRequestURI();
		String[] parts = uri.substring("/HalloweenCandy/costumes/".length()).split("/");
		if (parts[0].length() == 0) {
			// get all costumes
			
		} else {
			// get costume by ID
			String costume = parts[0];
			int id = 0;

			try {
				id = Integer.parseInt(costume);
				Costume costumeInstance = costumeService.getCostumeById(id);
				if(costumeInstance == null) {
					response.sendError(404);
				}
				ObjectMapper om = new ObjectMapper();
				om.writeValue(response.getWriter(), costumeInstance);
				
			} catch (NumberFormatException e) {
				System.out.println("No costume found");
				// could assume that this is the name
				response.sendError(404);
				return;
			}

		}

	}

	public void post(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ObjectMapper om = new ObjectMapper();
		Costume costume = om.readValue(request.getReader(), Costume.class);
		costume=costumeService.saveCostume(costume);
		om.writeValue(response.getWriter(), costume);
		
	}

}
