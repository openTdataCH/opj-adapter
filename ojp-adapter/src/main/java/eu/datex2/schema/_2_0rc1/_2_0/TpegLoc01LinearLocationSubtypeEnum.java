//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TpegLoc01LinearLocationSubtypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TpegLoc01LinearLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="segment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01LinearLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01LinearLocationSubtypeEnum {

    @XmlEnumValue("segment")
    SEGMENT("segment");
    private final String value;

    TpegLoc01LinearLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01LinearLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01LinearLocationSubtypeEnum c: TpegLoc01LinearLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
