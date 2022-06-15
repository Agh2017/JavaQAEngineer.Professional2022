
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Transaction attributes in responses.
 * 
 * <p>Java class for TransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="transaction" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID" minOccurs="0"/&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "status",
    "dateTime",
    "transaction",
    "clientTransaction",
    "operationInfo"
})
@XmlSeeAlso({
    TransferResponse.class,
    InvoiceResponse.class
})
public class TransactionResponseType
    implements Serializable
{

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected long transaction;
    protected String clientTransaction;
    protected OperationInfo operationInfo;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     */
    public long getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     */
    public void setTransaction(long value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the clientTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransaction() {
        return clientTransaction;
    }

    /**
     * Sets the value of the clientTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransaction(String value) {
        this.clientTransaction = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInfo }
     *     
     */
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInfo }
     *     
     */
    public void setOperationInfo(OperationInfo value) {
        this.operationInfo = value;
    }

}
