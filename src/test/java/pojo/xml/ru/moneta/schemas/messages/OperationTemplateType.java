
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTemplateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMON"/&gt;
 *     &lt;enumeration value="REGULAR"/&gt;
 *     &lt;enumeration value="DIRECT_DEBIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationTemplateType")
@XmlEnum
public enum OperationTemplateType {

    COMMON,
    REGULAR,
    DIRECT_DEBIT;

    public String value() {
        return name();
    }

    public static OperationTemplateType fromValue(String v) {
        return valueOf(v);
    }

}
