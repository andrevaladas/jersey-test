package com.valadas.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Demo
 * 	In this example, web request from "projectURL/rest/hello/" will match to "MessageService", via @Path("/message").
 * 	And the "{any values}" from "projectURL/rest/message/{any values}" will match to parameter annotated with @PathParam.
 *  URL : http://localhost:8080/jersey-test/rest/message/andrevaladas
 * 
 * @author andre.silva
 */
@Path("/message")
public class MessageService {

	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String param) {

		String output = "Message from Jersey is : " + param;

		return Response.status(200).entity(output).build();

	}
}