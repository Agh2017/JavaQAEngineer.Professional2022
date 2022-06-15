
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTemplateAmountRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationTemplateAmountRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountMinValue" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="amountMaxValue" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationTemplateAmountRange", propOrder = {
    "amountMinValue",
    "amountMaxValue"
})
@XmlSeeAlso({
    DirectDebitOperationTemplateParameters.class
})
public class OperationTemplateAmountRange
    extends AbstractAttributeObject
    implements Serializable
{

    protected BigDecimal amountMinValue;
    protected BigDecimal amountMaxValue;

    /**
     * Gets the value of the amountMinValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMinValue() {
        return amountMinValue;
    }

    /**
     * Sets the value of the amountMinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMinValue(BigDecimal value) {
        this.amountMinValue = value;
    }

    /**
     * Gets the value of the amountMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMaxValue() {
        return amountMaxValue;
    }

    /**
     * Sets the value of the amountMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMaxValue(BigDecimal value) {
        this.amountMaxValue = value;
    }

}
