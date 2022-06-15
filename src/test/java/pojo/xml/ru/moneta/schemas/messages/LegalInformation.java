
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Legal information in the list of key-value pairs.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Valid keys are:&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;&lt;b&gt;inn&lt;/b&gt;. Tax Reference Number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;kpp&lt;/b&gt;. Industrial Enterprises Classifier.&lt;/li&gt;&lt;li&gt;&lt;b&gt;ogrn&lt;/b&gt;. Primary State Registration Number (PSRN).&lt;/li&gt;&lt;li&gt;&lt;b&gt;ogrnip&lt;/b&gt;. Primary State Registration Number of the Sole Proprietor.&lt;/li&gt;&lt;li&gt;&lt;b&gt;okpo&lt;/b&gt;. Russian National Nomenclature of Businesses and Organizations.&lt;/li&gt;&lt;li&gt;&lt;b&gt;okved&lt;/b&gt;. Russian National Classifier of Economic Activities.&lt;/li&gt;&lt;li&gt;&lt;b&gt;okato&lt;/b&gt;. Russian National Classifier of Administrative and Territorial Objects.&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LegalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueApprovedAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalInformation", propOrder = {
    "id",
    "attribute"
})
public class LegalInformation
    implements Serializable
{

    protected Long id;
    protected List<KeyValueApprovedAttribute> attribute;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueApprovedAttribute }
     * 
     * 
     */
    public List<KeyValueApprovedAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<KeyValueApprovedAttribute>();
        }
        return this.attribute;
    }

}
