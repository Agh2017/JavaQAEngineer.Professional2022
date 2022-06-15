
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPaymentPasswordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountPaymentPasswordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STATIC"/&gt;
 *     &lt;enumeration value="SMS_SIMPLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountPaymentPasswordType")
@XmlEnum
public enum AccountPaymentPasswordType {


    /**
     * Static payment password.
     * 
     */
    STATIC,

    /**
     * SMS password.
     * 
     */
    SMS_SIMPLE;

    public String value() {
        return name();
    }

    public static AccountPaymentPasswordType fromValue(String v) {
        return valueOf(v);
    }

}
