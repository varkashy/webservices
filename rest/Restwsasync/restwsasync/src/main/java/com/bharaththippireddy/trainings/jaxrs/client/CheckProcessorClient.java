package com.bharaththippireddy.trainings.jaxrs.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.bharaththippireddy.trainings.jaxrs.ChecksList;

public class CheckProcessorClient {

	public static void main(String[] args) {

		Client newClient = ClientBuilder.newClient();
		WebTarget path = newClient.target("http://localhost:8080/restwsasync/services/checkService").path("/checks");
		AsyncInvoker async = path.request().async();
		Future<Boolean> future=async.post(Entity.entity(new ChecksList(), MediaType.APPLICATION_XML), new ChecksResponseCallbackHandler());
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Future<Boolean> future = async.post(Entity.entity(new ChecksList(), MediaType.APPLICATION_XML),Boolean.class);
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			if(e.getCause() instanceof BadRequestException)
			{
				BadRequestException bException=(BadRequestException)e.getCause();
				System.out.println("Checks should be provided "+e);
			}
			else
				e.printStackTrace();
		}*/
	}

}
