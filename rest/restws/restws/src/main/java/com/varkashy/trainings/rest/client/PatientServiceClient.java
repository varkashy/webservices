package com.varkashy.trainings.rest.client;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bharaththippireddy.trainings.jaxrs.Patient;

public class PatientServiceClient {

	private static final String PATIENT_SERVICE_URL="http://localhost:8080/restws/services/patientService";
	private static final Logger log=LogManager.getLogger(PatientServiceClient.class);
	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id", 123);
		Patient patient = target.request().get(Patient.class);
		log.error(patient.getName());
		
		WebTarget putTarget=client.target(PATIENT_SERVICE_URL).path("/patients");
		patient.setName("NewName");
		Response put = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
		log.error(put.getStatus());
		put.close();
		Patient newPatient=new Patient();
		newPatient.setName("AMNew");
		WebTarget postTarget=client.target(PATIENT_SERVICE_URL).path("/patients");
		Patient post = postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML), Patient.class);
		log.error(post.getId());
		client.close();
	}

}
