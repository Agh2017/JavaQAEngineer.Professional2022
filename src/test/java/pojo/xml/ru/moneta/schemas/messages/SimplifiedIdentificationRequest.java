
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="personalInformation" type="{http://www.moneta.ru/schemas/messages.xsd}PersonalInformation" minOccurs="0"/&gt;
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
    "unitId",
    "personalInformation"
})
@XmlRootElement(name = "SimplifiedIdentificationRequest")
public class SimplifiedIdentificationRequest
    extends AbstractAttributeObject
    implements Serializable
{

    protected Long unitId;
    protected PersonalInformation personalInformation;

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitId(Long value) {
        this.unitId = value;
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