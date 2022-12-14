package ma.fstt.rs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import ma.fstt.entities.HistoCarb;
import ma.fstt.entities.Station;
import ma.fstt.persistence.HistoCarbOperations;
import ma.fstt.persistence.StationOperations;

@Path("/rs")
public class HistoCarbRS {
	HistoCarbOperations histoCarbOperations;
	StationOperations stationOperations;

	@GET
	@Path("/hello")
	public String hello() {
		return "hello word";
	}

	@GET
	@Path("/histocarb/{stationNom}/{date}")
	public List<HistoCarb> getTwoCarburants(@PathParam("stationNom") String stationNom, @PathParam("date") String date)
			throws ParseException {
		Date dateConverted = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		histoCarbOperations = new HistoCarbOperations();
		stationOperations = new StationOperations();

		Station station = stationOperations.getStationByName(stationNom);
		List<HistoCarb> histoCarbs = histoCarbOperations.getHistoCarbByDateAndStation(station, dateConverted);

		return histoCarbs;
	}
}
