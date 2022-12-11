package ma.fstt.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import ma.fstt.entities.Station;
import ma.fstt.persistence.StationOperations;

@WebService(endpointInterface = "ma.fstt.ws.StationService")
public class StationServiceImpl implements StationService {

	@Inject
	StationOperations stationOperations;

	@Override
	public List<Station> getStations() {
		return stationOperations.getAllStations();
	}

	@Override
	public Station findStation(Long id) {
		return stationOperations.findStation(id);
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
