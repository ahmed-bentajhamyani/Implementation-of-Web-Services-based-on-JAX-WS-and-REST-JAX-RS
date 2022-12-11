
package ma.fstt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCarburantMethod", propOrder = {
    "arg0"
})
public class DeleteCarburant {

    protected Carburant arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link Carburant }
     *     
     */
    public Carburant getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carburant }
     *     
     */
    public void setArg0(Carburant value) {
        this.arg0 = value;
    }

}
