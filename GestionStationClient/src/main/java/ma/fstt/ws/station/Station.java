
package ma.fstt.ws.station;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "station", propOrder = { "adresse", "nom", "stationId", "ville" })
public class Station {

	protected String adresse;
	protected String nom;
	protected long stationId;
	protected String ville;

	public Station(long stationId, String nom, String ville, String adresse) {
		super();
		this.stationId = stationId;
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
	}

	public Station(String nom, String ville, String adresse) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
	}

	public Station() {
		super();
	}

	public String getAdresse() {
		return adresse;
	}

	/**
	 * Sets the value of the adresse property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAdresse(String value) {
		this.adresse = value;
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

	/**
	 * Gets the value of the stationId property.
	 * 
	 */
	public long getStationId() {
		return stationId;
	}

	/**
	 * Sets the value of the stationId property.
	 * 
	 */
	public void setStationId(long value) {
		this.stationId = value;
	}

	/**
	 * Gets the value of the ville property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Sets the value of the ville property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setVille(String value) {
		this.ville = value;
	}

}
