
package ma.fstt.ws.carburant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

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
