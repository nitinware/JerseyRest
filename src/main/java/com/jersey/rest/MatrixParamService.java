package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/matrix")
public class MatrixParamService {

	
	@GET
	@Path("{year}")
	public Response getMatrixParams(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {
		return Response.status(200).entity("For Year - " + year + 
				" Matrix Params passed are, author - " + author + 
				", country - " + country).build();
	}
	
}
