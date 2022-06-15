
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="accountRelation" type="{http://www.moneta.ru/schemas/messages.xsd}AccountRelation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "FindAccountRelationsResponse")
public class FindAccountRelationsResponse
    implements Serializable
{

    protected List<AccountRelation> accountRelation;

    /**
     * Gets the value of the accountRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRelation }
     * 
     * 
     */
    public List<AccountRelation> getAccountRelation() {
        if (accountRelation == null) {
            accountRelation = new ArrayList<AccountRelation>();
        }
        return this.accountRelation;
    }

}
