
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}GetTurnoverListRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}GetFinancialFlowsListRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}SimplifiedIdentificationRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}PingRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}PaymentRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}VerifyPaymentRequest"/&gt;
 *             &lt;element ref="{http://www.moneta.ru/schemas/messages.xsd}VerifyPaymentBatchRequest"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="callbackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "getTurnoverListRequest",
    "getFinancialFlowsListRequest",
    "simplifiedIdentificationRequest",
    "pingRequest",
    "paymentRequest",
    "verifyPaymentRequest",
    "verifyPaymentBatchRequest",
    "callbackUrl",
    "asyncId"
})
@XmlRootElement(name = "AsyncRequest")
public class AsyncRequest
    implements Serializable
{

    @XmlElement(name = "GetTurnoverListRequest")
    protected GetTurnoverListRequest getTurnoverListRequest;
    @XmlElement(name = "GetFinancialFlowsListRequest")
    protected GetFinancialFlowsListRequest getFinancialFlowsListRequest;
    @XmlElement(name = "SimplifiedIdentificationRequest")
    protected SimplifiedIdentificationRequest simplifiedIdentificationRequest;
    @XmlElement(name = "PingRequest")
    protected PingRequest pingRequest;
    @XmlElement(name = "PaymentRequest")
    protected PaymentRequest paymentRequest;
    @XmlElement(name = "VerifyPaymentRequest")
    protected VerifyPaymentRequest verifyPaymentRequest;
    @XmlElement(name = "VerifyPaymentBatchRequest")
    protected VerifyPaymentBatchRequest verifyPaymentBatchRequest;
    protected String callbackUrl;
    protected Long asyncId;

    /**
     * Gets the value of the getTurnoverListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTurnoverListRequest }
     *     
     */
    public GetTurnoverListRequest getGetTurnoverListRequest() {
        return getTurnoverListRequest;
    }

    /**
     * Sets the value of the getTurnoverListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTurnoverListRequest }
     *     
     */
    public void setGetTurnoverListRequest(GetTurnoverListRequest value) {
        this.getTurnoverListRequest = value;
    }

    /**
     * Gets the value of the getFinancialFlowsListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialFlowsListRequest }
     *     
     */
    public GetFinancialFlowsListRequest getGetFinancialFlowsListRequest() {
        return getFinancialFlowsListRequest;
    }

    /**
     * Sets the value of the getFinancialFlowsListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialFlowsListRequest }
     *     
     */
    public void setGetFinancialFlowsListRequest(GetFinancialFlowsListRequest value) {
        this.getFinancialFlowsListRequest = value;
    }

    /**
     * Gets the value of the simplifiedIdentificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SimplifiedIdentificationRequest }
     *     
     */
    public SimplifiedIdentificationRequest getSimplifiedIdentificationRequest() {
        return simplifiedIdentificationRequest;
    }

    /**
     * Sets the value of the simplifiedIdentificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplifiedIdentificationRequest }
     *     
     */
    public void setSimplifiedIdentificationRequest(SimplifiedIdentificationRequest value) {
        this.simplifiedIdentificationRequest = value;
    }

    /**
     * Gets the value of the pingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PingRequest }
     *     
     */
    public PingRequest getPingRequest() {
        return pingRequest;
    }

    /**
     * Sets the value of the pingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingRequest }
     *     
     */
    public void setPingRequest(PingRequest value) {
        this.pingRequest = value;
    }

    /**
     * Gets the value of the paymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest }
     *     
     */
    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    /**
     * Sets the value of the paymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest }
     *     
     */
    public void setPaymentRequest(PaymentRequest value) {
        this.paymentRequest = value;
    }

    /**
     * Gets the value of the verifyPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyPaymentRequest }
     *     
     */
    public VerifyPaymentRequest getVerifyPaymentRequest() {
        return verifyPaymentRequest;
    }

    /**
     * Sets the value of the verifyPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyPaymentRequest }
     *     
     */
    public void setVerifyPaymentRequest(VerifyPaymentRequest value) {
        this.verifyPaymentRequest = value;
    }

    /**
     * Gets the value of the verifyPaymentBatchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyPaymentBatchRequest }
     *     
     */
    public VerifyPaymentBatchRequest getVerifyPaymentBatchRequest() {
        return verifyPaymentBatchRequest;
    }

    /**
     * Sets the value of the verifyPaymentBatchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyPaymentBatchRequest }
     *     
     */
    public void setVerifyPaymentBatchRequest(VerifyPaymentBatchRequest value) {
        this.verifyPaymentBatchRequest = value;
    }

    /**
     * Gets the value of the callbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets the value of the callbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackUrl(String value) {
        this.callbackUrl = value;
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

}
