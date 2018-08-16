/**
 * PaymentProcessor_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trainings.ws.soap;

public interface PaymentProcessor_Service extends javax.xml.rpc.Service {
    public java.lang.String getPaymentProcessorPortAddress();

    public com.trainings.ws.soap.PaymentProcessor_PortType getPaymentProcessorPort() throws javax.xml.rpc.ServiceException;

    public com.trainings.ws.soap.PaymentProcessor_PortType getPaymentProcessorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
