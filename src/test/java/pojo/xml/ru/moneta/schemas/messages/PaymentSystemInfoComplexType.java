
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of present information of payment system
 * 
 * <p>Java class for PaymentSystemInfoComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSystemInfoComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logicalGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoUrl" type="{http://www.moneta.ru/schemas/messages.xsd}InfoUrl" minOccurs="0"/&gt;
 *         &lt;element name="referenceData" type="{http://www.moneta.ru/schemas/messages.xsd}ReferenceData" minOccurs="0"/&gt;
 *         &lt;element name="infoTariff" type="{http://www.moneta.ru/schemas/messages.xsd}InfoTariff" minOccurs="0"/&gt;
 *         &lt;element name="currencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="psAccountIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSystemInfoComplexType", propOrder = {
    "unitId",
    "name",
    "icon",
    "logicalGroup",
    "infoUrl",
    "referenceData",
    "infoTariff",
    "currencies",
    "psAccountIds"
})
public class PaymentSystemInfoComplexType
    implements Serializable
{

    protected Long unitId;
    protected String name;
    protected String icon;
    protected String logicalGroup;
    protected InfoUrl infoUrl;
    protected ReferenceData referenceData;
    protected InfoTariff infoTariff;
    protected String currencies;
    protected String psAccountIds;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the logicalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalGroup() {
        return logicalGroup;
    }

    /**
     * Sets the value of the logicalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalGroup(String value) {
        this.logicalGroup = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link InfoUrl }
     *     
     */
    public InfoUrl getInfoUrl() {
        return infoUrl;
    }

    /**
     * Sets the value of the infoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoUrl }
     *     
     */
    public void setInfoUrl(InfoUrl value) {
        this.infoUrl = value;
    }

    /**
     * Gets the value of the referenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceData }
     *     
     */
    public ReferenceData getReferenceData() {
        return referenceData;
    }

    /**
     * Sets the value of the referenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceData }
     *     
     */
    public void setReferenceData(ReferenceData value) {
        this.referenceData = value;
    }

    /**
     * Gets the value of the infoTariff property.
     * 
     * @return
     *     possible object is
     *     {@link InfoTariff }
     *     
     */
    public InfoTariff getInfoTariff() {
        return infoTariff;
    }

    /**
     * Sets the value of the infoTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoTariff }
     *     
     */
    public void setInfoTariff(InfoTariff value) {
        this.infoTariff = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencies(String value) {
        this.currencies = value;
    }

    /**
     * Gets the value of the psAccountIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAccountIds() {
        return psAccountIds;
    }

    /**
     * Sets the value of the psAccountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAccountIds(String value) {
        this.psAccountIds = value;
    }

}
