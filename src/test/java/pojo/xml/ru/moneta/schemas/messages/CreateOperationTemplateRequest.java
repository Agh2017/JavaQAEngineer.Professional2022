
package ru.moneta.schemas.messages;

import java.io.Serializable;
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplate"&gt;
 *       &lt;sequence&gt;
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
    "paymentPassword"
})
@XmlRootElement(name = "CreateOperationTemplateRequest")
public class CreateOperationTemplateRequest
    extends OperationTemplate
    implements Serializable
{

    protected PaymentPassword paymentPassword;

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
