package ma.fstt.ws.station;

import java.util.List;

import javax.jws.WebService;

import ma.fstt.entities.Station;
import ma.fstt.persistence.StationOperations;

@WebService(endpointInterface = "ma.fstt.ws.station.StationService")
public class StationServiceImpl implements StationService {

	StationOperations stationOperations;

	public StationServiceImpl() {
		super();
		stationOperations = new StationOperations();
	}

	@Override
	public List<Station> getStations() {
		return stationOperations.getAllStations();
	}

	@Override
	public Station findStation(Long id) {
		return stationOperations.findStation(id);
	}

	@Override
	public Station getStationByName(String nom) {
		return stationOperations.getStationByName(nom);
	}

	@Override
	public void persistStation(Station station) {
		stationOperations.persistStation(station);
		getStations();
	}

	@Override
	public void updateStation(Station station) {
		stationOperations.updateStation(station);
		getStations();
	}

	@Override
	public void deleteStation(Station station) {
		stationOperations.deleteStation(station);
		getStations();
	}

}
