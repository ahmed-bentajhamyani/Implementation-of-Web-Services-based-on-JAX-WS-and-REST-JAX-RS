
package ma.fstt.ws.histocarb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for histoCarb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="histoCarb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carburant" type="{http://histocarb.ws.fstt.ma/}carburant" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://histocarb.ws.fstt.ma/}date" minOccurs="0"/&gt;
 *         &lt;element name="histoCarbId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="station" type="{http://histocarb.ws.fstt.ma/}station" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "histoCarb", propOrder = {
    "carburant",
    "date",
    "histoCarbId",
    "prix",
    "station"
})
public class HistoCarb {

    protected Carburant carburant;
    protected Date date;
    protected long histoCarbId;
    protected float prix;
    protected Station station;

    /**
     * Gets the value of the carburant property.
     * 
     * @return
     *     possible object is
     *     {@link Carburant }
     *     
     */
    public Carburant getCarburant() {
        return carburant;
    }

    /**
     * Sets the value of the carburant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carburant }
     *     
     */
    public void setCarburant(Carburant value) {
        this.carburant = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the histoCarbId property.
     * 
     */
    public long getHistoCarbId() {
        return histoCarbId;
    }

    /**
     * Sets the value of the histoCarbId property.
     * 
     */
    public void setHistoCarbId(long value) {
        this.histoCarbId = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link Station }
     *     
     */
    public Station getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link Station }
     *     
     */
    public void setStation(Station value) {
        this.station = value;
    }

}
