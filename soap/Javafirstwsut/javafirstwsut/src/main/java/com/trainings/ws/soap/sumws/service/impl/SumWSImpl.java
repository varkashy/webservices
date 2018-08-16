package com.trainings.ws.soap.sumws.service.impl;


import com.trainings.ws.soap.sumws.dto.SumRequest;
import com.trainings.ws.soap.sumws.dto.SumResponse;
import com.trainings.ws.soap.sumws.service.SumWS;

public class SumWSImpl implements SumWS {


    @Override
    public SumResponse calculateSum(SumRequest request) {
        int result=request.getNum1()+request.getNum2();
        SumResponse sumResponse=new SumResponse();
        sumResponse.setResult(result);
        return sumResponse;
    }
}
