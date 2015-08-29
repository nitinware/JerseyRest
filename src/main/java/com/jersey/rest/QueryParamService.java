package com.jersey.rest;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/query")
public class QueryParamService {
	
	@GET
	@Path("/param")
	public Response getQueryParams(
			@DefaultValue("1000") @QueryParam("from") int from, 
			@DefaultValue("999") @QueryParam("to") int to, 
			@DefaultValue("name") @QueryParam("orderBy") List<String> orderBy) {
		
		return Response.status(200).entity("Query Params called, from - " + from 
				+ ", to : " + to + ", orderBy " + orderBy.toString()).build();
		
	}

}
