package ma.fstt.ws.histocarb;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import ma.fstt.entities.Carburant;
import ma.fstt.entities.HistoCarb;
import ma.fstt.entities.Station;
import ma.fstt.persistence.CarburantOperations;
import ma.fstt.persistence.HistoCarbOperations;
import ma.fstt.persistence.StationOperations;

@WebService(endpointInterface = "ma.fstt.ws.histocarb.HistoCarbService")
public class HistoCarbServiceImpl implements HistoCarbService {

	HistoCarbOperations histoCarbOperations;
	CarburantOperations carburantOperations;
	StationOperations stationOperations;

	public HistoCarbServiceImpl() {
		super();
		histoCarbOperations = new HistoCarbOperations();
		carburantOperations = new CarburantOperations();
		stationOperations = new StationOperations();
	}

	@Override
	public List<HistoCarb> getHistoCarbs() {
		return histoCarbOperations.getAllHistoCarbs();
	}

	@Override
	public HistoCarb findHistoCarb(Long id) {
		return histoCarbOperations.findHistoCarb(id);
	}

	@Override
	public void persistHistoCarb(Date date, float prix, Long carburantId, Long stationId) {
		Station station = stationOperations.findStation(stationId);
		Carburant carburant = carburantOperations.findCarburant(carburantId);

		HistoCarb histoCarb = new HistoCarb(date, prix, carburant, station);
		histoCarbOperations.persistHistoCarb(histoCarb);
		getHistoCarbs();
	}

	@Override
	public void updateHistoCarb(Long histoCarbId, Date date, float prix, Long carburantId, Long stationId) {
		Station station = stationOperations.findStation(stationId);
		Carburant carburant = carburantOperations.findCarburant(carburantId);

		HistoCarb histoCarb = new HistoCarb(histoCarbId, date, prix, carburant, station);
		histoCarbOperations.updateHistoCarb(histoCarb);
		getHistoCarbs();
	}

	@Override
	public void deleteHistoCarb(HistoCarb histoCarb) {
		histoCarbOperations.deleteHistoCarb(histoCarb);
		getHistoCarbs();
	}

	@Override
	public List<HistoCarb> getTwoCarburant(String stationNom, Date date) {
		Station station = stationOperations.getStationByName(stationNom);
		return histoCarbOperations.getHistoCarbByDateAndStation(station, date);
	}

}
