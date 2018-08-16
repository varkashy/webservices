package com.bharaththippireddy.trainings.jaxrs;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bharathippireddy.trainings.jaxrs.dto.Passenger;
import com.bharathippireddy.trainings.jaxrs.dto.PassengerList;


@Path("/Passenger")
@Produces("application/xml")
public class PassengerService {

	private static final Logger log=LogManager.getLogger(PassengerService.class);
	PassengerList passengersList = new PassengerList();

	public PassengerService() {
		init();
	}

	public void init() {
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();
		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setName("Bharath");
		passengers.add(passenger);
		passengersList.setPassengers(passengers);
	}

	@GET
	public PassengerList getPassengers(@QueryParam("start") int start, @QueryParam("size") int size,@HeaderParam("agent") String agent
			,@Context HttpHeaders headers) {

		log.error(" Start value is "+start);
		log.error(" size value is "+size);
		log.error(" agent value is "+agent);
		MultivaluedMap<String, String> requestHeaders = headers.getRequestHeaders();
		for(String str:requestHeaders.keySet())
			log.error(requestHeaders.get(str));
		Map<String, Cookie> cookies = headers.getCookies();
		for(Entry<String,Cookie> entry:cookies.entrySet())
		{
			log.error(entry.getKey()+"-"+entry.getValue());
		}
		return passengersList;
	}

	@POST
	public void addPassenger(@FormParam("firstname") String firstName,@FormParam("lastname") String lastName) {

		log.error(" firstname value is "+firstName);
		log.error(" lastname value is "+lastName);
	}

}
