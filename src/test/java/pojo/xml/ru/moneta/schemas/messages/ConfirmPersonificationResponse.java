
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personalInformation" type="{http://www.moneta.ru/schemas/messages.xsd}PersonalInformation"/&gt;
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
    "personalInformation"
})
@XmlRootElement(name = "ConfirmPersonificationResponse")
public class ConfirmPersonificationResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected PersonalInformation personalInformation;

    /**
     * Gets the value of the personalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformation }
     *     
     */
    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Sets the value of the personalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformation }
     *     
     */
    public void setPersonalInformation(PersonalInformation value) {
        this.personalInformation = value;
    }

}
