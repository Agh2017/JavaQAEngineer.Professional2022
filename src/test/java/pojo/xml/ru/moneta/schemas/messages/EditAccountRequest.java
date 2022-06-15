
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentPassword" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="5"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentPasswordExpirationDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oldPaymentPassword" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="5"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="onSuccessfulDebitUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onSuccessfulCreditUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lowBalanceThreshold" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="highBalanceThreshold" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="prototypeAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oldPaymentPasswordChallenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onCancelledDebitUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onCancelledCreditUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onAuthoriseUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "id",
    "alias",
    "paymentPassword",
    "paymentPasswordExpirationDate",
    "oldPaymentPassword",
    "onSuccessfulDebitUrl",
    "onSuccessfulCreditUrl",
    "signature",
    "lowBalanceThreshold",
    "highBalanceThreshold",
    "prototypeAccountId",
    "oldPaymentPasswordChallenge",
    "onCancelledDebitUrl",
    "onCancelledCreditUrl",
    "onAuthoriseUrl",
    "attribute"
})
@XmlRootElement(name = "EditAccountRequest")
public class EditAccountRequest
    implements Serializable
{

    protected long id;
    protected String alias;
    protected String paymentPassword;
    protected Boolean paymentPasswordExpirationDate;
    protected String oldPaymentPassword;
    protected String onSuccessfulDebitUrl;
    protected String onSuccessfulCreditUrl;
    protected String signature;
    protected BigDecimal lowBalanceThreshold;
    protected BigDecimal highBalanceThreshold;
    protected Long prototypeAccountId;
    protected String oldPaymentPasswordChallenge;
    protected String onCancelledDebitUrl;
    protected String onCancelledCreditUrl;
    protected String onAuthoriseUrl;
    protected List<KeyValueApprovedAttribute> attribute;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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
     * Gets the value of the paymentPasswordExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentPasswordExpirationDate() {
        return paymentPasswordExpirationDate;
    }

    /**
     * Sets the value of the paymentPasswordExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentPasswordExpirationDate(Boolean value) {
        this.paymentPasswordExpirationDate = value;
    }

    /**
     * Gets the value of the oldPaymentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPaymentPassword() {
        return oldPaymentPassword;
    }

    /**
     * Sets the value of the oldPaymentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPaymentPassword(String value) {
        this.oldPaymentPassword = value;
    }

    /**
     * Gets the value of the onSuccessfulDebitUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSuccessfulDebitUrl() {
        return onSuccessfulDebitUrl;
    }

    /**
     * Sets the value of the onSuccessfulDebitUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSuccessfulDebitUrl(String value) {
        this.onSuccessfulDebitUrl = value;
    }

    /**
     * Gets the value of the onSuccessfulCreditUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSuccessfulCreditUrl() {
        return onSuccessfulCreditUrl;
    }

    /**
     * Sets the value of the onSuccessfulCreditUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSuccessfulCreditUrl(String value) {
        this.onSuccessfulCreditUrl = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the lowBalanceThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowBalanceThreshold() {
        return lowBalanceThreshold;
    }

    /**
     * Sets the value of the lowBalanceThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowBalanceThreshold(BigDecimal value) {
        this.lowBalanceThreshold = value;
    }

    /**
     * Gets the value of the highBalanceThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHighBalanceThreshold() {
        return highBalanceThreshold;
    }

    /**
     * Sets the value of the highBalanceThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHighBalanceThreshold(BigDecimal value) {
        this.highBalanceThreshold = value;
    }

    /**
     * Gets the value of the prototypeAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrototypeAccountId() {
        return prototypeAccountId;
    }

    /**
     * Sets the value of the prototypeAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrototypeAccountId(Long value) {
        this.prototypeAccountId = value;
    }

    /**
     * Gets the value of the oldPaymentPasswordChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPaymentPasswordChallenge() {
        return oldPaymentPasswordChallenge;
    }

    /**
     * Sets the value of the oldPaymentPasswordChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPaymentPasswordChallenge(String value) {
        this.oldPaymentPasswordChallenge = value;
    }

    /**
     * Gets the value of the onCancelledDebitUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnCancelledDebitUrl() {
        return onCancelledDebitUrl;
    }

    /**
     * Sets the value of the onCancelledDebitUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnCancelledDebitUrl(String value) {
        this.onCancelledDebitUrl = value;
    }

    /**
     * Gets the value of the onCancelledCreditUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnCancelledCreditUrl() {
        return onCancelledCreditUrl;
    }

    /**
     * Sets the value of the onCancelledCreditUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnCancelledCreditUrl(String value) {
        this.onCancelledCreditUrl = value;
    }

    /**
     * Gets the value of the onAuthoriseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnAuthoriseUrl() {
        return onAuthoriseUrl;
    }

    /**
     * Sets the value of the onAuthoriseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnAuthoriseUrl(String value) {
        this.onAuthoriseUrl = value;
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
