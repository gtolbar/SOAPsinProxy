
package com.pe.apps.schema;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Employee complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Employee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empid" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="empname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empalias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emppassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empdni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empemail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = { "empid", "empname", "empalias", "emppassword", "empdni", "empemail" })
public class Employee {

    @XmlElement(required = true)
    protected BigInteger empid;
    @XmlElement(required = true)
    protected String empname;
    @XmlElement(required = true)
    protected String empalias;
    @XmlElement(required = true)
    protected String emppassword;
    @XmlElement(required = true)
    protected String empdni;
    @XmlElement(required = true)
    protected String empemail;

    /**
     * Gets the value of the empid property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getEmpid() {
        return empid;
    }

    /**
     * Sets the value of the empid property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setEmpid(BigInteger value) {
        this.empid = value;
    }

    /**
     * Gets the value of the empname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * Sets the value of the empname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpname(String value) {
        this.empname = value;
    }

    /**
     * Gets the value of the empalias property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpalias() {
        return empalias;
    }

    /**
     * Sets the value of the empalias property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpalias(String value) {
        this.empalias = value;
    }

    /**
     * Gets the value of the emppassword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmppassword() {
        return emppassword;
    }

    /**
     * Sets the value of the emppassword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmppassword(String value) {
        this.emppassword = value;
    }

    /**
     * Gets the value of the empdni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpdni() {
        return empdni;
    }

    /**
     * Sets the value of the empdni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpdni(String value) {
        this.empdni = value;
    }

    /**
     * Gets the value of the empemail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpemail() {
        return empemail;
    }

    /**
     * Sets the value of the empemail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpemail(String value) {
        this.empemail = value;
    }

}
