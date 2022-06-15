
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AccountRelation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentPassword" type="{http://www.moneta.ru/schemas/messages.xsd}Password"/&gt;
 *         &lt;element name="paymentPasswordChallenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "paymentPassword",
    "paymentPasswordChallenge"
})
@XmlRootElement(name = "SaveAccountRelationRequest")
public class SaveAccountRelationRequest
    extends AccountRelation
    implements Serializable
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String paymentPassword;
    protected String paymentPasswordChallenge;

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

}
