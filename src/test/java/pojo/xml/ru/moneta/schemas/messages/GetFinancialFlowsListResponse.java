
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
 *         &lt;element name="financialFlow" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="payerSideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="payerFlowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="payerFlowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="payerCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
 *                   &lt;element name="payeeSideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="payeeFlowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="payeeFlowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="payeeCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
 *                   &lt;element name="payerDebited" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="payerWithheld" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="payerFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="payerExchangeFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="payeeCredited" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="payeeFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="transactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
 *                   &lt;element name="operationStatusState" type="{http://www.moneta.ru/schemas/messages.xsd}OperationStatusState"/&gt;
 *                   &lt;element name="reversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "financialFlow"
})
@XmlRootElement(name = "GetFinancialFlowsListResponse")
public class GetFinancialFlowsListResponse
    implements Serializable
{

    protected List<GetFinancialFlowsListResponse.FinancialFlow> financialFlow;

    /**
     * Gets the value of the financialFlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialFlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialFlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetFinancialFlowsListResponse.FinancialFlow }
     * 
     * 
     */
    public List<GetFinancialFlowsListResponse.FinancialFlow> getFinancialFlow() {
        if (financialFlow == null) {
            financialFlow = new ArrayList<GetFinancialFlowsListResponse.FinancialFlow>();
        }
        return this.financialFlow;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="payerSideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="payerFlowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="payerFlowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="payerCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
     *         &lt;element name="payeeSideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="payeeFlowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="payeeFlowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="payeeCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency"/&gt;
     *         &lt;element name="payerDebited" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="payerWithheld" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="payerFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="payerExchangeFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="payeeCredited" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="payeeFee" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="transactionsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="operationTypeCategory" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTypeCategory" minOccurs="0"/&gt;
     *         &lt;element name="operationStatusState" type="{http://www.moneta.ru/schemas/messages.xsd}OperationStatusState"/&gt;
     *         &lt;element name="reversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "date",
        "payerSideAccess",
        "payerFlowId",
        "payerFlowName",
        "payerCurrencyCode",
        "payeeSideAccess",
        "payeeFlowId",
        "payeeFlowName",
        "payeeCurrencyCode",
        "payerDebited",
        "payerWithheld",
        "payerFee",
        "payerExchangeFee",
        "payeeCredited",
        "payeeFee",
        "transactionsCount",
        "operationTypeCategory",
        "operationStatusState",
        "reversal",
        "attribute"
    })
    public static class FinancialFlow
        implements Serializable
    {

        protected String date;
        protected boolean payerSideAccess;
        protected long payerFlowId;
        @XmlElement(required = true)
        protected String payerFlowName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected Currency payerCurrencyCode;
        protected boolean payeeSideAccess;
        protected long payeeFlowId;
        @XmlElement(required = true)
        protected String payeeFlowName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected Currency payeeCurrencyCode;
        protected BigDecimal payerDebited;
        protected BigDecimal payerWithheld;
        protected BigDecimal payerFee;
        protected BigDecimal payerExchangeFee;
        protected BigDecimal payeeCredited;
        protected BigDecimal payeeFee;
        protected long transactionsCount;
        @XmlSchemaType(name = "string")
        protected OperationTypeCategory operationTypeCategory;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected OperationStatusState operationStatusState;
        protected Boolean reversal;
        protected List<KeyValueAttribute> attribute;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the payerSideAccess property.
         * 
         */
        public boolean isPayerSideAccess() {
            return payerSideAccess;
        }

        /**
         * Sets the value of the payerSideAccess property.
         * 
         */
        public void setPayerSideAccess(boolean value) {
            this.payerSideAccess = value;
        }

        /**
         * Gets the value of the payerFlowId property.
         * 
         */
        public long getPayerFlowId() {
            return payerFlowId;
        }

        /**
         * Sets the value of the payerFlowId property.
         * 
         */
        public void setPayerFlowId(long value) {
            this.payerFlowId = value;
        }

        /**
         * Gets the value of the payerFlowName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerFlowName() {
            return payerFlowName;
        }

        /**
         * Sets the value of the payerFlowName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerFlowName(String value) {
            this.payerFlowName = value;
        }

        /**
         * Gets the value of the payerCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getPayerCurrencyCode() {
            return payerCurrencyCode;
        }

        /**
         * Sets the value of the payerCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setPayerCurrencyCode(Currency value) {
            this.payerCurrencyCode = value;
        }

        /**
         * Gets the value of the payeeSideAccess property.
         * 
         */
        public boolean isPayeeSideAccess() {
            return payeeSideAccess;
        }

        /**
         * Sets the value of the payeeSideAccess property.
         * 
         */
        public void setPayeeSideAccess(boolean value) {
            this.payeeSideAccess = value;
        }

        /**
         * Gets the value of the payeeFlowId property.
         * 
         */
        public long getPayeeFlowId() {
            return payeeFlowId;
        }

        /**
         * Sets the value of the payeeFlowId property.
         * 
         */
        public void setPayeeFlowId(long value) {
            this.payeeFlowId = value;
        }

        /**
         * Gets the value of the payeeFlowName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayeeFlowName() {
            return payeeFlowName;
        }

        /**
         * Sets the value of the payeeFlowName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayeeFlowName(String value) {
            this.payeeFlowName = value;
        }

        /**
         * Gets the value of the payeeCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getPayeeCurrencyCode() {
            return payeeCurrencyCode;
        }

        /**
         * Sets the value of the payeeCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setPayeeCurrencyCode(Currency value) {
            this.payeeCurrencyCode = value;
        }

        /**
         * Gets the value of the payerDebited property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayerDebited() {
            return payerDebited;
        }

        /**
         * Sets the value of the payerDebited property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayerDebited(BigDecimal value) {
            this.payerDebited = value;
        }

        /**
         * Gets the value of the payerWithheld property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayerWithheld() {
            return payerWithheld;
        }

        /**
         * Sets the value of the payerWithheld property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayerWithheld(BigDecimal value) {
            this.payerWithheld = value;
        }

        /**
         * Gets the value of the payerFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayerFee() {
            return payerFee;
        }

        /**
         * Sets the value of the payerFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayerFee(BigDecimal value) {
            this.payerFee = value;
        }

        /**
         * Gets the value of the payerExchangeFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayerExchangeFee() {
            return payerExchangeFee;
        }

        /**
         * Sets the value of the payerExchangeFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayerExchangeFee(BigDecimal value) {
            this.payerExchangeFee = value;
        }

        /**
         * Gets the value of the payeeCredited property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayeeCredited() {
            return payeeCredited;
        }

        /**
         * Sets the value of the payeeCredited property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayeeCredited(BigDecimal value) {
            this.payeeCredited = value;
        }

        /**
         * Gets the value of the payeeFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayeeFee() {
            return payeeFee;
        }

        /**
         * Sets the value of the payeeFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayeeFee(BigDecimal value) {
            this.payeeFee = value;
        }

        /**
         * Gets the value of the transactionsCount property.
         * 
         */
        public long getTransactionsCount() {
            return transactionsCount;
        }

        /**
         * Sets the value of the transactionsCount property.
         * 
         */
        public void setTransactionsCount(long value) {
            this.transactionsCount = value;
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
         * Gets the value of the operationStatusState property.
         * 
         * @return
         *     possible object is
         *     {@link OperationStatusState }
         *     
         */
        public OperationStatusState getOperationStatusState() {
            return operationStatusState;
        }

        /**
         * Sets the value of the operationStatusState property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationStatusState }
         *     
         */
        public void setOperationStatusState(OperationStatusState value) {
            this.operationStatusState = value;
        }

        /**
         * Gets the value of the reversal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReversal() {
            return reversal;
        }

        /**
         * Sets the value of the reversal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReversal(Boolean value) {
            this.reversal = value;
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

}
