
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Specifies delegated access to a MONETA.RU account.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AccountRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId"/&gt;
 *         &lt;element name="principalEmail" type="{http://www.moneta.ru/schemas/messages.xsd}Email"/&gt;
 *         &lt;element name="canViewAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canEditAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canProcessOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRelation", propOrder = {
    "accountId",
    "principalEmail",
    "canViewAccount",
    "canEditAccount",
    "canProcessOperation"
})
@XmlSeeAlso({
    SaveAccountRelationRequest.class
})
public class AccountRelation
    implements Serializable
{

    protected long accountId;
    @XmlElement(required = true)
    protected String principalEmail;
    protected Boolean canViewAccount;
    protected Boolean canEditAccount;
    protected Boolean canProcessOperation;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the principalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalEmail() {
        return principalEmail;
    }

    /**
     * Sets the value of the principalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalEmail(String value) {
        this.principalEmail = value;
    }

    /**
     * Gets the value of the canViewAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanViewAccount() {
        return canViewAccount;
    }

    /**
     * Sets the value of the canViewAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanViewAccount(Boolean value) {
        this.canViewAccount = value;
    }

    /**
     * Gets the value of the canEditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanEditAccount() {
        return canEditAccount;
    }

    /**
     * Sets the value of the canEditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanEditAccount(Boolean value) {
        this.canEditAccount = value;
    }

    /**
     * Gets the value of the canProcessOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanProcessOperation() {
        return canProcessOperation;
    }

    /**
     * Sets the value of the canProcessOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanProcessOperation(Boolean value) {
        this.canProcessOperation = value;
    }

}
