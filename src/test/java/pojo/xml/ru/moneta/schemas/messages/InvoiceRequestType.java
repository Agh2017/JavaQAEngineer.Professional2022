
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transaction parameters for creating an invoice.
 * 
 * <p>Java class for InvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="amount" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *         &lt;element name="clientTransaction" type="{http://www.moneta.ru/schemas/messages.xsd}CTID"/&gt;
 *         &lt;element name="description" type="{http://www.moneta.ru/schemas/messages.xsd}Description" minOccurs="0"/&gt;
 *         &lt;element name="mnt_custom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnt_custom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnt_custom3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRequestType", propOrder = {
    "payer",
    "payee",
    "amount",
    "clientTransaction",
    "description",
    "mntCustom1",
    "mntCustom2",
    "mntCustom3",
    "operationInfo"
})
@XmlSeeAlso({
    InvoiceRequest.class
})
public class InvoiceRequestType
    extends Entity
    implements Serializable
{

    protected String payer;
    protected long payee;
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String clientTransaction;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(name = "mnt_custom1")
    protected String mntCustom1;
    @XmlElement(name = "mnt_custom2")
    protected String mntCustom2;
    @XmlElement(name = "mnt_custom3")
    protected String mntCustom3;
    protected OperationInfo operationInfo;

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     */
    public long getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     */
    public void setPayee(long value) {
        this.payee = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Gets the value of the mntCustom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntCustom1() {
        return mntCustom1;
    }

    /**
     * Sets the value of the mntCustom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntCustom1(String value) {
        this.mntCustom1 = value;
    }

    /**
     * Gets the value of the mntCustom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntCustom2() {
        return mntCustom2;
    }

    /**
     * Sets the value of the mntCustom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntCustom2(String value) {
        this.mntCustom2 = value;
    }

    /**
     * Gets the value of the mntCustom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntCustom3() {
        return mntCustom3;
    }

    /**
     * Sets the value of the mntCustom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntCustom3(String value) {
        this.mntCustom3 = value;
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
