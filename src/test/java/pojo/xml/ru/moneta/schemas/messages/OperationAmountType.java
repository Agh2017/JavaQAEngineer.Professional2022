
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationAmountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCOME"/&gt;
 *     &lt;enumeration value="EXPENSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationAmountType")
@XmlEnum
public enum OperationAmountType {


    /**
     * Income
     * 
     */
    INCOME,

    /**
     * Expense
     * 
     */
    EXPENSE;

    public String value() {
        return name();
    }

    public static OperationAmountType fromValue(String v) {
        return valueOf(v);
    }

}
