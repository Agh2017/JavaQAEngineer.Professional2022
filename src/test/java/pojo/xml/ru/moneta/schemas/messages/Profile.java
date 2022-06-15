
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;User profile information.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information about a user profile contains a list of key-value pairs.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;MONETA.RU returns only information about a user profile that you own or publicly available information.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Valid keys for client profiles are:&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;&lt;b&gt;unitid&lt;/b&gt;. The unique identifier of a MONETA.RU user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;last_name&lt;/b&gt;. The last name of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;first_name&lt;/b&gt;. The first name of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;middle_initial_name&lt;/b&gt;. The middle name of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;alias&lt;/b&gt;. User alias.&lt;/li&gt;&lt;li&gt;&lt;b&gt;country&lt;/b&gt;. Country of residence.&lt;/li&gt;&lt;li&gt;&lt;b&gt;state&lt;/b&gt;. State.&lt;/li&gt;&lt;li&gt;&lt;b&gt;city&lt;/b&gt;. City.&lt;/li&gt;&lt;li&gt;&lt;b&gt;zip&lt;/b&gt;. ZIP code.&lt;/li&gt;&lt;li&gt;&lt;b&gt;address&lt;/b&gt;. Address of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;email_for_notifications&lt;/b&gt;. Email address of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;phone&lt;/b&gt;. Phone number of the user.&lt;/li&gt;&lt;li&gt;&lt;b&gt;cell_phone&lt;/b&gt;. Mobile phone number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;url&lt;/b&gt;. URL of the user's web site.&lt;/li&gt;&lt;li&gt;&lt;b&gt;sex&lt;/b&gt;. Sex of the user. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;MALE&lt;/li&gt;&lt;li&gt;FEMALE&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;date_of_birth&lt;/b&gt;. Date of birth of the user in the following format: &lt;codeph&gt;yyyy-mm-dd&lt;/codeph&gt;.&lt;/li&gt;&lt;li&gt;&lt;b&gt;inn&lt;/b&gt;. Tax identification number (TIN).&lt;/li&gt;&lt;li&gt;&lt;b&gt;snils&lt;/b&gt;. Personal insurance policy number (SNILS).&lt;/li&gt;&lt;li&gt;&lt;b&gt;timezone&lt;/b&gt;. The time zone of the user.&#13;
 *                         &lt;note&gt;For the list of time zone names (TZ names) that MONETA.ru supports, see &lt;a href="http://en.wikipedia.org/wiki/List_of_zoneinfo_timezones" target="_blank"&gt;wikipedia.org&lt;/a&gt;.&lt;/note&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ui_language&lt;/b&gt;. Valid values are:&#13;
 *                         &lt;ul&gt;&lt;li&gt;EN&lt;/li&gt;&lt;li&gt;RU&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;customfield:&lt;i&gt;field_name&lt;/i&gt;&lt;/b&gt;. Custom attribute. The &lt;i&gt;field_name&lt;/i&gt; part of the custom key might include up to 32 characters.&#13;
 *                         User profiles may contain multiple custom attributes.&#13;
 *                     &lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mandatory keys for client profile creation are &lt;b&gt;last_name&lt;/b&gt; and &lt;b&gt;first_name&lt;/b&gt; or &lt;b&gt;alias&lt;/b&gt;.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Valid keys for organization profiles:&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;unitid&lt;/b&gt;. The unique identifier of an organization in MONETA.RU.&lt;/li&gt;&lt;li&gt;&lt;b&gt;rf_resident&lt;/b&gt;. Partner type [resident/not resident].&lt;/li&gt;&lt;li&gt;&lt;b&gt;goal_and_business_relationships&lt;/b&gt;. Purpose and suggested character of establishing business relations with NCO.&lt;/li&gt;&lt;li&gt;&lt;b&gt;planned_turnovers&lt;/b&gt;. Planned monthly cash flow.&lt;/li&gt;&lt;li&gt;&lt;b&gt;planned_payers&lt;/b&gt;. planned payers.&lt;/li&gt;&lt;li&gt;&lt;b&gt;tariff&lt;/b&gt;. Tariff, used in partner registration, only for oferta partners [PAY_MYSELF, ZKH].&lt;/li&gt;&lt;li&gt;&lt;b&gt;incorporation_form_ru&lt;/b&gt;. Entity kind [organization or private entrepreneur], explicitly specified when registering a non-resident partner, for a resident, it is established by INN.&lt;/li&gt;&lt;li&gt;&lt;b&gt;international_name&lt;/b&gt;. Merchant name in the native language.&lt;/li&gt;&lt;li&gt;&lt;b&gt;alias&lt;/b&gt;. Partner alias.&lt;/li&gt;&lt;li&gt;&lt;b&gt;organization_name&lt;/b&gt;. Merchant full name or private entrepreneur full name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;organization_name_short&lt;/b&gt;. Merchant contracted name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;position_director&lt;/b&gt;. Managing director title (for organization) [DIRECTOR, GENERAL_DIRECTOR, EXECUTIVE_DIRECTOR, OTHER].&lt;/li&gt;&lt;li&gt;&lt;b&gt;position_director_details&lt;/b&gt;. Details for managing director title (for organization), only for OTHER.&lt;/li&gt;&lt;li&gt;&lt;b&gt;acting_document&lt;/b&gt;. Document on basis of which Managing director acts (for organization)[POWER_OF_ATTORNEY, ARTICLES_OF_ASSOCIATION, OTHER].&lt;/li&gt;&lt;li&gt;&lt;b&gt;acting_document_details&lt;/b&gt;. Details for document on basis of which Managing director acts (for organization), only for OTHER.&lt;/li&gt;&lt;li&gt;&lt;b&gt;attorney_number_ru&lt;/b&gt;. Number (attorney, for organization), only for POWER_OF_ATTORNEY.&lt;/li&gt;&lt;li&gt;&lt;b&gt;attorney_date_from_ru&lt;/b&gt;. Date (from) (attorney, for organization), only for POWER_OF_ATTORNEY.&lt;/li&gt;&lt;li&gt;&lt;b&gt;attorney_date_to_ru&lt;/b&gt;. Date (validity period - till) (attorney, for organization), only for POWER_OF_ATTORNEY.&lt;/li&gt;&lt;li&gt;&lt;b&gt;agreement_signer_fio&lt;/b&gt;. Signatory's full name (for organization).&lt;/li&gt;&lt;li&gt;&lt;b&gt;registration_date_ru&lt;/b&gt;. Date (certificate).&lt;/li&gt;&lt;li&gt;&lt;b&gt;registration_series_ru&lt;/b&gt;. Series (certificate).&lt;/li&gt;&lt;li&gt;&lt;b&gt;registration_number_ru&lt;/b&gt;. Number (certificate).&lt;/li&gt;&lt;li&gt;&lt;b&gt;registration_authority_ru&lt;/b&gt;. Registering authority name (certificate).&lt;/li&gt;&lt;li&gt;&lt;b&gt;registration_state_place_ru&lt;/b&gt;. State registration place (certificate).&lt;/li&gt;&lt;li&gt;&lt;b&gt;agreement_signer_fio_ie&lt;/b&gt;. Signator's full name (for private entrepreneur).&lt;/li&gt;&lt;li&gt;&lt;b&gt;fio_accountant&lt;/b&gt;. Financial support contact full name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;position_accountant&lt;/b&gt;. Financial support contact title.&lt;/li&gt;&lt;li&gt;&lt;b&gt;fio_contact&lt;/b&gt;. Technical support contact full name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;position_contact&lt;/b&gt;. Technical support contact title.&lt;/li&gt;&lt;li&gt;&lt;b&gt;joint_governing_body&lt;/b&gt;. Joint governing body (executive body).&lt;/li&gt;&lt;li&gt;&lt;b&gt;joint_body_members&lt;/b&gt;. Full name and title of collective body members, only if there is a value of joint_governing_body.&lt;/li&gt;&lt;li&gt;&lt;b&gt;business_activity&lt;/b&gt;. Business activity for "Other" category.&lt;/li&gt;&lt;li&gt;&lt;b&gt;url&lt;/b&gt;. Website (URL), used in partner registration.&lt;/li&gt;&lt;li&gt;&lt;b&gt;where_from_do_you_know&lt;/b&gt;. How you learnt about us.&lt;/li&gt;&lt;li&gt;&lt;b&gt;where_from_do_you_know_details&lt;/b&gt;. Details for how you learnt about us.&lt;/li&gt;&lt;li&gt;&lt;b&gt;promocode&lt;/b&gt;. Promo code.&lt;/li&gt;&lt;li&gt;&lt;b&gt;inn&lt;/b&gt;. Tax identification number (TIN).&lt;/li&gt;&lt;li&gt;&lt;b&gt;fio_director&lt;/b&gt;. Managing director full name.&lt;/li&gt;&lt;li&gt;&lt;b&gt;phone_director&lt;/b&gt;. Managing director office phone.&lt;/li&gt;&lt;li&gt;&lt;b&gt;country&lt;/b&gt;Country. Use isocode [RUS], isocode2L [RU] or name[Russia]&lt;/li&gt;&lt;li&gt;&lt;b&gt;legal_address&lt;/b&gt;. Legal address.&lt;/li&gt;&lt;li&gt;&lt;b&gt;management_address&lt;/b&gt;. Address of the permanent management body.&lt;/li&gt;&lt;li&gt;&lt;b&gt;post_address&lt;/b&gt;. Postal address.&lt;/li&gt;&lt;li&gt;&lt;b&gt;phone_contact&lt;/b&gt;. Contact phone number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;phone_accountant&lt;/b&gt;. Financial support phone number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;phone_support&lt;/b&gt;. Technical support phone number.&lt;/li&gt;&lt;li&gt;&lt;b&gt;fax&lt;/b&gt;. Fax.&lt;/li&gt;&lt;li&gt;&lt;b&gt;cell_phone&lt;/b&gt;. Cell phone.&lt;/li&gt;&lt;li&gt;&lt;b&gt;contact_email&lt;/b&gt;. Contact E-mail address, used in partner registration.&lt;/li&gt;&lt;li&gt;&lt;b&gt;finance_email&lt;/b&gt;. Financial support E-mail address.&lt;/li&gt;&lt;li&gt;&lt;b&gt;technical_email&lt;/b&gt;. Technical support E-mail address.&lt;/li&gt;&lt;li&gt;&lt;b&gt;contact_info&lt;/b&gt;. Contact info.&lt;/li&gt;&lt;li&gt;&lt;b&gt;timezone&lt;/b&gt;. Time zone of the organization.&#13;
 *                             &lt;note&gt;For the list of time zone names (TZ names) that MONETA.ru supports, see &lt;a href="http://en.wikipedia.org/wiki/List_of_zoneinfo_timezones" target="_blank"&gt;wikipedia.org&lt;/a&gt;.&lt;/note&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ui_language&lt;/b&gt;. User interface langugage. Valid values are:&#13;
 *                             &lt;ul&gt;&lt;li&gt;EN&lt;/li&gt;&lt;li&gt;RU&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;email_for_notifications&lt;/b&gt;. Email address of the organization that is used for notifications.&lt;/li&gt;&lt;li&gt;&lt;b&gt;capital_type&lt;/b&gt;. Capital type.&lt;/li&gt;&lt;li&gt;&lt;b&gt;registered_capital_size&lt;/b&gt;. Register capital ammount.&lt;/li&gt;&lt;li&gt;&lt;b&gt;paid_capital_size&lt;/b&gt;. Paid-in capital ammount.&lt;/li&gt;&lt;li&gt;&lt;b&gt;budget_arrears_absence&lt;/b&gt;. Information on taxes and dues tax liabilities.&lt;/li&gt;&lt;li&gt;&lt;b&gt;founder_share_percentage&lt;/b&gt;. Founder share in percentage. Value from 0 to 100. If percentage is more then 0, then numerator and denominator of fraction should be equal 0.&lt;/li&gt;&lt;li&gt;&lt;b&gt;founder_share_numerator&lt;/b&gt;. Fraction numerator for founder share. Value from 0. If numerator is more then 0, then denominator of fraction should be more then 0 and percentage should be equal 0.&lt;/li&gt;&lt;li&gt;&lt;b&gt;founder_share_denominator&lt;/b&gt;. Fraction denominator for founder share. Value from 0. If denominator is more then 0, then numerator of fraction should be more then 0 and percentage should be equal 0.&lt;/li&gt;&lt;li&gt;&lt;b&gt;conditions_payee&lt;/b&gt;. State for "There is information on beneficiary of payment available for unauthorized payers on the website".&lt;/li&gt;&lt;li&gt;&lt;b&gt;conditions_payer&lt;/b&gt;. State for "There's contact information available for unauthorized payers on the website".&lt;/li&gt;&lt;li&gt;&lt;b&gt;conditions_site&lt;/b&gt;. State for "Website is fully functional and filled in with content".&lt;/li&gt;&lt;li&gt;&lt;b&gt;conditions_payment_info&lt;/b&gt;. State for "Payment order and process description, as well as information on temporary interval between payment and dispatch (delivery) of wares or provision of service are available for unauthorized users.".&lt;/li&gt;&lt;li&gt;&lt;b&gt;conditions_correct_data&lt;/b&gt;. State for "All essential data are inserted and are supposed to be up-to-date".&lt;/li&gt;&lt;li&gt;&lt;b&gt;agreement_sent_date&lt;/b&gt;. Date of sending the document.&lt;/li&gt;&lt;li&gt;&lt;b&gt;agreement_sent_method&lt;/b&gt;. Method of dispatch the document.&lt;/li&gt;&lt;li&gt;&lt;b&gt;customfield:&lt;i&gt;field_name&lt;/i&gt;&lt;/b&gt;. Custom attribute. The &lt;i&gt;field_name&lt;/i&gt; part of the custom key might include up to 32 characters. Organization profiles may contain multiple custom attributes.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attribute" type="{http://www.moneta.ru/schemas/messages.xsd}KeyValueApprovedAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "attribute"
})
@XmlSeeAlso({
    GetProfileInfoResponse.class
})
public class Profile
    implements Serializable
{

    protected List<KeyValueApprovedAttribute> attribute;

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
     * {@link KeyValueApprovedAttribute }
     * 
     * 
     */
    public List<KeyValueApprovedAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<KeyValueApprovedAttribute>();
        }
        return this.attribute;
    }

}
