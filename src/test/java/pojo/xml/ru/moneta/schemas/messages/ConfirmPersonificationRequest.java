
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personalInformation" type="{http://www.moneta.ru/schemas/messages.xsd}PersonalInformation"/&gt;
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
    "personificationCode",
    "personalInformation"
})
@XmlRootElement(name = "ConfirmPersonificationRequest")
public class ConfirmPersonificationRequest
    extends Entity
    implements Serializable
{

    @XmlElement(required = true)
    protected String personificationCode;
    @XmlElement(required = true)
    protected PersonalInformation personalInformation;

    /**
     * Gets the value of the personificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonificationCode() {
        return personificationCode;
    }

    /**
     * Sets the value of the personificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonificationCode(String value) {
        this.personificationCode = value;
    }

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
