
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice&gt;
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *             &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
 *             &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateType" minOccurs="0"/&gt;
 *             &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
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
    "id",
    "unitId",
    "operationTypeCategory",
    "type",
    "tag"
})
@XmlRootElement(name = "FindOperationTemplatesRequest")
public class FindOperationTemplatesRequest
    implements Serializable
{

    protected Long id;
    protected Long unitId;
    @XmlSchemaType(name = "string")
    protected OperationTypeCategory operationTypeCategory;
    @XmlSchemaType(name = "string")
    protected OperationTemplateType type;
    protected String tag;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the operationTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTypeCategory }
     *     
     */
    public OperationTypeCategory getOperationTypeCategory() {
        return operationTypeCategory;
    }

    /**
     * Sets the value of the operationTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTypeCategory }
     *     
     */
    public void setOperationTypeCategory(OperationTypeCategory value) {
        this.operationTypeCategory = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateType }
     *     
     */
    public OperationTemplateType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateType }
     *     
     */
    public void setType(OperationTemplateType value) {
        this.type = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

}
