
package com.pe.apps.ws;

import javax.xml.ws.WebFault;

import com.pe.apps.schema.EmployeeException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebFault(name = "employeeExceptionElement", targetNamespace = "http://com.pe.apps/schema")
public class EmployeeExceptionMessage extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private EmployeeException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public EmployeeExceptionMessage(String message, EmployeeException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EmployeeExceptionMessage(String message, EmployeeException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.pe.apps.schema.EmployeeException
     */
    public EmployeeException getFaultInfo() {
        return faultInfo;
    }

}
