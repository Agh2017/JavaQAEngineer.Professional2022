
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information on tariff
 * 
 * <p>Java class for InfoTariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoTariff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceRangeCurrency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
 *         &lt;element name="sourceAmountMin" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="sourceAmountMax" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="targetRangeCurrency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
 *         &lt;element name="targetAmountMin" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="targetAmountMax" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoTariff", propOrder = {
    "sourceRangeCurrency",
    "sourceAmountMin",
    "sourceAmountMax",
    "targetRangeCurrency",
    "targetAmountMin",
    "targetAmountMax"
})
public class InfoTariff
    implements Serializable
{

    @XmlSchemaType(name = "string")
    protected Currency sourceRangeCurrency;
    protected BigDecimal sourceAmountMin;
    protected BigDecimal sourceAmountMax;
    @XmlSchemaType(name = "string")
    protected Currency targetRangeCurrency;
    protected BigDecimal targetAmountMin;
    protected BigDecimal targetAmountMax;

    /**
     * Gets the value of the sourceRangeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSourceRangeCurrency() {
        return sourceRangeCurrency;
    }

    /**
     * Sets the value of the sourceRangeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSourceRangeCurrency(Currency value) {
        this.sourceRangeCurrency = value;
    }

    /**
     * Gets the value of the sourceAmountMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceAmountMin() {
        return sourceAmountMin;
    }

    /**
     * Sets the value of the sourceAmountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceAmountMin(BigDecimal value) {
        this.sourceAmountMin = value;
    }

    /**
     * Gets the value of the sourceAmountMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceAmountMax() {
        return sourceAmountMax;
    }

    /**
     * Sets the value of the sourceAmountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceAmountMax(BigDecimal value) {
        this.sourceAmountMax = value;
    }

    /**
     * Gets the value of the targetRangeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTargetRangeCurrency() {
        return targetRangeCurrency;
    }

    /**
     * Sets the value of the targetRangeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTargetRangeCurrency(Currency value) {
        this.targetRangeCurrency = value;
    }

    /**
     * Gets the value of the targetAmountMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetAmountMin() {
        return targetAmountMin;
    }

    /**
     * Sets the value of the targetAmountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetAmountMin(BigDecimal value) {
        this.targetAmountMin = value;
    }

    /**
     * Gets the value of the targetAmountMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetAmountMax() {
        return targetAmountMax;
    }

    /**
     * Sets the value of the targetAmountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetAmountMax(BigDecimal value) {
        this.targetAmountMax = value;
    }

}
