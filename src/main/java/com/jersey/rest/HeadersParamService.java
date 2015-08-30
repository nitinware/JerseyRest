package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/headers")
public class HeadersParamService {
	
	@GET
	@Path("/get")
	public Response getHeaders(@HeaderParam("user-agent") String userAgent) {
		return Response.status(200)
				.entity("Get Headers is called, userAgent - " + userAgent)
				.build();
	}
	
}
