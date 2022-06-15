
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ownerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ownerAccountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastOperationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="now" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="inSaldo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="outSaldo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="inSaldoBlocked" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="outSaldoBlocked" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="debitAmountTotal" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="creditAmountTotal" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="orders" type="{http://www.moneta.ru/schemas/messages.xsd}AccountStatementRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paging" type="{http://www.moneta.ru/schemas/messages.xsd}AccountStatementPaging" minOccurs="0"/&gt;
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
    "ownerAccount",
    "contractDate",
    "ownerAccountCurrency",
    "ownerName",
    "dateFrom",
    "dateTo",
    "lastOperationDate",
    "now",
    "inSaldo",
    "outSaldo",
    "inSaldoBlocked",
    "outSaldoBlocked",
    "debitAmountTotal",
    "creditAmountTotal",
    "attribute",
    "totalSize",
    "orders",
    "paging"
})
@XmlRootElement(name = "AccountStatementResponse")
public class AccountStatementResponse
    implements Serializable
{

    protected String ownerAccount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    protected String ownerAccountCurrency;
    protected String ownerName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOperationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar now;
    protected BigDecimal inSaldo;
    protected BigDecimal outSaldo;
    protected BigDecimal inSaldoBlocked;
    protected BigDecimal outSaldoBlocked;
    protected BigDecimal debitAmountTotal;
    protected BigDecimal creditAmountTotal;
    protected List<KeyValueAttribute> attribute;
    protected Long totalSize;
    protected List<AccountStatementRecordType> orders;
    protected AccountStatementPaging paging;

    /**
     * Gets the value of the ownerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * Sets the value of the ownerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAccount(String value) {
        this.ownerAccount = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the ownerAccountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAccountCurrency() {
        return ownerAccountCurrency;
    }

    /**
     * Sets the value of the ownerAccountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAccountCurrency(String value) {
        this.ownerAccountCurrency = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
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
     * Gets the value of the lastOperationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOperationDate() {
        return lastOperationDate;
    }

    /**
     * Sets the value of the lastOperationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOperationDate(XMLGregorianCalendar value) {
        this.lastOperationDate = value;
    }

    /**
     * Gets the value of the now property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNow() {
        return now;
    }

    /**
     * Sets the value of the now property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNow(XMLGregorianCalendar value) {
        this.now = value;
    }

    /**
     * Gets the value of the inSaldo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSaldo() {
        return inSaldo;
    }

    /**
     * Sets the value of the inSaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSaldo(BigDecimal value) {
        this.inSaldo = value;
    }

    /**
     * Gets the value of the outSaldo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSaldo() {
        return outSaldo;
    }

    /**
     * Sets the value of the outSaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSaldo(BigDecimal value) {
        this.outSaldo = value;
    }

    /**
     * Gets the value of the inSaldoBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSaldoBlocked() {
        return inSaldoBlocked;
    }

    /**
     * Sets the value of the inSaldoBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSaldoBlocked(BigDecimal value) {
        this.inSaldoBlocked = value;
    }

    /**
     * Gets the value of the outSaldoBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSaldoBlocked() {
        return outSaldoBlocked;
    }

    /**
     * Sets the value of the outSaldoBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSaldoBlocked(BigDecimal value) {
        this.outSaldoBlocked = value;
    }

    /**
     * Gets the value of the debitAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitAmountTotal() {
        return debitAmountTotal;
    }

    /**
     * Sets the value of the debitAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitAmountTotal(BigDecimal value) {
        this.debitAmountTotal = value;
    }

    /**
     * Gets the value of the creditAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmountTotal() {
        return creditAmountTotal;
    }

    /**
     * Sets the value of the creditAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmountTotal(BigDecimal value) {
        this.creditAmountTotal = value;
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

    /**
     * Gets the value of the totalSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * Sets the value of the totalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSize(Long value) {
        this.totalSize = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatementRecordType }
     * 
     * 
     */
    public List<AccountStatementRecordType> getOrders() {
        if (orders == null) {
            orders = new ArrayList<AccountStatementRecordType>();
        }
        return this.orders;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatementPaging }
     *     
     */
    public AccountStatementPaging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatementPaging }
     *     
     */
    public void setPaging(AccountStatementPaging value) {
        this.paging = value;
    }

}
