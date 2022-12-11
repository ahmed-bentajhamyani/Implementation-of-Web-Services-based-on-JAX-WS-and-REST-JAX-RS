
package ma.fstt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCarburantResponseMsg", propOrder = {
    "_return"
})
public class FindCarburantResponse {

    @XmlElement(name = "return")
    protected Carburant _return;

    public Carburant getReturn() {
        return _return;
    }

    public void setReturn(Carburant value) {
        this._return = value;
    }

}
