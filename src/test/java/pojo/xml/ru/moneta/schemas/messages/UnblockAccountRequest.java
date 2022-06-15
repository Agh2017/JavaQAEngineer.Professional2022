
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId"/&gt;
 *         &lt;element name="secretAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentPassword" type="{http://www.moneta.ru/schemas/messages.xsd}PaymentPassword" minOccurs="0"/&gt;
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
    "id",
    "secretAnswer",
    "paymentPassword"
})
@XmlRootElement(name = "UnblockAccountRequest")
public class UnblockAccountRequest
    extends AbstractAttributeObject
    implements Serializable
{

    protected long id;
    @XmlElement(required = true)
    protected String secretAnswer;
    protected PaymentPassword paymentPassword;

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
     * Gets the value of the secretAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretAnswer() {
        return secretAnswer;
    }

    /**
     * Sets the value of the secretAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretAnswer(String value) {
        this.secretAnswer = value;
    }

    /**
     * Gets the value of the paymentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPassword }
     *     
     */
    public PaymentPassword getPaymentPassword() {
        return paymentPassword;
    }

    /**
     * Sets the value of the paymentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPassword }
     *     
     */
    public void setPaymentPassword(PaymentPassword value) {
        this.paymentPassword = value;
    }

}
