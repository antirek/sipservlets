//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.17 at 04:43:59 PM WET 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee11.sbb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "ejbRefName",
    "ejbRefType",
    "home",
    "remote"
})
@XmlRootElement(name = "ejb-ref")
public class EjbRef {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "ejb-ref-name", required = true)
    protected EjbRefName ejbRefName;
    @XmlElement(name = "ejb-ref-type", required = true)
    protected EjbRefType ejbRefType;
    @XmlElement(required = true)
    protected Home home;
    @XmlElement(required = true)
    protected Remote remote;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the ejbRefName property.
     * 
     * @return
     *     possible object is
     *     {@link EjbRefName }
     *     
     */
    public EjbRefName getEjbRefName() {
        return ejbRefName;
    }

    /**
     * Sets the value of the ejbRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbRefName }
     *     
     */
    public void setEjbRefName(EjbRefName value) {
        this.ejbRefName = value;
    }

    /**
     * Gets the value of the ejbRefType property.
     * 
     * @return
     *     possible object is
     *     {@link EjbRefType }
     *     
     */
    public EjbRefType getEjbRefType() {
        return ejbRefType;
    }

    /**
     * Sets the value of the ejbRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbRefType }
     *     
     */
    public void setEjbRefType(EjbRefType value) {
        this.ejbRefType = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link Home }
     *     
     */
    public Home getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link Home }
     *     
     */
    public void setHome(Home value) {
        this.home = value;
    }

    /**
     * Gets the value of the remote property.
     * 
     * @return
     *     possible object is
     *     {@link Remote }
     *     
     */
    public Remote getRemote() {
        return remote;
    }

    /**
     * Sets the value of the remote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remote }
     *     
     */
    public void setRemote(Remote value) {
        this.remote = value;
    }

}