package ma.fstt.test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ma.fstt.ws.CarburantService;

public class CarburantTest {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:7778/service/carburant?wsdl");
		QName qname = new QName("http://ws.fstt.ma/", "CarburantServiceImplService");
		Service service = Service.create(url, qname);

		CarburantService carburant = service.getPort(CarburantService.class);

		System.out.println(carburant.findCarburant(1l).getNom());

	}
}
