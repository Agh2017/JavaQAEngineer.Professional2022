
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationStatusState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationStatusState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBITED"/&gt;
 *     &lt;enumeration value="CREDITED"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="FROZEN"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationStatusState")
@XmlEnum
public enum OperationStatusState {


    /**
     * The funds were debited from the payer's account.
     * 
     */
    DEBITED,

    /**
     * The funds were credited to the payee's account
     * 
     */
    CREDITED,

    /**
     * The transaction is completed.
     * 
     */
    COMPLETED,

    /**
     * The transaction is frozen.
     * 
     */
    FROZEN,

    /**
     * The transaction is cancelled.
     * 
     */
    CANCELED;

    public String value() {
        return name();
    }

    public static OperationStatusState fromValue(String v) {
        return valueOf(v);
    }

}
