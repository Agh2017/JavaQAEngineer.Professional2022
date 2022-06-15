
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegularOperationTemplateParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularOperationTemplateParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateAmountInfo" minOccurs="0"/&gt;
 *         &lt;element name="timeInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateTimeInfo" minOccurs="0"/&gt;
 *         &lt;element name="reminderInfo" type="{http://www.moneta.ru/schemas/messages.xsd}OperationTemplateReminderInfo" minOccurs="0"/&gt;
 *         &lt;element name="operationsReportNotifications" type="{http://www.moneta.ru/schemas/messages.xsd}ProfileNotificationSelection" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularOperationTemplateParameters", propOrder = {
    "amountInfo",
    "timeInfo",
    "reminderInfo",
    "operationsReportNotifications"
})
public class RegularOperationTemplateParameters
    extends AbstractAttributeObject
    implements Serializable
{

    protected OperationTemplateAmountInfo amountInfo;
    protected OperationTemplateTimeInfo timeInfo;
    protected OperationTemplateReminderInfo reminderInfo;
    protected List<ProfileNotificationSelection> operationsReportNotifications;

    /**
     * Gets the value of the amountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateAmountInfo }
     *     
     */
    public OperationTemplateAmountInfo getAmountInfo() {
        return amountInfo;
    }

    /**
     * Sets the value of the amountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateAmountInfo }
     *     
     */
    public void setAmountInfo(OperationTemplateAmountInfo value) {
        this.amountInfo = value;
    }

    /**
     * Gets the value of the timeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateTimeInfo }
     *     
     */
    public OperationTemplateTimeInfo getTimeInfo() {
        return timeInfo;
    }

    /**
     * Sets the value of the timeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateTimeInfo }
     *     
     */
    public void setTimeInfo(OperationTemplateTimeInfo value) {
        this.timeInfo = value;
    }

    /**
     * Gets the value of the reminderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTemplateReminderInfo }
     *     
     */
    public OperationTemplateReminderInfo getReminderInfo() {
        return reminderInfo;
    }

    /**
     * Sets the value of the reminderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTemplateReminderInfo }
     *     
     */
    public void setReminderInfo(OperationTemplateReminderInfo value) {
        this.reminderInfo = value;
    }

    /**
     * Gets the value of the operationsReportNotifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsReportNotifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsReportNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileNotificationSelection }
     * 
     * 
     */
    public List<ProfileNotificationSelection> getOperationsReportNotifications() {
        if (operationsReportNotifications == null) {
            operationsReportNotifications = new ArrayList<ProfileNotificationSelection>();
        }
        return this.operationsReportNotifications;
    }

}
