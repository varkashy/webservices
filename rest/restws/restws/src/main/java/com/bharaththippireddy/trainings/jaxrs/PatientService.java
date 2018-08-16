package com.bharaththippireddy.trainings.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bharaththippireddy.trainings.jaxrs.exceptions.SomeBusinessException;

@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface PatientService {

	@GET
	@Path("/patients/{id}")
	Patient getPatient(@PathParam("id") String id);

	@PUT
	@Path("/patients/")
	Response updatePatient(Patient patient);

	@POST
	@Path("/patients/")
	Response addPatient(Patient patient);

	@DELETE
	@Path("/patients/{id}")
	Response deletePatients(@PathParam("id") String id) throws SomeBusinessException;

	@Path("/prescriptions/{id}")
	Prescription getPrescription(@PathParam("id") String prescriptionId);

}