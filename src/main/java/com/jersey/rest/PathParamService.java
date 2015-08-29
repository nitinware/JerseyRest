package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/path")
public class PathParamService {

	@GET
	@Path("{id}")
	public Response getSingleParam(@PathParam("id") String id) {
		return Response.status(200).entity("Single Path Param Passed is, ID - " + id).build();
	}
	
	@GET
	@Path("{year}/{month}/{day}")
	public Response getMultiParams(@PathParam("year") int year, 
									@PathParam("month") int month,
									@PathParam("day") int day) {
		String date = year + "/" + month + "/" + day;
		return Response.status(200).entity("Multi Path Params passed, year/month/day - " + date).build();
	}
	
}
