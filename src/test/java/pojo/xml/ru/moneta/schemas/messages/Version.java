
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Version.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Version"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VERSION_1"/&gt;
 *     &lt;enumeration value="VERSION_2"/&gt;
 *     &lt;enumeration value="VERSION_3"/&gt;
 *     &lt;enumeration value="VERSION_4"/&gt;
 *     &lt;enumeration value="VERSION_5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Version")
@XmlEnum
public enum Version {

    VERSION_1,
    VERSION_2,
    VERSION_3,
    VERSION_4,
    VERSION_5;

    public String value() {
        return name();
    }

    public static Version fromValue(String v) {
        return valueOf(v);
    }

}
