package com.bharaththippireddy.trainings.ExceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RestExceptionMapper<E extends Throwable> implements
		ExceptionMapper<E> {

	@Override
	public Response toResponse(E arg0) {
		StringBuilder response = new StringBuilder("<response>");
		response.append("<status>ERROR</status>");
		response.append("<message>" + arg0.getMessage() + "</message>");
		response.append("</response>");
		return Response.serverError().entity(response.toString())
				.type(MediaType.APPLICATION_XML).build();
	}

}
