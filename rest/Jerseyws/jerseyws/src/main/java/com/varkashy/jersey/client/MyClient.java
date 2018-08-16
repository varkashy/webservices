package com.varkashy.jersey.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class MyClient {

	public static void main(String[] args) {
		Client newClient = ClientBuilder.newClient();
		String string = newClient.target("http://localhost:8080/jerseyws/restapi/myresource").request().get(String.class);
		System.out.println(string);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
