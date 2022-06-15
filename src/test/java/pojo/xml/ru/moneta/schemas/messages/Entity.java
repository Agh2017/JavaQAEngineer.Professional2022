
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A base type that contains the &lt;b&gt;version&lt;/b&gt; attribute.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="version" type="{http://www.moneta.ru/schemas/messages.xsd}Version" default="VERSION_1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity")
@XmlSeeAlso({
    ConfirmPersonificationRequest.class,
    VerifyPersonificationCodeRequest.class,
    FindLegalInformationRequest.class,
    FindBankAccountsRequest.class,
    FindContractsRequest.class,
    FindProfileInfoRequest.class,
    GetProfileInfoRequest.class,
    GetFinancialFlowsListRequest.class,
    FindAccountsListRequest.class,
    AccountStatementRequest.class,
    VerifyTransactionRequest.class,
    PaymentRequestType.class,
    TransactionRequestType.class,
    EntityBatchRequestType.class,
    InvoiceRequestType.class
})
public class Entity
    implements Serializable
{

    @XmlAttribute(name = "version", namespace = "http://www.moneta.ru/schemas/messages.xsd")
    protected Version version;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        if (version == null) {
            return Version.VERSION_1;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

}
