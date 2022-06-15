
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="organization"/&gt;
 *     &lt;enumeration value="client"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProfileType")
@XmlEnum
public enum ProfileType {


    /**
     * 
     *                         Organization profile. Profiles of this type contain such organization-specific elements as the name of the director and accountant, legal address, etc.
     *                     
     * 
     */
    @XmlEnumValue("organization")
    ORGANIZATION("organization"),

    /**
     * 
     *                         Client profile. Profiles of this type contain such user-specific elements as first name, last name, etc.
     *                     
     * 
     */
    @XmlEnumValue("client")
    CLIENT("client");
    private final String value;

    ProfileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileType fromValue(String v) {
        for (ProfileType c: ProfileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
