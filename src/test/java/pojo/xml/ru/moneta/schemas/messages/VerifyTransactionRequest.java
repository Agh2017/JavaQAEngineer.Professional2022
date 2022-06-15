
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="isPayerAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" minOccurs="0"/&gt;
 *         &lt;element name="paymentPassword" type="{http://www.moneta.ru/schemas/messages.xsd}Password" minOccurs="0"/&gt;
 *         &lt;element name="paymentPasswordChallenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionId",
    "payer",
    "amount",
    "isPayerAmount",
    "operationInfo",
    "paymentPassword",
    "paymentPasswordChallenge",
    "clientTransaction"
})
@XmlRootElement(name = "VerifyTransactionRequest")
public class VerifyTransactionRequest
    extends Entity
    implements Serializable
{

    protected long transactionId;
    protected String payer;
    protected BigDecimal amount;
    protected Boolean isPayerAmount;
    protected OperationInfo operationInfo;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String paymentPassword;
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
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
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
