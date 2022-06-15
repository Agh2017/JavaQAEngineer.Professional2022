
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsyncStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPROGRESS"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsyncStatus")
@XmlEnum
public enum AsyncStatus {


    /**
     * MONETA.RU is processing the asynchronous task.
     * 
     */
    INPROGRESS,

    /**
     * Asynchronous task is registered in MONETA.RU.
     * 
     */
    CREATED;

    public String value() {
        return name();
    }

    public static AsyncStatus fromValue(String v) {
        return valueOf(v);
    }

}
