
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Request parameters for creating invoices in batch mode.
 * 
 * <p>Java class for InvoiceBatchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceBatchRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}EntityBatchRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transaction" type="{http://www.moneta.ru/schemas/messages.xsd}InvoiceRequestType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceBatchRequestType", propOrder = {
    "transaction"
})
@XmlSeeAlso({
    InvoiceBatchRequest.class
})
public class InvoiceBatchRequestType
    extends EntityBatchRequestType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<InvoiceRequestType> transaction;

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRequestType }
     * 
     * 
     */
    public List<InvoiceRequestType> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<InvoiceRequestType>();
        }
        return this.transaction;
    }

}