
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
 * Request parameters for canceling transactions in  batch mode.
 * 
 * <p>Java class for CancelTransactionBatchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelTransactionBatchRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}EntityBatchRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transaction" type="{http://www.moneta.ru/schemas/messages.xsd}CancelTransactionRequestType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelTransactionBatchRequestType", propOrder = {
    "transaction"
})
@XmlSeeAlso({
    CancelTransactionBatchRequest.class
})
public class CancelTransactionBatchRequestType
    extends EntityBatchRequestType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<CancelTransactionRequestType> transaction;

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
     * {@link CancelTransactionRequestType }
     * 
     * 
     */
    public List<CancelTransactionRequestType> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<CancelTransactionRequestType>();
        }
        return this.transaction;
    }

}
