package ma.fstt.test;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ma.fstt.entities.HistoCarb;
import ma.fstt.ws.histocarb.HistoCarbService;

public class HistoCarbTest {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:7777/service/histocarb?wsdl");
		QName qname = new QName("http://histocarb.ws.fstt.ma/", "HistoCarbServiceImplService");
		Service service = Service.create(url, qname);

		HistoCarbService histoCarb = service.getPort(HistoCarbService.class);
		
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate = DateFor.format(date);

		// System.out.println(histoCarb.findHistoCarb(1l).getPrix());
		List<HistoCarb> listHistoCarb = histoCarb.getTwoCarburant("afriquia", date);
		for (HistoCarb histoCarb1 : listHistoCarb) {
			System.out.println(histoCarb1.getPrix());
		}
		

	}
}
