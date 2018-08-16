/**
 * PaymentProcessor_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trainings.ws.soap;

public class PaymentProcessor_ServiceLocator extends org.apache.axis.client.Service implements com.trainings.ws.soap.PaymentProcessor_Service {

    public PaymentProcessor_ServiceLocator() {
    }


    public PaymentProcessor_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentProcessor_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaymentProcessorPort
    private java.lang.String PaymentProcessorPort_address = "http://localhost:8080/javafirstwsut/services/paymentProcessor";

    public java.lang.String getPaymentProcessorPortAddress() {
        return PaymentProcessorPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentProcessorPortWSDDServiceName = "PaymentProcessorPort";

    public java.lang.String getPaymentProcessorPortWSDDServiceName() {
        return PaymentProcessorPortWSDDServiceName;
    }

    public void setPaymentProcessorPortWSDDServiceName(java.lang.String name) {
        PaymentProcessorPortWSDDServiceName = name;
    }

    public com.trainings.ws.soap.PaymentProcessor_PortType getPaymentProcessorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaymentProcessorPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaymentProcessorPort(endpoint);
    }

    public com.trainings.ws.soap.PaymentProcessor_PortType getPaymentProcessorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.trainings.ws.soap.PaymentProcessorSoapBindingStub _stub = new com.trainings.ws.soap.PaymentProcessorSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaymentProcessorPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentProcessorPortEndpointAddress(java.lang.String address) {
        PaymentProcessorPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.trainings.ws.soap.PaymentProcessor_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.trainings.ws.soap.PaymentProcessorSoapBindingStub _stub = new com.trainings.ws.soap.PaymentProcessorSoapBindingStub(new java.net.URL(PaymentProcessorPort_address), this);
                _stub.setPortName(getPaymentProcessorPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PaymentProcessorPort".equals(inputPortName)) {
            return getPaymentProcessorPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.ws.trainings.com/", "PaymentProcessor");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.ws.trainings.com/", "PaymentProcessorPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaymentProcessorPort".equals(portName)) {
            setPaymentProcessorPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
