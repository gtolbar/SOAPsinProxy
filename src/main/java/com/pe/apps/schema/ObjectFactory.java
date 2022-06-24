
package com.pe.apps.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.pe.apps.schema package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeRequestElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeRequestElement");
    private final static QName _EmployeeResponseElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeResponseElement");
    private final static QName _EmployeeExceptionElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeExceptionElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pe.apps.schema
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeRequest }
     *
     */
    public EmployeeRequest createEmployeeRequest() {
        return new EmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeResponse }
     *
     */
    public EmployeeResponse createEmployeeResponse() {
        return new EmployeeResponse();
    }

    /**
     * Create an instance of {@link EmployeeException }
     *
     */
    public EmployeeException createEmployeeException() {
        return new EmployeeException();
    }

    /**
     * Create an instance of {@link Employee }
     *
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRequest }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeRequestElement")
    public JAXBElement<EmployeeRequest> createEmployeeRequestElement(EmployeeRequest value) {
        return new JAXBElement<EmployeeRequest>(_EmployeeRequestElement_QNAME, EmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeResponseElement")
    public JAXBElement<EmployeeResponse> createEmployeeResponseElement(EmployeeResponse value) {
        return new JAXBElement<EmployeeResponse>(_EmployeeResponseElement_QNAME, EmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeException }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeExceptionElement")
    public JAXBElement<EmployeeException> createEmployeeExceptionElement(EmployeeException value) {
        return new JAXBElement<EmployeeException>(_EmployeeExceptionElement_QNAME, EmployeeException.class, null,
                                                  value);
    }

}
