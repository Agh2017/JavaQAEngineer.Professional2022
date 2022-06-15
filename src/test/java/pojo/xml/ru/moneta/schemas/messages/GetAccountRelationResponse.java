
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence&gt;
 *         &lt;element name="accountRelation" type="{http://www.moneta.ru/schemas/messages.xsd}AccountRelation" minOccurs="0"/&gt;
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
    "accountRelation"
})
@XmlRootElement(name = "GetAccountRelationResponse")
public class GetAccountRelationResponse
    implements Serializable
{

    protected AccountRelation accountRelation;

    /**
     * Gets the value of the accountRelation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRelation }
     *     
     */
    public AccountRelation getAccountRelation() {
        return accountRelation;
    }

    /**
     * Sets the value of the accountRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRelation }
     *     
     */
    public void setAccountRelation(AccountRelation value) {
        this.accountRelation = value;
    }

}
