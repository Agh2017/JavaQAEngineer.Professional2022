
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.moneta.ru/schemas/messages.xsd}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pager" type="{http://www.moneta.ru/schemas/messages.xsd}Pager" minOccurs="0"/&gt;
 *         &lt;element name="filter"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="accountBalanceFrom" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="accountBalanceTo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
 *                   &lt;element name="accountCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
 *                   &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
    "pager",
    "filter"
})
@XmlRootElement(name = "FindProfileInfoRequest")
public class FindProfileInfoRequest
    extends Entity
    implements Serializable
{

    protected Pager pager;
    @XmlElement(required = true)
    protected FindProfileInfoRequest.Filter filter;

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link Pager }
     *     
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pager }
     *     
     */
    public void setPager(Pager value) {
        this.pager = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FindProfileInfoRequest.Filter }
     *     
     */
    public FindProfileInfoRequest.Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindProfileInfoRequest.Filter }
     *     
     */
    public void setFilter(FindProfileInfoRequest.Filter value) {
        this.filter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="accountBalanceFrom" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="accountBalanceTo" type="{http://www.moneta.ru/schemas/messages.xsd}Money" minOccurs="0"/&gt;
     *         &lt;element name="accountCurrencyCode" type="{http://www.moneta.ru/schemas/messages.xsd}Currency" minOccurs="0"/&gt;
     *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitId",
        "name",
        "email",
        "phone",
        "login",
        "accountBalanceFrom",
        "accountBalanceTo",
        "accountCurrencyCode",
        "profileId"
    })
    public static class Filter
        implements Serializable
    {

        protected Long unitId;
        protected String name;
        protected String email;
        protected String phone;
        protected String login;
        protected BigDecimal accountBalanceFrom;
        protected BigDecimal accountBalanceTo;
        @XmlSchemaType(name = "string")
        protected Currency accountCurrencyCode;
        protected Long profileId;

        /**
         * Gets the value of the unitId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getUnitId() {
            return unitId;
        }

        /**
         * Sets the value of the unitId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setUnitId(Long value) {
            this.unitId = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the login property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogin() {
            return login;
        }

        /**
         * Sets the value of the login property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogin(String value) {
            this.login = value;
        }

        /**
         * Gets the value of the accountBalanceFrom property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccountBalanceFrom() {
            return accountBalanceFrom;
        }

        /**
         * Sets the value of the accountBalanceFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAccountBalanceFrom(BigDecimal value) {
            this.accountBalanceFrom = value;
        }

        /**
         * Gets the value of the accountBalanceTo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccountBalanceTo() {
            return accountBalanceTo;
        }

        /**
         * Sets the value of the accountBalanceTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAccountBalanceTo(BigDecimal value) {
            this.accountBalanceTo = value;
        }

        /**
         * Gets the value of the accountCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getAccountCurrencyCode() {
            return accountCurrencyCode;
        }

        /**
         * Sets the value of the accountCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setAccountCurrencyCode(Currency value) {
            this.accountCurrencyCode = value;
        }

        /**
         * Gets the value of the profileId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProfileId() {
            return profileId;
        }

        /**
         * Sets the value of the profileId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProfileId(Long value) {
            this.profileId = value;
        }

    }

}
