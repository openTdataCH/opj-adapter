//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.AccessModesEnumeration;


/**
 * Type for Annotated reference to a NETWORK affected by a SITUATION.
 * 
 * <p>Java-Klasse für NetworkStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="NetworkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkStructure", propOrder = {
    "networkRef",
    "networkName",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "telecabinSubmode",
    "accessMode"
})
public class NetworkStructure {

    @XmlElement(name = "NetworkRef")
    protected OperatorRefStructure networkRef;
    @XmlElement(name = "NetworkName")
    protected List<NaturalLanguageStringStructure> networkName;
    @XmlElement(name = "VehicleMode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "TelecabinSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodesOfTransportEnumeration telecabinSubmode;
    @XmlElement(name = "AccessMode")
    @XmlSchemaType(name = "string")
    protected AccessModesEnumeration accessMode;

    /**
     * Ruft den Wert der networkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Legt den Wert der networkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setNetworkRef(OperatorRefStructure value) {
        this.networkRef = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the networkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getNetworkName() {
        if (networkName == null) {
            networkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.networkName;
    }

    /**
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Ruft den Wert der airSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Legt den Wert der airSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Ruft den Wert der busSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Legt den Wert der busSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Ruft den Wert der coachSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Legt den Wert der coachSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Ruft den Wert der metroSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Legt den Wert der metroSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Ruft den Wert der railSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Legt den Wert der railSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Ruft den Wert der tramSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Legt den Wert der tramSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Ruft den Wert der waterSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Legt den Wert der waterSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Ruft den Wert der telecabinSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public TelecabinSubmodesOfTransportEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Legt den Wert der telecabinSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public void setTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Ruft den Wert der accessMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Legt den Wert der accessMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public void setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
    }

    public NetworkStructure withNetworkRef(OperatorRefStructure value) {
        setNetworkRef(value);
        return this;
    }

    public NetworkStructure withNetworkName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getNetworkName().add(value);
            }
        }
        return this;
    }

    public NetworkStructure withNetworkName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getNetworkName().addAll(values);
        }
        return this;
    }

    public NetworkStructure withVehicleMode(VehicleModesOfTransportEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    public NetworkStructure withAirSubmode(AirSubmodesOfTransportEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    public NetworkStructure withBusSubmode(BusSubmodesOfTransportEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    public NetworkStructure withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    public NetworkStructure withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    public NetworkStructure withRailSubmode(RailSubmodesOfTransportEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    public NetworkStructure withTramSubmode(TramSubmodesOfTransportEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    public NetworkStructure withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    public NetworkStructure withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    public NetworkStructure withAccessMode(AccessModesEnumeration value) {
        setAccessMode(value);
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
