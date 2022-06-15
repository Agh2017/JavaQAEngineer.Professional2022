
package ru.moneta.schemas.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pagesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="profile" type="{http://www.moneta.ru/schemas/messages.xsd}Profile" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pageSize",
    "pageNumber",
    "pagesCount",
    "size",
    "totalSize",
    "profile"
})
@XmlRootElement(name = "FindProfileInfoResponse")
public class FindProfileInfoResponse
    implements Serializable
{

    protected long pageSize;
    protected long pageNumber;
    protected long pagesCount;
    protected long size;
    protected long totalSize;
    protected List<Profile> profile;

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pagesCount property.
     * 
     */
    public long getPagesCount() {
        return pagesCount;
    }

    /**
     * Sets the value of the pagesCount property.
     * 
     */
    public void setPagesCount(long value) {
        this.pagesCount = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the totalSize property.
     * 
     */
    public long getTotalSize() {
        return totalSize;
    }

    /**
     * Sets the value of the totalSize property.
     * 
     */
    public void setTotalSize(long value) {
        this.totalSize = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profile }
     * 
     * 
     */
    public List<Profile> getProfile() {
        if (profile == null) {
            profile = new ArrayList<Profile>();
        }
        return this.profile;
    }

}
