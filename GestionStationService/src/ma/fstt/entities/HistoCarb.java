package ma.fstt.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "histo_carbs")
public class HistoCarb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "histoCarb_id")
	private long histoCarbId;

	@Column(nullable = true, name = "date")
	private Date date;

	@Column(nullable = true, name = "prix")
	private float prix;

	@ManyToOne
	@JoinColumn(name = "carburant_id")
	private Carburant carburant;

	@ManyToOne
	@JoinColumn(name = "station_id")
	private Station station;

	public HistoCarb(long histoCarbId, Date date, float prix, Carburant carburant, Station station) {
		super();
		this.histoCarbId = histoCarbId;
		this.date = date;
		this.prix = prix;
		this.carburant = carburant;
		this.station = station;
	}

	public HistoCarb(Date date, float prix, Carburant carburant, Station station) {
		super();
		this.date = date;
		this.prix = prix;
		this.carburant = carburant;
		this.station = station;
	}

	public HistoCarb() {
		super();
	}

	public long getHistoCarbId() {
		return histoCarbId;
	}

	public void setHistoCarbId(long histoCarbId) {
		this.histoCarbId = histoCarbId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Carburant getCarburant() {
		return carburant;
	}

	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

}
