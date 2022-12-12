package ma.fstt.test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ma.fstt.ws.station.StationService;

public class StationTest {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:7779/service/station?wsdl");
		QName qname = new QName("http://station.ws.fstt.ma/", "StationServiceImplService");
		Service service = Service.create(url, qname);

		StationService station = service.getPort(StationService.class);

		System.out.println(station.getStationByName("afriquia").getNom());

	}
}
