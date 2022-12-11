package ma.fstt.ws.station;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.Station;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface StationService {
	@WebMethod
	public List<Station> getStations();

	@WebMethod
	public Station findStation(Long id);

	@WebMethod
	public void persistStation(Station station);

	@WebMethod
	public void updateStation(Station station);

	@WebMethod
	public void deleteStation(Station station);
}
