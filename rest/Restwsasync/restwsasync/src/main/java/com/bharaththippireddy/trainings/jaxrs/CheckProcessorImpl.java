package com.bharaththippireddy.trainings.jaxrs;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.NewCookie;

public class CheckProcessorImpl {

	@POST
	@Path("/checks")
	public void processChecks(@Suspended AsyncResponse response,
			ChecksList checks) {
		new Thread(() -> 
		{
			if(checks.getChecks()==null||checks.getChecks().isEmpty())
			{
				response.resume(new BadRequestException());
			}
			response.resume(true);
		}).start();
		
	}
}
