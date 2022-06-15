
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference information.
 * 
 * <p>Java class for ReferenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentageExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceFee" type="{http://www.moneta.ru/schemas/messages.xsd}Fee" minOccurs="0"/&gt;
 *         &lt;element name="sourceFeeExt" type="{http://www.moneta.ru/schemas/messages.xsd}Fee" minOccurs="0"/&gt;
 *         &lt;element name="targetFee" type="{http://www.moneta.ru/schemas/messages.xsd}Fee" minOccurs="0"/&gt;
 *         &lt;element name="targetFeeExt" type="{http://www.moneta.ru/schemas/messages.xsd}Fee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceData", propOrder = {
    "period",
    "percentage",
    "percentageExt",
    "sourceFee",
    "sourceFeeExt",
    "targetFee",
    "targetFeeExt"
})
public class ReferenceData
    implements Serializable
{

    protected String period;
    protected String percentage;
    protected String percentageExt;
    protected BigDecimal sourceFee;
    protected BigDecimal sourceFeeExt;
    protected BigDecimal targetFee;
    protected BigDecimal targetFeeExt;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the percentageExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageExt() {
        return percentageExt;
    }

    /**
     * Sets the value of the percentageExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageExt(String value) {
        this.percentageExt = value;
    }

    /**
     * Gets the value of the sourceFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceFee() {
        return sourceFee;
    }

    /**
     * Sets the value of the sourceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceFee(BigDecimal value) {
        this.sourceFee = value;
    }

    /**
     * Gets the value of the sourceFeeExt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceFeeExt() {
        return sourceFeeExt;
    }

    /**
     * Sets the value of the sourceFeeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceFeeExt(BigDecimal value) {
        this.sourceFeeExt = value;
    }

    /**
     * Gets the value of the targetFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetFee() {
        return targetFee;
    }

    /**
     * Sets the value of the targetFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetFee(BigDecimal value) {
        this.targetFee = value;
    }

    /**
     * Gets the value of the targetFeeExt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetFeeExt() {
        return targetFeeExt;
    }

    /**
     * Sets the value of the targetFeeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetFeeExt(BigDecimal value) {
        this.targetFeeExt = value;
    }

}
