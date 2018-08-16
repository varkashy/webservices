package com.bharaththippireddy.trainings.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bharaththippireddy.trainings.jaxrs.exceptions.SomeBusinessException;




public class PatientServiceImpl implements PatientService {
	private static final Logger logger= LogManager.getLogger();
	private long currentId = 123;
	Map<Long, Patient> patients = new HashMap<>();
	Map<Long, Prescription> prescriptions = new HashMap<>();
	

	public PatientServiceImpl() {
		init();
	}

	final void init() {
		Patient patient = new Patient();
		patient.setName("John");
		patient.setId(currentId);
		patients.put(patient.getId(), patient);

		Prescription prescription = new Prescription();
		prescription.setDescription("prescription 223");
		prescription.setId(223);
		prescriptions.put(prescription.getId(), prescription);
	}

	public Response addPatient(Patient patient) {
		logger.debug("... invoking for patient "+patient.getName());
		patient.setId(++currentId);
		patients.put(patient.getId(),patient);
		return Response.ok(patient).build();
	}

	public Patient getPatient(String id) {
		logger.debug("... invoking getPatient for patient id "+id);
		Long idField=Long.parseLong(id);
		Patient patient = patients.get(idField);
		if(patient==null)
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		return patient;
	}

	public Response updatePatient(Patient updatedPatient) {
		logger.debug("... invoking updatePatient for patient id "+updatedPatient.getId());
		Patient currentPatient = patients.get(updatedPatient.getId());
		if(currentPatient!=null)
		{
			patients.put(updatedPatient.getId(), updatedPatient);
			return Response.ok().build();
		}
		return Response.notModified().build();
	}

	public Response deletePatients(String id) throws SomeBusinessException {
		logger.debug("... invoking deletePatients for patient id "+id);
		Patient currentPatient = patients.get(Long.parseLong(id));
		Response response=null;
		if(currentPatient!=null)
		{
			patients.remove(currentPatient.getId());
			response= Response.ok().build();
		}
		else {
			throw new SomeBusinessException("Business Exception");
		}
		return response;
	}

	public Prescription getPrescription(String prescriptionId) {
		long long1 = Long.parseLong(prescriptionId);
		Prescription prescription = prescriptions.get(long1);
		return prescription;
	}

}
