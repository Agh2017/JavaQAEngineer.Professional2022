
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTemplateReminderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationTemplateReminderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remind" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hoursBeforeExecution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="notification" type="{http://www.moneta.ru/schemas/messages.xsd}ProfileNotificationSelection" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationTemplateReminderInfo", propOrder = {
    "remind",
    "hoursBeforeExecution",
    "notification"
})
public class OperationTemplateReminderInfo
    extends AbstractAttributeObject
    implements Serializable
{

    protected boolean remind;
    protected Integer hoursBeforeExecution;
    protected List<ProfileNotificationSelection> notification;

    /**
     * Gets the value of the remind property.
     * 
     */
    public boolean isRemind() {
        return remind;
    }

    /**
     * Sets the value of the remind property.
     * 
     */
    public void setRemind(boolean value) {
        this.remind = value;
    }

    /**
     * Gets the value of the hoursBeforeExecution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursBeforeExecution() {
        return hoursBeforeExecution;
    }

    /**
     * Sets the value of the hoursBeforeExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursBeforeExecution(Integer value) {
        this.hoursBeforeExecution = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileNotificationSelection }
     * 
     * 
     */
    public List<ProfileNotificationSelection> getNotification() {
        if (notification == null) {
            notification = new ArrayList<ProfileNotificationSelection>();
        }
        return this.notification;
    }

}
