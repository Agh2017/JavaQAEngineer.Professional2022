
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Operation template.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OperationTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.moneta.ru/schemas/messages.xsd}Description" minOccurs="0"/&gt;
 *         &lt;element name="prototypeOperationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="commonParameters" type="{http://www.moneta.ru/schemas/messages.xsd}CommonOperationTemplateParameters"/&gt;
 *           &lt;element name="regularParameters" type="{http://www.moneta.ru/schemas/messages.xsd}RegularOperationTemplateParameters"/&gt;
 *           &lt;element name="directDebitParameters" type="{http://www.moneta.ru/schemas/messages.xsd}DirectDebitOperationTemplateParameters"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueApprovedAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalInfo" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueApprovedAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationTemplate", propOrder = {
    "id",
    "unitId",
    "type",
    "name",
    "payer",
    "payee",
    "operationTypeCategory",
    "description",
    "prototypeOperationId",
    "tags",
    "favorite",
    "commonParameters",
    "regularParameters",
    "directDebitParameters",
    "operationInfo",
    "additionalInfo"
})
@XmlSeeAlso({
    EditOperationTemplateRequest.class,
    CreateOperationTemplateRequest.class
})
public class OperationTemplate
    extends AbstractAttributeObject
    implements Serializable
{

    protected Long id;
    protected Long unitId;
    @XmlSchemaType(name = "string")
    protected OperationTemplateType type;
    protected String name;
    protected Long payer;
    protected Long payee;
    @XmlSchemaType(name = "string")
    protected OperationTypeCategory operationTypeCategory;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    protected Long prototypeOperationId;
    protected String tags;
    protected Boolean favorite;
    protected CommonOperationTemplateParameters commonParameters;
    protected RegularOperationTemplateParameters regularParameters;
    protected DirectDebitOperationTemplateParameters directDebitParameters;
    protected List<KeyValueApprovedAttribute> operationInfo;
    protected List<KeyValueApprovedAttribute> additionalInfo;

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
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayer(Long value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayee(Long value) {
        this.payee = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the prototypeOperationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrototypeOperationId() {
        return prototypeOperationId;
    }

    /**
     * Sets the value of the prototypeOperationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrototypeOperationId(Long value) {
        this.prototypeOperationId = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorite(Boolean value) {
        this.favorite = value;
    }

    /**
     * Gets the value of the commonParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CommonOperationTemplateParameters }
     *     
     */
    public CommonOperationTemplateParameters getCommonParameters() {
        return commonParameters;
    }

    /**
     * Sets the value of the commonParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonOperationTemplateParameters }
     *     
     */
    public void setCommonParameters(CommonOperationTemplateParameters value) {
        this.commonParameters = value;
    }

    /**
     * Gets the value of the regularParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RegularOperationTemplateParameters }
     *     
     */
    public RegularOperationTemplateParameters getRegularParameters() {
        return regularParameters;
    }

    /**
     * Sets the value of the regularParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularOperationTemplateParameters }
     *     
     */
    public void setRegularParameters(RegularOperationTemplateParameters value) {
        this.regularParameters = value;
    }

    /**
     * Gets the value of the directDebitParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitOperationTemplateParameters }
     *     
     */
    public DirectDebitOperationTemplateParameters getDirectDebitParameters() {
        return directDebitParameters;
    }

    /**
     * Sets the value of the directDebitParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitOperationTemplateParameters }
     *     
     */
    public void setDirectDebitParameters(DirectDebitOperationTemplateParameters value) {
        this.directDebitParameters = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueApprovedAttribute }
     * 
     * 
     */
    public List<KeyValueApprovedAttribute> getOperationInfo() {
        if (operationInfo == null) {
            operationInfo = new ArrayList<KeyValueApprovedAttribute>();
        }
        return this.operationInfo;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueApprovedAttribute }
     * 
     * 
     */
    public List<KeyValueApprovedAttribute> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<KeyValueApprovedAttribute>();
        }
        return this.additionalInfo;
    }

}
