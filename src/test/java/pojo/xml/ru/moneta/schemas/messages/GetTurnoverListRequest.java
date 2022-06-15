
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.moneta.ru/schemas/messages.xsd}AccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountIds" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
 *         &lt;element name="groupByCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
 *         &lt;element name="categoryDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dateFrom",
    "dateTo",
    "accountType",
    "accountIds",
    "currencyCode",
    "groupByCurrency",
    "operationTypeCategory",
    "categoryDetails",
    "attribute"
})
@XmlRootElement(name = "GetTurnoverListRequest")
public class GetTurnoverListRequest
    implements Serializable
{

    protected Long unitId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(type = Integer.class)
    protected List<Integer> accountType;
    @XmlElement(type = Long.class)
    protected List<Long> accountIds;
    @XmlSchemaType(name = "string")
    protected Currency currencyCode;
    @XmlElement(defaultValue = "true")
    protected Boolean groupByCurrency;
    @XmlSchemaType(name = "string")
    protected OperationTypeCategory operationTypeCategory;
    protected Boolean categoryDetails;
    protected List<KeyValueAttribute> attribute;

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
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAccountType() {
        if (accountType == null) {
            accountType = new ArrayList<Integer>();
        }
        return this.accountType;
    }

    /**
     * Gets the value of the accountIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAccountIds() {
        if (accountIds == null) {
            accountIds = new ArrayList<Long>();
        }
        return this.accountIds;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrencyCode(Currency value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the groupByCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupByCurrency() {
        return groupByCurrency;
    }

    /**
     * Sets the value of the groupByCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupByCurrency(Boolean value) {
        this.groupByCurrency = value;
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
     * Gets the value of the categoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoryDetails() {
        return categoryDetails;
    }

    /**
     * Sets the value of the categoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryDetails(Boolean value) {
        this.categoryDetails = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueAttribute }
     * 
     * 
     */
    public List<KeyValueAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<KeyValueAttribute>();
        }
        return this.attribute;
    }

}
