
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *         &lt;element name="pager" type="{http://www.moneta.ru/schemas/messages.xsd}Pager" minOccurs="0"/&gt;
 *         &lt;element name="filter"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="accountType" type="{http://www.moneta.ru/schemas/messages.xsd}AccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="accountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId" minOccurs="0"/&gt;
 *                   &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="amountFrom" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="amountTo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="currencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
 *                   &lt;element name="targetAccountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId" minOccurs="0"/&gt;
 *                   &lt;element name="operationStatus" type="{http://www.moneta.ru/schemas/messages.xsd}OperationStatus" minOccurs="0"/&gt;
 *                   &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID" minOccurs="0"/&gt;
 *                   &lt;element name="operationAmountTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="operationCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="refund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="accountingPeriodDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="searchInArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="attributeNamesInResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "pager",
    "filter"
})
@XmlRootElement(name = "FindOperationsListRequest")
public class FindOperationsListRequest
    implements Serializable
{

    protected Pager pager;
    @XmlElement(required = true)
    protected FindOperationsListRequest.Filter filter;

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link Pager }
     *     
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pager }
     *     
     */
    public void setPager(Pager value) {
        this.pager = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FindOperationsListRequest.Filter }
     *     
     */
    public FindOperationsListRequest.Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindOperationsListRequest.Filter }
     *     
     */
    public void setFilter(FindOperationsListRequest.Filter value) {
        this.filter = value;
    }


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
     *         &lt;element name="accountType" type="{http://www.moneta.ru/schemas/messages.xsd}AccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="accountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId" minOccurs="0"/&gt;
     *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="amountFrom" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="amountTo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="currencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
     *         &lt;element name="targetAccountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId" minOccurs="0"/&gt;
     *         &lt;element name="operationStatus" type="{http://www.moneta.ru/schemas/messages.xsd}OperationStatus" minOccurs="0"/&gt;
     *         &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID" minOccurs="0"/&gt;
     *         &lt;element name="operationAmountTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="operationCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="refund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="accountingPeriodDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="searchInArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="attributeNamesInResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "accountType",
        "accountId",
        "dateFrom",
        "dateTo",
        "operationId",
        "amountFrom",
        "amountTo",
        "currencyCode",
        "targetAccountId",
        "operationStatus",
        "clientTransaction",
        "operationAmountTypeId",
        "propertyName",
        "propertyValue",
        "operationCategoryId",
        "refund",
        "accountingPeriodDate",
        "searchInArchive",
        "attributeNamesInResponse"
    })
    public static class Filter
        implements Serializable
    {

        protected Long unitId;
        @XmlElement(type = Integer.class)
        protected List<Integer> accountType;
        protected Long accountId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateFrom;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTo;
        protected Long operationId;
        protected BigDecimal amountFrom;
        protected BigDecimal amountTo;
        @XmlSchemaType(name = "string")
        protected Currency currencyCode;
        protected Long targetAccountId;
        @XmlSchemaType(name = "string")
        protected OperationStatus operationStatus;
        protected String clientTransaction;
        protected Integer operationAmountTypeId;
        protected String propertyName;
        protected String propertyValue;
        protected Long operationCategoryId;
        protected Boolean refund;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar accountingPeriodDate;
        @XmlElement(defaultValue = "false")
        protected Boolean searchInArchive;
        protected String attributeNamesInResponse;

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
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountId(Long value) {
            this.accountId = value;
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
         * Gets the value of the operationId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOperationId() {
            return operationId;
        }

        /**
         * Sets the value of the operationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOperationId(Long value) {
            this.operationId = value;
        }

        /**
         * Gets the value of the amountFrom property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountFrom() {
            return amountFrom;
        }

        /**
         * Sets the value of the amountFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountFrom(BigDecimal value) {
            this.amountFrom = value;
        }

        /**
         * Gets the value of the amountTo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountTo() {
            return amountTo;
        }

        /**
         * Sets the value of the amountTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountTo(BigDecimal value) {
            this.amountTo = value;
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
         * Gets the value of the targetAccountId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTargetAccountId() {
            return targetAccountId;
        }

        /**
         * Sets the value of the targetAccountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTargetAccountId(Long value) {
            this.targetAccountId = value;
        }

        /**
         * Gets the value of the operationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link OperationStatus }
         *     
         */
        public OperationStatus getOperationStatus() {
            return operationStatus;
        }

        /**
         * Sets the value of the operationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationStatus }
         *     
         */
        public void setOperationStatus(OperationStatus value) {
            this.operationStatus = value;
        }

        /**
         * Gets the value of the clientTransaction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientTransaction() {
            return clientTransaction;
        }

        /**
         * Sets the value of the clientTransaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientTransaction(String value) {
            this.clientTransaction = value;
        }

        /**
         * Gets the value of the operationAmountTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOperationAmountTypeId() {
            return operationAmountTypeId;
        }

        /**
         * Sets the value of the operationAmountTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOperationAmountTypeId(Integer value) {
            this.operationAmountTypeId = value;
        }

        /**
         * Gets the value of the propertyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyName() {
            return propertyName;
        }

        /**
         * Sets the value of the propertyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyName(String value) {
            this.propertyName = value;
        }

        /**
         * Gets the value of the propertyValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyValue() {
            return propertyValue;
        }

        /**
         * Sets the value of the propertyValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyValue(String value) {
            this.propertyValue = value;
        }

        /**
         * Gets the value of the operationCategoryId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOperationCategoryId() {
            return operationCategoryId;
        }

        /**
         * Sets the value of the operationCategoryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOperationCategoryId(Long value) {
            this.operationCategoryId = value;
        }

        /**
         * Gets the value of the refund property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefund() {
            return refund;
        }

        /**
         * Sets the value of the refund property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefund(Boolean value) {
            this.refund = value;
        }

        /**
         * Gets the value of the accountingPeriodDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAccountingPeriodDate() {
            return accountingPeriodDate;
        }

        /**
         * Sets the value of the accountingPeriodDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAccountingPeriodDate(XMLGregorianCalendar value) {
            this.accountingPeriodDate = value;
        }

        /**
         * Gets the value of the searchInArchive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSearchInArchive() {
            return searchInArchive;
        }

        /**
         * Sets the value of the searchInArchive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSearchInArchive(Boolean value) {
            this.searchInArchive = value;
        }

        /**
         * Gets the value of the attributeNamesInResponse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeNamesInResponse() {
            return attributeNamesInResponse;
        }

        /**
         * Sets the value of the attributeNamesInResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeNamesInResponse(String value) {
            this.attributeNamesInResponse = value;
        }

    }

}
