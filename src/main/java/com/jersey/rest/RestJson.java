package com.jersey.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jersey.model.User;

@Path("/json/user")
public class RestJson {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser() {
		User user =  new User();
		user.setFirstName("Nitin");
		user.setLastName("Ware");
		user.setAddress("Jersey City");
		return user;
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(User user) {
		String result = "User - " + user.getFirstName() + " " + user.getLastName() 
				+ " living at Address - " + user.getAddress() + " saved successfully !!!";
		return Response.status(201).entity(result).build();
	}

}
