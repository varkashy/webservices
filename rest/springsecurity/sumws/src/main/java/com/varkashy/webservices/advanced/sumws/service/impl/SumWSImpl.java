package com.varkashy.webservices.advanced.sumws.service.impl;

import com.varkashy.webservices.advanced.sumws.dto.SumRequest;
import com.varkashy.webservices.advanced.sumws.dto.SumResponse;
import com.varkashy.webservices.advanced.sumws.service.SumWS;

public class SumWSImpl implements SumWS {


    @Override
    public SumResponse calculateSum(SumRequest request) {
        int result=request.getNum1()+request.getNum2();
        SumResponse sumResponse=new SumResponse();
        sumResponse.setResult(result);
        return sumResponse;
    }
}
