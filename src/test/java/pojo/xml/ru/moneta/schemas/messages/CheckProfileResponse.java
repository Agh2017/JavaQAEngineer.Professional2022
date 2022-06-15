
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
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="requestInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;choice&gt;
 *                       &lt;element name="profile" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="profileType" type="{http://www.moneta.ru/schemas/messages.xsd}ProfileType" minOccurs="0"/&gt;
 *                                 &lt;element name="profile" type="{http://www.moneta.ru/schemas/messages.xsd}Profile" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="document" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}DocumentType" minOccurs="0"/&gt;
 *                                 &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="bank" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                 &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="juridical" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/choice&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="foundersTotalShare" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="daysBeforePartnerLock" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "status",
    "requestInfo",
    "foundersTotalShare",
    "daysBeforePartnerLock"
})
@XmlRootElement(name = "CheckProfileResponse")
public class CheckProfileResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected String status;
    protected List<CheckProfileResponse.RequestInfo> requestInfo;
    protected Float foundersTotalShare;
    protected Long daysBeforePartnerLock;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckProfileResponse.RequestInfo }
     * 
     * 
     */
    public List<CheckProfileResponse.RequestInfo> getRequestInfo() {
        if (requestInfo == null) {
            requestInfo = new ArrayList<CheckProfileResponse.RequestInfo>();
        }
        return this.requestInfo;
    }

    /**
     * Gets the value of the foundersTotalShare property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFoundersTotalShare() {
        return foundersTotalShare;
    }

    /**
     * Sets the value of the foundersTotalShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFoundersTotalShare(Float value) {
        this.foundersTotalShare = value;
    }

    /**
     * Gets the value of the daysBeforePartnerLock property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysBeforePartnerLock() {
        return daysBeforePartnerLock;
    }

    /**
     * Sets the value of the daysBeforePartnerLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysBeforePartnerLock(Long value) {
        this.daysBeforePartnerLock = value;
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
     *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="profile" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="profileType" type="{http://www.moneta.ru/schemas/messages.xsd}ProfileType" minOccurs="0"/&gt;
     *                     &lt;element name="profile" type="{http://www.moneta.ru/schemas/messages.xsd}Profile" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="document" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}DocumentType" minOccurs="0"/&gt;
     *                     &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="bank" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="juridical" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
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
        "action",
        "scope",
        "method",
        "profile",
        "document",
        "bank",
        "juridical"
    })
    public static class RequestInfo
        implements Serializable
    {

        protected String action;
        protected String scope;
        protected String method;
        protected CheckProfileResponse.RequestInfo.Profile profile;
        protected CheckProfileResponse.RequestInfo.Document document;
        protected CheckProfileResponse.RequestInfo.Bank bank;
        protected CheckProfileResponse.RequestInfo.Juridical juridical;

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the value of the scope property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScope() {
            return scope;
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScope(String value) {
            this.scope = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the profile property.
         * 
         * @return
         *     possible object is
         *     {@link CheckProfileResponse.RequestInfo.Profile }
         *     
         */
        public CheckProfileResponse.RequestInfo.Profile getProfile() {
            return profile;
        }

        /**
         * Sets the value of the profile property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckProfileResponse.RequestInfo.Profile }
         *     
         */
        public void setProfile(CheckProfileResponse.RequestInfo.Profile value) {
            this.profile = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link CheckProfileResponse.RequestInfo.Document }
         *     
         */
        public CheckProfileResponse.RequestInfo.Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckProfileResponse.RequestInfo.Document }
         *     
         */
        public void setDocument(CheckProfileResponse.RequestInfo.Document value) {
            this.document = value;
        }

        /**
         * Gets the value of the bank property.
         * 
         * @return
         *     possible object is
         *     {@link CheckProfileResponse.RequestInfo.Bank }
         *     
         */
        public CheckProfileResponse.RequestInfo.Bank getBank() {
            return bank;
        }

        /**
         * Sets the value of the bank property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckProfileResponse.RequestInfo.Bank }
         *     
         */
        public void setBank(CheckProfileResponse.RequestInfo.Bank value) {
            this.bank = value;
        }

        /**
         * Gets the value of the juridical property.
         * 
         * @return
         *     possible object is
         *     {@link CheckProfileResponse.RequestInfo.Juridical }
         *     
         */
        public CheckProfileResponse.RequestInfo.Juridical getJuridical() {
            return juridical;
        }

        /**
         * Sets the value of the juridical property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckProfileResponse.RequestInfo.Juridical }
         *     
         */
        public void setJuridical(CheckProfileResponse.RequestInfo.Juridical value) {
            this.juridical = value;
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "id",
            "attribute"
        })
        public static class Bank
            implements Serializable
        {

            protected Long unitId;
            protected Long id;
            protected List<KeyValueAttribute> attribute;

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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setId(Long value) {
                this.id = value;
            }

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KeyValueAttribute }
             * 
             * 
             */
            public List<KeyValueAttribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<KeyValueAttribute>();
                }
                return this.attribute;
            }

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
         *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="type" type="{http://www.moneta.ru/schemas/messages.xsd}DocumentType" minOccurs="0"/&gt;
         *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "profileId",
            "id",
            "type",
            "attribute"
        })
        public static class Document
            implements Serializable
        {

            protected Long unitId;
            protected Long profileId;
            protected Long id;
            @XmlSchemaType(name = "string")
            protected DocumentType type;
            protected List<KeyValueAttribute> attribute;

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

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setId(Long value) {
                this.id = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentType }
             *     
             */
            public DocumentType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentType }
             *     
             */
            public void setType(DocumentType value) {
                this.type = value;
            }

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KeyValueAttribute }
             * 
             * 
             */
            public List<KeyValueAttribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<KeyValueAttribute>();
                }
                return this.attribute;
            }

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
         *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "attribute"
        })
        public static class Juridical
            implements Serializable
        {

            protected List<KeyValueAttribute> attribute;

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KeyValueAttribute }
             * 
             * 
             */
            public List<KeyValueAttribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<KeyValueAttribute>();
                }
                return this.attribute;
            }

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
         *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="profileType" type="{http://www.moneta.ru/schemas/messages.xsd}ProfileType" minOccurs="0"/&gt;
         *         &lt;element name="profile" type="{http://www.moneta.ru/schemas/messages.xsd}Profile" minOccurs="0"/&gt;
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
            "profileId",
            "profileType",
            "profile"
        })
        public static class Profile
            implements Serializable
        {

            protected Long unitId;
            protected Long profileId;
            @XmlSchemaType(name = "string")
            protected ProfileType profileType;
            protected ru.moneta.schemas.messages.Profile profile;

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

            /**
             * Gets the value of the profileType property.
             * 
             * @return
             *     possible object is
             *     {@link ProfileType }
             *     
             */
            public ProfileType getProfileType() {
                return profileType;
            }

            /**
             * Sets the value of the profileType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProfileType }
             *     
             */
            public void setProfileType(ProfileType value) {
                this.profileType = value;
            }

            /**
             * Gets the value of the profile property.
             * 
             * @return
             *     possible object is
             *     {@link ru.moneta.schemas.messages.Profile }
             *     
             */
            public ru.moneta.schemas.messages.Profile getProfile() {
                return profile;
            }

            /**
             * Sets the value of the profile property.
             * 
             * @param value
             *     allowed object is
             *     {@link ru.moneta.schemas.messages.Profile }
             *     
             */
            public void setProfile(ru.moneta.schemas.messages.Profile value) {
                this.profile = value;
            }

        }

    }

}
