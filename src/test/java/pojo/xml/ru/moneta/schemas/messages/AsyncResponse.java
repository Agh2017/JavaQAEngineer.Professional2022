
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}GetTurnoverListResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}GetFinancialFlowsListResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}SimplifiedIdentificationResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}PingResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}PaymentResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}VerifyPaymentResponse"/&gt;
 *         &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}VerifyPaymentBatchResponse"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *           &lt;element name="asyncStatus" type="{http://www.moneta.ru/schemas/messages.xsd}AsyncStatus"/&gt;
 *           &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTurnoverListResponse",
    "getFinancialFlowsListResponse",
    "simplifiedIdentificationResponse",
    "pingResponse",
    "paymentResponse",
    "verifyPaymentResponse",
    "verifyPaymentBatchResponse",
    "asyncId",
    "asyncStatus",
    "expirationDate"
})
@XmlRootElement(name = "AsyncResponse")
public class AsyncResponse
    implements Serializable
{

    @XmlElement(name = "GetTurnoverListResponse")
    protected GetTurnoverListResponse getTurnoverListResponse;
    @XmlElement(name = "GetFinancialFlowsListResponse")
    protected GetFinancialFlowsListResponse getFinancialFlowsListResponse;
    @XmlElement(name = "SimplifiedIdentificationResponse")
    protected SimplifiedIdentificationResponse simplifiedIdentificationResponse;
    @XmlElement(name = "PingResponse")
    protected PingResponse pingResponse;
    @XmlElement(name = "PaymentResponse")
    protected PaymentResponse paymentResponse;
    @XmlElement(name = "VerifyPaymentResponse")
    protected VerifyPaymentResponse verifyPaymentResponse;
    @XmlElement(name = "VerifyPaymentBatchResponse")
    protected VerifyPaymentBatchResponse verifyPaymentBatchResponse;
    protected Long asyncId;
    @XmlSchemaType(name = "string")
    protected AsyncStatus asyncStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the getTurnoverListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetTurnoverListResponse }
     *     
     */
    public GetTurnoverListResponse getGetTurnoverListResponse() {
        return getTurnoverListResponse;
    }

    /**
     * Sets the value of the getTurnoverListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTurnoverListResponse }
     *     
     */
    public void setGetTurnoverListResponse(GetTurnoverListResponse value) {
        this.getTurnoverListResponse = value;
    }

    /**
     * Gets the value of the getFinancialFlowsListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialFlowsListResponse }
     *     
     */
    public GetFinancialFlowsListResponse getGetFinancialFlowsListResponse() {
        return getFinancialFlowsListResponse;
    }

    /**
     * Sets the value of the getFinancialFlowsListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialFlowsListResponse }
     *     
     */
    public void setGetFinancialFlowsListResponse(GetFinancialFlowsListResponse value) {
        this.getFinancialFlowsListResponse = value;
    }

    /**
     * Gets the value of the simplifiedIdentificationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SimplifiedIdentificationResponse }
     *     
     */
    public SimplifiedIdentificationResponse getSimplifiedIdentificationResponse() {
        return simplifiedIdentificationResponse;
    }

    /**
     * Sets the value of the simplifiedIdentificationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplifiedIdentificationResponse }
     *     
     */
    public void setSimplifiedIdentificationResponse(SimplifiedIdentificationResponse value) {
        this.simplifiedIdentificationResponse = value;
    }

    /**
     * Gets the value of the pingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PingResponse }
     *     
     */
    public PingResponse getPingResponse() {
        return pingResponse;
    }

    /**
     * Sets the value of the pingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingResponse }
     *     
     */
    public void setPingResponse(PingResponse value) {
        this.pingResponse = value;
    }

    /**
     * Gets the value of the paymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse }
     *     
     */
    public PaymentResponse getPaymentResponse() {
        return paymentResponse;
    }

    /**
     * Sets the value of the paymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse }
     *     
     */
    public void setPaymentResponse(PaymentResponse value) {
        this.paymentResponse = value;
    }

    /**
     * Gets the value of the verifyPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyPaymentResponse }
     *     
     */
    public VerifyPaymentResponse getVerifyPaymentResponse() {
        return verifyPaymentResponse;
    }

    /**
     * Sets the value of the verifyPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyPaymentResponse }
     *     
     */
    public void setVerifyPaymentResponse(VerifyPaymentResponse value) {
        this.verifyPaymentResponse = value;
    }

    /**
     * Gets the value of the verifyPaymentBatchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyPaymentBatchResponse }
     *     
     */
    public VerifyPaymentBatchResponse getVerifyPaymentBatchResponse() {
        return verifyPaymentBatchResponse;
    }

    /**
     * Sets the value of the verifyPaymentBatchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyPaymentBatchResponse }
     *     
     */
    public void setVerifyPaymentBatchResponse(VerifyPaymentBatchResponse value) {
        this.verifyPaymentBatchResponse = value;
    }

    /**
     * Gets the value of the asyncId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAsyncId() {
        return asyncId;
    }

    /**
     * Sets the value of the asyncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAsyncId(Long value) {
        this.asyncId = value;
    }

    /**
     * Gets the value of the asyncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatus }
     *     
     */
    public AsyncStatus getAsyncStatus() {
        return asyncStatus;
    }

    /**
     * Sets the value of the asyncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatus }
     *     
     */
    public void setAsyncStatus(AsyncStatus value) {
        this.asyncStatus = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
