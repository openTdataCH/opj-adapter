//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for a range of date times. Start time must be specified, end time is optional.
 * 
 * <p>Java-Klasse für HalfOpenTimestampInputRangeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HalfOpenTimestampInputRangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTimePrecision" type="{http://www.siri.org.uk/siri}EndTimePrecisionEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfOpenTimestampInputRangeStructure", propOrder = {
    "startTime",
    "endTime",
    "endTimePrecision"
})
public class HalfOpenTimestampInputRangeStructure {

    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;
    @XmlElement(name = "EndTimePrecision", defaultValue = "second")
    @XmlSchemaType(name = "string")
    protected EndTimePrecisionEnumeration endTimePrecision;

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(ZonedDateTime value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(ZonedDateTime value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der endTimePrecision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public EndTimePrecisionEnumeration getEndTimePrecision() {
        return endTimePrecision;
    }

    /**
     * Legt den Wert der endTimePrecision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public void setEndTimePrecision(EndTimePrecisionEnumeration value) {
        this.endTimePrecision = value;
    }

    public HalfOpenTimestampInputRangeStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    public HalfOpenTimestampInputRangeStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
        return this;
    }

    public HalfOpenTimestampInputRangeStructure withEndTimePrecision(EndTimePrecisionEnumeration value) {
        setEndTimePrecision(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
