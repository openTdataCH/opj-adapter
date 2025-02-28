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
 * <p>Java-Klasse für InjuryStatusTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dead"/&gt;
 *     &lt;enumeration value="injured"/&gt;
 *     &lt;enumeration value="seriouslyInjured"/&gt;
 *     &lt;enumeration value="slightlyInjured"/&gt;
 *     &lt;enumeration value="uninjured"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "InjuryStatusTypeEnum")
@XmlEnum
public enum InjuryStatusTypeEnum {

    @XmlEnumValue("dead")
    DEAD("dead"),
    @XmlEnumValue("injured")
    INJURED("injured"),
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),
    @XmlEnumValue("slightlyInjured")
    SLIGHTLY_INJURED("slightlyInjured"),
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InjuryStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum fromValue(String v) {
        for (InjuryStatusTypeEnum c : InjuryStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
