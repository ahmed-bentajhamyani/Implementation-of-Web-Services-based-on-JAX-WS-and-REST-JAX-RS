package ma.fstt.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stations")
public class Station implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "station_id")
	private long stationId;

	@Column(length = 25, nullable = true, name = "nom")
	private String nom;

	@Column(length = 25, nullable = true, name = "ville")
	private String ville;

	@Column(length = 55, nullable = true, name = "adresse")
	private String adresse;

	@OneToMany(mappedBy = "station", fetch = FetchType.LAZY)
	private Collection<HistoCarb> histoCarbs;

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

	public long getStationId() {
		return stationId;
	}

	public void setStationId(long stationId) {
		this.stationId = stationId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
