
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTemplateTimeInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTemplateTimeInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONCE"/&gt;
 *     &lt;enumeration value="EVERY_DAY"/&gt;
 *     &lt;enumeration value="EVERY_WORKDAY"/&gt;
 *     &lt;enumeration value="EVERY_WEEK"/&gt;
 *     &lt;enumeration value="EVERY_MONTH"/&gt;
 *     &lt;enumeration value="EVERY_LAST_DAY_OF_MONTH"/&gt;
 *     &lt;enumeration value="EVERY_YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationTemplateTimeInfoType")
@XmlEnum
public enum OperationTemplateTimeInfoType {

    ONCE,
    EVERY_DAY,
    EVERY_WORKDAY,
    EVERY_WEEK,
    EVERY_MONTH,
    EVERY_LAST_DAY_OF_MONTH,
    EVERY_YEAR;

    public String value() {
        return name();
    }

    public static OperationTemplateTimeInfoType fromValue(String v) {
        return valueOf(v);
    }

}
