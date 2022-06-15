
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bank account details. The information is returned as a list of key-value pairs.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Valid keys are:&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;&lt;b&gt;is_international&lt;/b&gt;. Indicates whether the bank uses international account details. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;&lt;b&gt;true&lt;/b&gt;. International bank account details.&lt;/li&gt;&lt;li&gt;&lt;b&gt;false&lt;/b&gt;. Russian bank account details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;bank&lt;/b&gt;. Bank name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;bik&lt;/b&gt;. SWIFT/BIC number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;account&lt;/b&gt;. IBAN/settlement account.&lt;/li&gt;&lt;li&gt;&lt;b&gt;corr_bank&lt;/b&gt;. Correspondent bank.&lt;/li&gt;&lt;li&gt;&lt;b&gt;corr_account&lt;/b&gt;. Correspondent account.&lt;/li&gt;&lt;li&gt;&lt;b&gt;country&lt;/b&gt;. Country.&lt;/li&gt;&lt;li&gt;&lt;b&gt;state&lt;/b&gt;. Region/state.&lt;/li&gt;&lt;li&gt;&lt;b&gt;city&lt;/b&gt;. City.&lt;/li&gt;&lt;li&gt;&lt;b&gt;kbk&lt;/b&gt;. Budget classification code.&lt;/li&gt;&lt;li&gt;&lt;b&gt;oktmo&lt;/b&gt;. Russian Classifier of Municipal Unit Territories.&lt;/li&gt;&lt;li&gt;&lt;b&gt;kpp&lt;/b&gt;. Code of reason for tax registration.&lt;/li&gt;&lt;li&gt;&lt;b&gt;username&lt;/b&gt;. Payee's name.&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccount"&gt;
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
@XmlType(name = "BankAccount", propOrder = {
    "id",
    "attribute"
})
@XmlSeeAlso({
    EditBankAccountRequest.class,
    CreateBankAccountRequest.class
})
public class BankAccount
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
