
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
 *         &lt;element name="groupByCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="turnover" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
 *                   &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
 *                   &lt;element name="incomeAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="incomeCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="incomeTransactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="incomeLockedBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="expenseAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="expensesIncludingCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="expensesExtraCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="expenseTransactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="expenseLockedBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="total" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="openingBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
 *                   &lt;element name="closingBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
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
    "groupByCurrency",
    "turnover"
})
@XmlRootElement(name = "GetTurnoverListResponse")
public class GetTurnoverListResponse
    implements Serializable
{

    @XmlElement(defaultValue = "true")
    protected Boolean groupByCurrency;
    protected List<GetTurnoverListResponse.Turnover> turnover;

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
     * Gets the value of the turnover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turnover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurnover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetTurnoverListResponse.Turnover }
     * 
     * 
     */
    public List<GetTurnoverListResponse.Turnover> getTurnover() {
        if (turnover == null) {
            turnover = new ArrayList<GetTurnoverListResponse.Turnover>();
        }
        return this.turnover;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
     *         &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
     *         &lt;element name="incomeAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="incomeCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="incomeTransactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="incomeLockedBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="expenseAmount" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="expensesIncludingCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="expensesExtraCommission" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="expenseTransactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="expenseLockedBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="total" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="openingBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
     *         &lt;element name="closingBalance" type="{http://www.moneta.ru/schemas/messages.xsd}Money"/&gt;
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
        "date",
        "account",
        "currency",
        "operationTypeCategory",
        "incomeAmount",
        "incomeCommission",
        "incomeTransactionsCount",
        "incomeLockedBalance",
        "expenseAmount",
        "expensesIncludingCommission",
        "expensesExtraCommission",
        "expenseTransactionsCount",
        "expenseLockedBalance",
        "total",
        "openingBalance",
        "closingBalance"
    })
    public static class Turnover
        implements Serializable
    {

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        protected String account;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected Currency currency;
        @XmlSchemaType(name = "string")
        protected OperationTypeCategory operationTypeCategory;
        @XmlElement(required = true)
        protected BigDecimal incomeAmount;
        @XmlElement(required = true)
        protected BigDecimal incomeCommission;
        protected long incomeTransactionsCount;
        protected BigDecimal incomeLockedBalance;
        @XmlElement(required = true)
        protected BigDecimal expenseAmount;
        @XmlElement(required = true)
        protected BigDecimal expensesIncludingCommission;
        @XmlElement(required = true)
        protected BigDecimal expensesExtraCommission;
        protected long expenseTransactionsCount;
        protected BigDecimal expenseLockedBalance;
        @XmlElement(required = true)
        protected BigDecimal total;
        @XmlElement(required = true)
        protected BigDecimal openingBalance;
        @XmlElement(required = true)
        protected BigDecimal closingBalance;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCurrency(Currency value) {
            this.currency = value;
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
         * Gets the value of the incomeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIncomeAmount() {
            return incomeAmount;
        }

        /**
         * Sets the value of the incomeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIncomeAmount(BigDecimal value) {
            this.incomeAmount = value;
        }

        /**
         * Gets the value of the incomeCommission property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIncomeCommission() {
            return incomeCommission;
        }

        /**
         * Sets the value of the incomeCommission property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIncomeCommission(BigDecimal value) {
            this.incomeCommission = value;
        }

        /**
         * Gets the value of the incomeTransactionsCount property.
         * 
         */
        public long getIncomeTransactionsCount() {
            return incomeTransactionsCount;
        }

        /**
         * Sets the value of the incomeTransactionsCount property.
         * 
         */
        public void setIncomeTransactionsCount(long value) {
            this.incomeTransactionsCount = value;
        }

        /**
         * Gets the value of the incomeLockedBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIncomeLockedBalance() {
            return incomeLockedBalance;
        }

        /**
         * Sets the value of the incomeLockedBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIncomeLockedBalance(BigDecimal value) {
            this.incomeLockedBalance = value;
        }

        /**
         * Gets the value of the expenseAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExpenseAmount() {
            return expenseAmount;
        }

        /**
         * Sets the value of the expenseAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExpenseAmount(BigDecimal value) {
            this.expenseAmount = value;
        }

        /**
         * Gets the value of the expensesIncludingCommission property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExpensesIncludingCommission() {
            return expensesIncludingCommission;
        }

        /**
         * Sets the value of the expensesIncludingCommission property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExpensesIncludingCommission(BigDecimal value) {
            this.expensesIncludingCommission = value;
        }

        /**
         * Gets the value of the expensesExtraCommission property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExpensesExtraCommission() {
            return expensesExtraCommission;
        }

        /**
         * Sets the value of the expensesExtraCommission property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExpensesExtraCommission(BigDecimal value) {
            this.expensesExtraCommission = value;
        }

        /**
         * Gets the value of the expenseTransactionsCount property.
         * 
         */
        public long getExpenseTransactionsCount() {
            return expenseTransactionsCount;
        }

        /**
         * Sets the value of the expenseTransactionsCount property.
         * 
         */
        public void setExpenseTransactionsCount(long value) {
            this.expenseTransactionsCount = value;
        }

        /**
         * Gets the value of the expenseLockedBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExpenseLockedBalance() {
            return expenseLockedBalance;
        }

        /**
         * Sets the value of the expenseLockedBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExpenseLockedBalance(BigDecimal value) {
            this.expenseLockedBalance = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotal(BigDecimal value) {
            this.total = value;
        }

        /**
         * Gets the value of the openingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOpeningBalance() {
            return openingBalance;
        }

        /**
         * Sets the value of the openingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOpeningBalance(BigDecimal value) {
            this.openingBalance = value;
        }

        /**
         * Gets the value of the closingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getClosingBalance() {
            return closingBalance;
        }

        /**
         * Sets the value of the closingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setClosingBalance(BigDecimal value) {
            this.closingBalance = value;
        }

    }

}
