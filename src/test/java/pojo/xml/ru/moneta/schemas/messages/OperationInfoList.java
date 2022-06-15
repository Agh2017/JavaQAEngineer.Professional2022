
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:sch="http://www.moneta.ru/schemas/messages.xsd" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://www.moneta.ru/schemas/messages.xsd" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A list of transactions. Long transaction lists are split into multiple pages.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OperationInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pagesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="operation" type="{http://www.moneta.ru/schemas/messages.xsd}OperationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationInfoList", propOrder = {
    "pageSize",
    "pageNumber",
    "pagesCount",
    "size",
    "totalSize",
    "operation"
})
@XmlSeeAlso({
    FindLastOperationsListResponse.class,
    FindOperationsListResponse.class,
    FindOperationsListByCTIDResponse.class
})
public class OperationInfoList
    implements Serializable
{

    protected long pageSize;
    protected long pageNumber;
    protected long pagesCount;
    protected long size;
    protected long totalSize;
    protected List<OperationInfo> operation;

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
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationInfo }
     * 
     * 
     */
    public List<OperationInfo> getOperation() {
        if (operation == null) {
            operation = new ArrayList<OperationInfo>();
        }
        return this.operation;
    }

}
