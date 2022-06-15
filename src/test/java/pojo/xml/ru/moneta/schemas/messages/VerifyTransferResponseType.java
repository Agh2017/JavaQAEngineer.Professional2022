
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * MONETA.RU verification status of a transaction.
 * 
 * <p>Java class for VerifyTransferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyTransferResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTransactionValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forecast" type="{http://www.moneta.ru/schemas/messages.xsd}ForecastTransactionResponseType" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyTransferResponseType", propOrder = {
    "isTransactionValid",
    "description",
    "forecast",
    "errorCode",
    "operationInfo"
})
@XmlSeeAlso({
    VerifyTransferResponse.class,
    VerifyTransactionResponseType.class
})
public class VerifyTransferResponseType
    implements Serializable
{

    protected boolean isTransactionValid;
    protected String description;
    protected ForecastTransactionResponseType forecast;
    protected String errorCode;
    protected OperationInfo operationInfo;

    /**
     * Gets the value of the isTransactionValid property.
     * 
     */
    public boolean isIsTransactionValid() {
        return isTransactionValid;
    }

    /**
     * Sets the value of the isTransactionValid property.
     * 
     */
    public void setIsTransactionValid(boolean value) {
        this.isTransactionValid = value;
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
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastTransactionResponseType }
     *     
     */
    public ForecastTransactionResponseType getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastTransactionResponseType }
     *     
     */
    public void setForecast(ForecastTransactionResponseType value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInfo }
     *     
     */
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInfo }
     *     
     */
    public void setOperationInfo(OperationInfo value) {
        this.operationInfo = value;
    }

}
