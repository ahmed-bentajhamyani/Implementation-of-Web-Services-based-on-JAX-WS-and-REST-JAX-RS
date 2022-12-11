
package ma.fstt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for carburant complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="carburant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carburantId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carburant", propOrder = { "carburantId", "description", "nom" })
public class Carburant {

	protected Long carburantId;
	protected String description;
	protected String nom;

	public Carburant(Long carburantId, String nom, String description) {
		super();
		this.carburantId = carburantId;
		this.nom = nom;
		this.description = description;
	}

	public Carburant(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	public Carburant() {
		super();
	}

	/**
	 * Gets the value of the carburantId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCarburantId() {
		return carburantId;
	}

	/**
	 * Sets the value of the carburantId property.
	 * 
	 * @param value allowed object is {@link Long }
	 * 
	 */
	public void setCarburantId(Long value) {
		this.carburantId = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the nom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the value of the nom property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNom(String value) {
		this.nom = value;
	}

}
