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
@Table(name = "carburants")
public class Carburant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carburant_id")
	private Long carburantId;

	@Column(length = 25, nullable = true, name = "nom")
	private String nom;

	@Column(length = 55, nullable = true, name = "description")
	private String description;

	@OneToMany(mappedBy = "carburant", fetch = FetchType.LAZY)
	private Collection<HistoCarb> histoCarbs;

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

	public Long getCarburantId() {
		return carburantId;
	}

	public void setCarburantId(Long carburantId) {
		this.carburantId = carburantId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
