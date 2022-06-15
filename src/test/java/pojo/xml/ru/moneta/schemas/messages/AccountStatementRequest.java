
package ru.moneta.schemas.messages;

import java.io.Serializable;
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
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.moneta.ru/schemas/messages.xsd}AccountId"/&gt;
 *         &lt;element name="accountRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="20"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *             &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="selectPeriod"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;enumeration value="TODAY"/&gt;
 *                 &lt;enumeration value="YESTERDAY"/&gt;
 *                 &lt;enumeration value="CURRENT_WEEK"/&gt;
 *                 &lt;enumeration value="CURRENT_MONTH"/&gt;
 *                 &lt;enumeration value="PREVIOUS_MONTH"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="searchInArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="operationPropertyNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="showPaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="paging" type="{http://www.moneta.ru/schemas/messages.xsd}AccountStatementPaging" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountId",
    "accountRS",
    "dateFrom",
    "dateTo",
    "selectPeriod",
    "searchInArchive",
    "showActions",
    "operationPropertyNames",
    "pageSize",
    "showPaging",
    "paging"
})
@XmlRootElement(name = "AccountStatementRequest")
public class AccountStatementRequest
    extends Entity
    implements Serializable
{

    protected long accountId;
    protected String accountRS;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    protected String selectPeriod;
    @XmlElement(defaultValue = "false")
    protected Boolean searchInArchive;
    @XmlElement(defaultValue = "false")
    protected Boolean showActions;
    protected String operationPropertyNames;
    @XmlElement(defaultValue = "25")
    protected int pageSize;
    @XmlElement(defaultValue = "false")
    protected Boolean showPaging;
    protected AccountStatementPaging paging;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRS() {
        return accountRS;
    }

    /**
     * Sets the value of the accountRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRS(String value) {
        this.accountRS = value;
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
     * Gets the value of the selectPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectPeriod() {
        return selectPeriod;
    }

    /**
     * Sets the value of the selectPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectPeriod(String value) {
        this.selectPeriod = value;
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
     * Gets the value of the showActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowActions() {
        return showActions;
    }

    /**
     * Sets the value of the showActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowActions(Boolean value) {
        this.showActions = value;
    }

    /**
     * Gets the value of the operationPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationPropertyNames() {
        return operationPropertyNames;
    }

    /**
     * Sets the value of the operationPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationPropertyNames(String value) {
        this.operationPropertyNames = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the showPaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPaging() {
        return showPaging;
    }

    /**
     * Sets the value of the showPaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPaging(Boolean value) {
        this.showPaging = value;
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
