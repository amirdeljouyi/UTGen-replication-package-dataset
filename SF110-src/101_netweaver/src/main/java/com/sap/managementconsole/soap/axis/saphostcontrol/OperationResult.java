/*******************************************************************************
 * Copyright (c) 2009, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kaloyan Raev (SAP AG) - initial API and implementation
 *******************************************************************************/
package com.sap.managementconsole.soap.axis.saphostcontrol;

/**
 * OperationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */
public class OperationResult  implements java.io.Serializable {
    private java.lang.String mOperationID;
    private com.sap.managementconsole.soap.axis.saphostcontrol.ResponseMessage[] mOperationResults;

    public OperationResult() {
    }

    public OperationResult(
           java.lang.String mOperationID,
           com.sap.managementconsole.soap.axis.saphostcontrol.ResponseMessage[] mOperationResults) {
           this.mOperationID = mOperationID;
           this.mOperationResults = mOperationResults;
    }


    /**
     * Gets the mOperationID value for this OperationResult.
     * 
     * @return mOperationID
     */
    public java.lang.String getMOperationID() {
        return mOperationID;
    }


    /**
     * Sets the mOperationID value for this OperationResult.
     * 
     * @param mOperationID
     */
    public void setMOperationID(java.lang.String mOperationID) {
        this.mOperationID = mOperationID;
    }


    /**
     * Gets the mOperationResults value for this OperationResult.
     * 
     * @return mOperationResults
     */
    public com.sap.managementconsole.soap.axis.saphostcontrol.ResponseMessage[] getMOperationResults() {
        return mOperationResults;
    }


    /**
     * Sets the mOperationResults value for this OperationResult.
     * 
     * @param mOperationResults
     */
    public void setMOperationResults(com.sap.managementconsole.soap.axis.saphostcontrol.ResponseMessage[] mOperationResults) {
        this.mOperationResults = mOperationResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResult)) return false;
        OperationResult other = (OperationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mOperationID==null && other.getMOperationID()==null) || 
             (this.mOperationID!=null &&
              this.mOperationID.equals(other.getMOperationID()))) &&
            ((this.mOperationResults==null && other.getMOperationResults()==null) || 
             (this.mOperationResults!=null &&
              java.util.Arrays.equals(this.mOperationResults, other.getMOperationResults())));
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
        if (getMOperationID() != null) {
            _hashCode += getMOperationID().hashCode();
        }
        if (getMOperationResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMOperationResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMOperationResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SAPHostControl", "OperationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOperationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mOperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOperationResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mOperationResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SAPHostControl", "ResponseMessage"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
