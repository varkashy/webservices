package com.varkashy.webservices.advanced.sumws.service;

import com.varkashy.webservices.advanced.sumws.dto.SumRequest;
import com.varkashy.webservices.advanced.sumws.dto.SumResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="SumService")
public interface SumWS {

    @WebResult(name="ResponseElement")
    SumResponse calculateSum(@WebParam SumRequest request);
}
