
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTypeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTypeCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPOSIT"/&gt;
 *     &lt;enumeration value="WITHDRAWAL"/&gt;
 *     &lt;enumeration value="TRANSFER"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationTypeCategory")
@XmlEnum
public enum OperationTypeCategory {


    /**
     * Operations that deposit funds to your MONETA.RU account.
     * 
     */
    DEPOSIT,

    /**
     * Operations that withdraw funds from your MONETA.RU account to an external payment system.
     * 
     */
    WITHDRAWAL,

    /**
     * Operations that transfer funds from your MONETA.RU account to another MONETA.RU account that belongs to you or to a different user. This operation type also includes currency exchange operations.
     * 
     */
    TRANSFER,

    /**
     * Merchant operations that include payments to a store, refunds, all MONETA.Assistant operations.
     * 
     */
    BUSINESS;

    public String value() {
        return name();
    }

    public static OperationTypeCategory fromValue(String v) {
        return valueOf(v);
    }

}
