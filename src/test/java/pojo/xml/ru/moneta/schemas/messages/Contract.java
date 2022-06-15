
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contract information in the list of key-value pairs.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Valid contract keys are:&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;&lt;b&gt;num&lt;/b&gt;. Contract number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;unitid&lt;/b&gt;. Unique identifier of the contract.&lt;/li&gt;&lt;li&gt;&lt;b&gt;own&lt;/b&gt;. Indicates whether the contract is created for the specified user account. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;&lt;b&gt;true&lt;/b&gt;. The contract is created for the account which ID is specified in the unitid element.&lt;/li&gt;&lt;li&gt;&lt;b&gt;false&lt;/b&gt;. The contract is created for the parent account.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;unitname&lt;/b&gt;. The name of the parent account, if the own element is set to false.&lt;/li&gt;&lt;li&gt;&lt;b&gt;datestart&lt;/b&gt;. The start date of the contract.&lt;/li&gt;&lt;li&gt;&lt;b&gt;datesigned&lt;/b&gt;. Contract signing date.&lt;/li&gt;&lt;li&gt;&lt;b&gt;datestop&lt;/b&gt;. The end date of the contract.&lt;/li&gt;&lt;li&gt;&lt;b&gt;status&lt;/b&gt;. Contract status. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;ACTIVE&lt;/li&gt;&lt;li&gt;RESTRICTED&lt;/li&gt;&lt;li&gt;INACTIVE&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;type&lt;/b&gt;. Contract type. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;&lt;b&gt;PARTNER&lt;/b&gt;. Partner contract.&lt;/li&gt;&lt;li&gt;&lt;b&gt;VIRTUAL&lt;/b&gt;. Virtual contract.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;usage&lt;/b&gt;. Contract usage:&#13;
 *                         &lt;ul&gt;&lt;li&gt;&lt;b&gt;DIRECT&lt;/b&gt;. Direct contact.&lt;/li&gt;&lt;li&gt;&lt;b&gt;TECH&lt;/b&gt;. Technical contact.&lt;/li&gt;&lt;li&gt;&lt;b&gt;AGENT&lt;/b&gt;. Agent contact.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;baseid&lt;/b&gt;. Unique identifier of the base contract for agent contract.&lt;/li&gt;&lt;li&gt;&lt;b&gt;category&lt;/b&gt;. Contract category. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_ANONYMOUS&lt;/b&gt;. Anonymous individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_SIMPLIFIED&lt;/b&gt;. Simplified identified individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_SIMPLIFIED_SELF_EMPLOYED&lt;/b&gt;. Self employed simplified identified individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_PERSON&lt;/b&gt;. Identified individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_PERSON_SELF_EMPLOYED&lt;/b&gt;. Self employed identified individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;INDIVIDUALS_ENTREPRENEUR&lt;/b&gt;. Entrepreneur individuals.&lt;/li&gt;&lt;li&gt;&lt;b&gt;ORGANIZATION_LEGAL_PERSON&lt;/b&gt;. Legal person organization.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SERVICE_ORGANIZATION&lt;/b&gt;. Service / Service organization.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract"&gt;
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
@XmlType(name = "Contract", propOrder = {
    "id",
    "attribute"
})
public class Contract
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
