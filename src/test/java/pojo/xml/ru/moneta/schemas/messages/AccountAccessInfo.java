
package ru.moneta.schemas.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information about delegated access to a merchant account.
 * 
 * <p>Java class for AccountAccessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountAccessInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessToWrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="accessToTakenOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="accessToTakenIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAccessInfo", propOrder = {
    "accessToWrite",
    "accessToTakenOut",
    "accessToTakenIn"
})
public class AccountAccessInfo
    implements Serializable
{

    protected boolean accessToWrite;
    protected boolean accessToTakenOut;
    protected boolean accessToTakenIn;

    /**
     * Gets the value of the accessToWrite property.
     * 
     */
    public boolean isAccessToWrite() {
        return accessToWrite;
    }

    /**
     * Sets the value of the accessToWrite property.
     * 
     */
    public void setAccessToWrite(boolean value) {
        this.accessToWrite = value;
    }

    /**
     * Gets the value of the accessToTakenOut property.
     * 
     */
    public boolean isAccessToTakenOut() {
        return accessToTakenOut;
    }

    /**
     * Sets the value of the accessToTakenOut property.
     * 
     */
    public void setAccessToTakenOut(boolean value) {
        this.accessToTakenOut = value;
    }

    /**
     * Gets the value of the accessToTakenIn property.
     * 
     */
    public boolean isAccessToTakenIn() {
        return accessToTakenIn;
    }

    /**
     * Sets the value of the accessToTakenIn property.
     * 
     */
    public void setAccessToTakenIn(boolean value) {
        this.accessToTakenIn = value;
    }

}
