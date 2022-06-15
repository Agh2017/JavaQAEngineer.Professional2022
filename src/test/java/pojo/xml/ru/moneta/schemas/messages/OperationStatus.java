
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPROGRESS"/&gt;
 *     &lt;enumeration value="SUCCEED"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="TAKENIN_NOTSENT"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="FROZEN"/&gt;
 *     &lt;enumeration value="TAKENOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationStatus")
@XmlEnum
public enum OperationStatus {


    /**
     * MONETA.RU is processing the transaction.
     * 
     */
    INPROGRESS,

    /**
     * Transaction processing completed successfully.
     * 
     */
    SUCCEED,

    /**
     * Transaction has been canceled.
     * 
     */
    CANCELED,

    /**
     * The funds are credited to the payee's account. MONETA.RU did not send the processed payment report or you did not return a plain text response to the report.
     * 
     */
    TAKENIN_NOTSENT,

    /**
     * Transaction is registered in MONETA.RU.
     * 
     */
    CREATED,

    /**
     * Transaction is frozen.
     * 
     */
    FROZEN,

    /**
     * Debited.
     * 
     */
    TAKENOUT;

    public String value() {
        return name();
    }

    public static OperationStatus fromValue(String v) {
        return valueOf(v);
    }

}
