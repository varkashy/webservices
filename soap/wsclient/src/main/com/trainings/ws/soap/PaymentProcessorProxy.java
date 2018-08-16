package com.trainings.ws.soap;

public class PaymentProcessorProxy implements com.trainings.ws.soap.PaymentProcessor_PortType {
  private String _endpoint = null;
  private com.trainings.ws.soap.PaymentProcessor_PortType paymentProcessor_PortType = null;
  
  public PaymentProcessorProxy() {
    _initPaymentProcessorProxy();
  }
  
  public PaymentProcessorProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentProcessorProxy();
  }
  
  private void _initPaymentProcessorProxy() {
    try {
      paymentProcessor_PortType = (new com.trainings.ws.soap.PaymentProcessor_ServiceLocator()).getPaymentProcessorPort();
      if (paymentProcessor_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paymentProcessor_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paymentProcessor_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paymentProcessor_PortType != null)
      ((javax.xml.rpc.Stub)paymentProcessor_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.trainings.ws.soap.PaymentProcessor_PortType getPaymentProcessor_PortType() {
    if (paymentProcessor_PortType == null)
      _initPaymentProcessorProxy();
    return paymentProcessor_PortType;
  }
  
  public com.trainings.ws.soap.PaymentProcessorResponse processPayment(com.trainings.ws.soap.PaymentProcessorRequest paymentProcessorRequest) throws java.rmi.RemoteException{
    if (paymentProcessor_PortType == null)
      _initPaymentProcessorProxy();
    return paymentProcessor_PortType.processPayment(paymentProcessorRequest);
  }
  
  
}