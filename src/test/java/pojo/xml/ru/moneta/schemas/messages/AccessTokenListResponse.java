
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessToken" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessToken"
})
@XmlRootElement(name = "AccessTokenListResponse")
public class AccessTokenListResponse
    extends AbstractAttributeObject
    implements Serializable
{

    protected List<AccessTokenListResponse.AccessToken> accessToken;

    /**
     * Gets the value of the accessToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessTokenListResponse.AccessToken }
     * 
     * 
     */
    public List<AccessTokenListResponse.AccessToken> getAccessToken() {
        if (accessToken == null) {
            accessToken = new ArrayList<AccessTokenListResponse.AccessToken>();
        }
        return this.accessToken;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}AbstractAttributeObject"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "token",
        "subscriberId",
        "created",
        "scope"
    })
    public static class AccessToken
        extends AbstractAttributeObject
        implements Serializable
    {

        @XmlElement(required = true)
        protected String token;
        @XmlElement(required = true)
        protected String subscriberId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar created;
        @XmlElement(required = true)
        protected List<String> scope;

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

        /**
         * Gets the value of the subscriberId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberId() {
            return subscriberId;
        }

        /**
         * Sets the value of the subscriberId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberId(String value) {
            this.subscriberId = value;
        }

        /**
         * Gets the value of the created property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreated() {
            return created;
        }

        /**
         * Sets the value of the created property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreated(XMLGregorianCalendar value) {
            this.created = value;
        }

        /**
         * Gets the value of the scope property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scope property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScope().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getScope() {
            if (scope == null) {
                scope = new ArrayList<String>();
            }
            return this.scope;
        }

    }

}
