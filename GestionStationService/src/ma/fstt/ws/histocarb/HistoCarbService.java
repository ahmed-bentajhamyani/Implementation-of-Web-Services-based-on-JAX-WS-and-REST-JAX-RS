package ma.fstt.ws.histocarb;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.HistoCarb;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HistoCarbService {
	@WebMethod
	public List<HistoCarb> getHistoCarbs();

	@WebMethod
	public HistoCarb findHistoCarb(Long id);

	@WebMethod
	public void persistHistoCarb(Date date, float prix, Long carburantId, Long stationId);

	@WebMethod
	public void updateHistoCarb(Long histoCarbId, Date date, float prix, Long carburantId, Long stationId);

	@WebMethod
	public void deleteHistoCarb(HistoCarb histoCarb);

	@WebMethod
	public List<HistoCarb> getTwoCarburant(String stationNom, Date date);
}
