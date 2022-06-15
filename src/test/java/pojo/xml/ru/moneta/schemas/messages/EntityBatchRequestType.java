
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Parameters for requests in batch mode.
 * 
 * <p>Java class for EntityBatchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityBatchRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="exitOnFailure" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityBatchRequestType", propOrder = {
    "transactional",
    "exitOnFailure"
})
@XmlSeeAlso({
    CancelTransactionBatchRequestType.class,
    ConfirmTransactionBatchRequestType.class,
    AuthoriseTransactionBatchRequestType.class,
    PaymentBatchRequestType.class,
    TransactionBatchRequestType.class,
    InvoiceBatchRequestType.class
})
public class EntityBatchRequestType
    extends Entity
    implements Serializable
{

    protected boolean transactional;
    protected boolean exitOnFailure;

    /**
     * Gets the value of the transactional property.
     * 
     */
    public boolean isTransactional() {
        return transactional;
    }

    /**
     * Sets the value of the transactional property.
     * 
     */
    public void setTransactional(boolean value) {
        this.transactional = value;
    }

    /**
     * Gets the value of the exitOnFailure property.
     * 
     */
    public boolean isExitOnFailure() {
        return exitOnFailure;
    }

    /**
     * Sets the value of the exitOnFailure property.
     * 
     */
    public void setExitOnFailure(boolean value) {
        this.exitOnFailure = value;
    }

}
