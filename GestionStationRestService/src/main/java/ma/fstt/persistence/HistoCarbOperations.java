package ma.fstt.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.fstt.entities.HistoCarb;
import ma.fstt.entities.Station;

public class HistoCarbOperations {
	private static final String PERSISTENCE_UNIT_NAME = "unit";
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
			.createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	@SuppressWarnings("unchecked")
	public List<HistoCarb> getAllHistoCarbs() {
		Query queryObj = entityMgrObj.createQuery("SELECT h FROM HistoCarb h");
		List<HistoCarb> histoCarbs = queryObj.getResultList();
		if (histoCarbs != null && histoCarbs.size() > 0) {
			return histoCarbs;
		} else {
			return null;
		}
	}

	public HistoCarb findHistoCarb(Long id) {
		HistoCarb histoCarb = entityMgrObj.find(HistoCarb.class, id);
		entityMgrObj.refresh(histoCarb);
		if (histoCarb != null) {
			return histoCarb;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<HistoCarb> getHistoCarbByDateAndStation(Station station, Date date) {
		Query queryObj = entityMgrObj
				.createQuery("SELECT h FROM HistoCarb h WHERE h.station = :id AND h.date = :date")
				.setParameter("id", station).setParameter("date", date);
		List<HistoCarb> histoCarbs = queryObj.getResultList();
		if (histoCarbs != null && histoCarbs.size() > 0) {
			return histoCarbs;
		} else {
			return null;
		}
	}

	public String persistHistoCarb(HistoCarb histoCarb) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		entityMgrObj.persist(histoCarb);
		transactionObj.commit();
		return "true";
	}

	public String updateHistoCarb(HistoCarb histoCarb) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		HistoCarb newHistoCarb = entityMgrObj.find(HistoCarb.class, histoCarb.getHistoCarbId());
		newHistoCarb.setDate(histoCarb.getDate());
		newHistoCarb.setPrix(histoCarb.getPrix());
		transactionObj.commit();
		return "true";
	}

	public String deleteHistoCarb(HistoCarb histoCarb) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		if (!entityMgrObj.contains(histoCarb)) {
			histoCarb = entityMgrObj.merge(histoCarb);
		}
		entityMgrObj.remove(histoCarb);
		transactionObj.commit();
		return "true";
	}
}
