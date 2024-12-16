//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ImageContentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ImageContentEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="map"/&gt;
 *     &lt;enumeration value="graphic"/&gt;
 *     &lt;enumeration value="logo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageContentEnumeration")
@XmlEnum
public enum ImageContentEnumeration {

    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("graphic")
    GRAPHIC("graphic"),
    @XmlEnumValue("logo")
    LOGO("logo");
    private final String value;

    ImageContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageContentEnumeration fromValue(String v) {
        for (ImageContentEnumeration c: ImageContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
