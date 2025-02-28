//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package net.opengis.gml._3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * A property that has a surface as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where
 * remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 *
 * <p>Java-Klasse für SurfacePropertyType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SurfacePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractSurface"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePropertyType", propOrder = {
    "abstractSurface"
})
public class SurfacePropertyType {

    @XmlElementRef(name = "AbstractSurface", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractSurfaceType> abstractSurface;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;

    /**
     * Ruft den Wert der abstractSurface-Eigenschaft ab.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >} {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     */
    public JAXBElement<? extends AbstractSurfaceType> getAbstractSurface() {
        return abstractSurface;
    }

    /**
     * Legt den Wert der abstractSurface-Eigenschaft fest.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >} {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     */
    public void setAbstractSurface(JAXBElement<? extends AbstractSurfaceType> value) {
        this.abstractSurface = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

    /**
     * Gets the value of the nilReason property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the nilReason property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public SurfacePropertyType withAbstractSurface(JAXBElement<? extends AbstractSurfaceType> value) {
        setAbstractSurface(value);
        return this;
    }

    public SurfacePropertyType withOwns(Boolean value) {
        setOwns(value);
        return this;
    }

    public SurfacePropertyType withNilReason(String... values) {
        if (values != null) {
            for (String value : values) {
                getNilReason().add(value);
            }
        }
        return this;
    }

    public SurfacePropertyType withNilReason(Collection<String> values) {
        if (values != null) {
            getNilReason().addAll(values);
        }
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
