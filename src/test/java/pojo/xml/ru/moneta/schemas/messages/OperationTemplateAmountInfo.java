
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTemplateAmountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationTemplateAmountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateAmountInfoType"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="amount" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateAmount"/&gt;
 *           &lt;element name="range" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateAmountRange"/&gt;
 *           &lt;element name="rest" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateAmountRest"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationTemplateAmountInfo", propOrder = {
    "type",
    "amount",
    "range",
    "rest"
})
public class OperationTemplateAmountInfo
    extends AbstractAttributeObject
    implements Serializable
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationTemplateAmountInfoType type;
    protected OperationTemplateAmount amount;
    protected OperationTemplateAmountRange range;
    protected OperationTemplateAmountRest rest;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateAmountInfoType }
     *     
     */
    public OperationTemplateAmountInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateAmountInfoType }
     *     
     */
    public void setType(OperationTemplateAmountInfoType value) {
        this.type = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateAmount }
     *     
     */
    public OperationTemplateAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateAmount }
     *     
     */
    public void setAmount(OperationTemplateAmount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateAmountRange }
     *     
     */
    public OperationTemplateAmountRange getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateAmountRange }
     *     
     */
    public void setRange(OperationTemplateAmountRange value) {
        this.range = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateAmountRest }
     *     
     */
    public OperationTemplateAmountRest getRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateAmountRest }
     *     
     */
    public void setRest(OperationTemplateAmountRest value) {
        this.rest = value;
    }

}
