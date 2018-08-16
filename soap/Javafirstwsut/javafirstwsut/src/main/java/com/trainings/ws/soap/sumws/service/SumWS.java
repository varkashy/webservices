package com.trainings.ws.soap.sumws.service;



import com.trainings.ws.soap.sumws.dto.SumRequest;
import com.trainings.ws.soap.sumws.dto.SumResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="SumService")
public interface SumWS {

    @WebResult(name="ResponseElement")
    SumResponse calculateSum(@WebParam SumRequest request);
}
