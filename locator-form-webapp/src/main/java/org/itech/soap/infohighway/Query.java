//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.25 at 11:32:53 PM PDT 
//


package org.itech.soap.infohighway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryInput" type="{http://ws.server.mhaccess.crimsonlogic.com/}qwsInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query", propOrder = {
    "queryInput"
})
public class Query {

    protected QwsInput queryInput;

    /**
     * Gets the value of the queryInput property.
     * 
     * @return
     *     possible object is
     *     {@link QwsInput }
     *     
     */
    public QwsInput getQueryInput() {
        return queryInput;
    }

    /**
     * Sets the value of the queryInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link QwsInput }
     *     
     */
    public void setQueryInput(QwsInput value) {
        this.queryInput = value;
    }

}
