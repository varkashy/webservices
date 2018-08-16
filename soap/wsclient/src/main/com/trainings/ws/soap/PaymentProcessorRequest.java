/**
 * PaymentProcessorRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trainings.ws.soap;

public class PaymentProcessorRequest  implements java.io.Serializable {
    private com.trainings.ws.soap.CreditCardInfo creditCardInfo;

    private java.lang.Double amount;

    public PaymentProcessorRequest() {
    }

    public PaymentProcessorRequest(
           com.trainings.ws.soap.CreditCardInfo creditCardInfo,
           java.lang.Double amount) {
           this.creditCardInfo = creditCardInfo;
           this.amount = amount;
    }


    /**
     * Gets the creditCardInfo value for this PaymentProcessorRequest.
     * 
     * @return creditCardInfo
     */
    public com.trainings.ws.soap.CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }


    /**
     * Sets the creditCardInfo value for this PaymentProcessorRequest.
     * 
     * @param creditCardInfo
     */
    public void setCreditCardInfo(com.trainings.ws.soap.CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }


    /**
     * Gets the amount value for this PaymentProcessorRequest.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentProcessorRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentProcessorRequest)) return false;
        PaymentProcessorRequest other = (PaymentProcessorRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditCardInfo==null && other.getCreditCardInfo()==null) || 
             (this.creditCardInfo!=null &&
              this.creditCardInfo.equals(other.getCreditCardInfo()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCreditCardInfo() != null) {
            _hashCode += getCreditCardInfo().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentProcessorRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.ws.trainings.com/", "PaymentProcessorRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.ws.trainings.com/", "CreditCardInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
