
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Transaction amount and estimated fees for a transaction.
 * 
 * <p>Java class for ForecastTransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastTransactionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="payerCurrency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
 *         &lt;element name="payerAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *         &lt;element name="payerFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="payerAccountTotal" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="payeeCurrency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
 *         &lt;element name="payeeAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *         &lt;element name="payeeFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="payeeAccountTotal" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="payerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ForecastTransactionResponseType", propOrder = {
    "payer",
    "payerCurrency",
    "payerAmount",
    "payerFee",
    "payerAccountTotal",
    "payee",
    "payeeCurrency",
    "payeeAmount",
    "payeeFee",
    "payeeAccountTotal",
    "payerAlias",
    "payeeAlias",
    "attribute"
})
@XmlSeeAlso({
    ForecastTransactionResponse.class
})
public class ForecastTransactionResponseType
    implements Serializable
{

    protected long payer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Currency payerCurrency;
    @XmlElement(required = true)
    protected BigDecimal payerAmount;
    protected BigDecimal payerFee;
    protected BigDecimal payerAccountTotal;
    protected long payee;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Currency payeeCurrency;
    @XmlElement(required = true)
    protected BigDecimal payeeAmount;
    protected BigDecimal payeeFee;
    protected BigDecimal payeeAccountTotal;
    protected String payerAlias;
    protected String payeeAlias;
    protected List<KeyValueApprovedAttribute> attribute;

    /**
     * Gets the value of the payer property.
     * 
     */
    public long getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     */
    public void setPayer(long value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payerCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPayerCurrency() {
        return payerCurrency;
    }

    /**
     * Sets the value of the payerCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPayerCurrency(Currency value) {
        this.payerCurrency = value;
    }

    /**
     * Gets the value of the payerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayerAmount() {
        return payerAmount;
    }

    /**
     * Sets the value of the payerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayerAmount(BigDecimal value) {
        this.payerAmount = value;
    }

    /**
     * Gets the value of the payerFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayerFee() {
        return payerFee;
    }

    /**
     * Sets the value of the payerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayerFee(BigDecimal value) {
        this.payerFee = value;
    }

    /**
     * Gets the value of the payerAccountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayerAccountTotal() {
        return payerAccountTotal;
    }

    /**
     * Sets the value of the payerAccountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayerAccountTotal(BigDecimal value) {
        this.payerAccountTotal = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     */
    public long getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     */
    public void setPayee(long value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payeeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPayeeCurrency() {
        return payeeCurrency;
    }

    /**
     * Sets the value of the payeeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPayeeCurrency(Currency value) {
        this.payeeCurrency = value;
    }

    /**
     * Gets the value of the payeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayeeAmount() {
        return payeeAmount;
    }

    /**
     * Sets the value of the payeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayeeAmount(BigDecimal value) {
        this.payeeAmount = value;
    }

    /**
     * Gets the value of the payeeFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayeeFee() {
        return payeeFee;
    }

    /**
     * Sets the value of the payeeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayeeFee(BigDecimal value) {
        this.payeeFee = value;
    }

    /**
     * Gets the value of the payeeAccountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayeeAccountTotal() {
        return payeeAccountTotal;
    }

    /**
     * Sets the value of the payeeAccountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayeeAccountTotal(BigDecimal value) {
        this.payeeAccountTotal = value;
    }

    /**
     * Gets the value of the payerAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAlias() {
        return payerAlias;
    }

    /**
     * Sets the value of the payerAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAlias(String value) {
        this.payerAlias = value;
    }

    /**
     * Gets the value of the payeeAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAlias() {
        return payeeAlias;
    }

    /**
     * Sets the value of the payeeAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAlias(String value) {
        this.payeeAlias = value;
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
