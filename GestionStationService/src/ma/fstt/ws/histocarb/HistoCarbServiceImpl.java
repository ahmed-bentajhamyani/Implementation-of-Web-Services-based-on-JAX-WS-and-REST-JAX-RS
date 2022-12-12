package ma.fstt.ws.histocarb;

import java.util.List;

import javax.jws.WebService;

import ma.fstt.entities.HistoCarb;
import ma.fstt.persistence.HistoCarbOperations;

@WebService(endpointInterface = "ma.fstt.ws.histocarb.HistoCarbService")
public class HistoCarbServiceImpl implements HistoCarbService {

	HistoCarbOperations histoCarbOperations;

	public HistoCarbServiceImpl() {
		super();
		histoCarbOperations = new HistoCarbOperations();
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
	public void persistHistoCarb(HistoCarb histoCarb) {
		histoCarbOperations.persistHistoCarb(histoCarb);
		getHistoCarbs();
	}

	@Override
	public void updateHistoCarb(HistoCarb histoCarb) {
		histoCarbOperations.updateHistoCarb(histoCarb);
		getHistoCarbs();
	}

	@Override
	public void deleteHistoCarb(HistoCarb histoCarb) {
		histoCarbOperations.deleteHistoCarb(histoCarb);
		getHistoCarbs();
	}

}
