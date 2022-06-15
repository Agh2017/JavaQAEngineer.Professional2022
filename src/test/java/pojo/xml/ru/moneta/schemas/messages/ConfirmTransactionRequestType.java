
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Parameters for requests that confirm transactions.
 * 
 * <p>Java class for ConfirmTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmTransactionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="paymentPassword" type="{http://www.moneta.ru/schemas/messages.xsd}Password" minOccurs="0"/&gt;
 *         &lt;element name="protectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="isPayerAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="paymentPasswordChallenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmTransactionRequestType", propOrder = {
    "transactionId",
    "paymentPassword",
    "protectionCode",
    "operationInfo",
    "amount",
    "isPayerAmount",
    "paymentPasswordChallenge",
    "clientTransaction"
})
@XmlSeeAlso({
    ConfirmTransactionRequest.class
})
public class ConfirmTransactionRequestType
    implements Serializable
{

    protected long transactionId;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String paymentPassword;
    protected String protectionCode;
    protected OperationInfo operationInfo;
    protected BigDecimal amount;
    protected Boolean isPayerAmount;
    protected String paymentPasswordChallenge;
    protected String clientTransaction;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the paymentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPassword() {
        return paymentPassword;
    }

    /**
     * Sets the value of the paymentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPassword(String value) {
        this.paymentPassword = value;
    }

    /**
     * Gets the value of the protectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionCode() {
        return protectionCode;
    }

    /**
     * Sets the value of the protectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionCode(String value) {
        this.protectionCode = value;
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

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the isPayerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPayerAmount() {
        return isPayerAmount;
    }

    /**
     * Sets the value of the isPayerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPayerAmount(Boolean value) {
        this.isPayerAmount = value;
    }

    /**
     * Gets the value of the paymentPasswordChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPasswordChallenge() {
        return paymentPasswordChallenge;
    }

    /**
     * Sets the value of the paymentPasswordChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPasswordChallenge(String value) {
        this.paymentPasswordChallenge = value;
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

}
