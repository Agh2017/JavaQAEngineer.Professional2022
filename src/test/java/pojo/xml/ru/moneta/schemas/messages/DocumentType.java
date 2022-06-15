
package ru.moneta.schemas.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PASSPORT"/&gt;
 *     &lt;enumeration value="DRIVING_LICENCE"/&gt;
 *     &lt;enumeration value="MILITARY_ID"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PARTNER_LICENCE"/&gt;
 *     &lt;enumeration value="IDENTITY_DOCUMENT"/&gt;
 *     &lt;enumeration value="ADMINISTRATIVE"/&gt;
 *     &lt;enumeration value="CUSTOM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {


    /**
     * Civil passport.
     * 
     */
    PASSPORT,

    /**
     * Driver's licence.
     * 
     */
    DRIVING_LICENCE,

    /**
     * Military ID.
     * 
     */
    MILITARY_ID,

    /**
     * Other document.
     * 
     */
    OTHER,

    /**
     * Licence for partner activity.
     * 
     */
    PARTNER_LICENCE,

    /**
     * PASSPORT for non resident partner.
     * 
     */
    IDENTITY_DOCUMENT,

    /**
     * Document available only for administrator.
     * 
     */
    ADMINISTRATIVE,
    CUSTOM;

    public String value() {
        return name();
    }

    public static DocumentType fromValue(String v) {
        return valueOf(v);
    }

}
