
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "unitId",
    "profileId"
})
@XmlRootElement(name = "FindProfileDocumentsRequest")
public class FindProfileDocumentsRequest
    implements Serializable
{

    protected long unitId;
    protected Long profileId;

    /**
     * Gets the value of the unitId property.
     * 
     */
    public long getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     */
    public void setUnitId(long value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileId(Long value) {
        this.profileId = value;
    }

}
