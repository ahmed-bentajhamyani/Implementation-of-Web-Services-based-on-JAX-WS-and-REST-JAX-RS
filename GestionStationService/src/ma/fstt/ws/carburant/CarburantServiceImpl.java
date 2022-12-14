package ma.fstt.ws.carburant;

import java.util.List;

import javax.jws.WebService;

import ma.fstt.entities.Carburant;
import ma.fstt.persistence.CarburantOperations;

@WebService(endpointInterface = "ma.fstt.ws.carburant.CarburantService")
public class CarburantServiceImpl implements CarburantService {

	CarburantOperations carburantOperations;

	public CarburantServiceImpl() {
		super();
		carburantOperations = new CarburantOperations();
	}

	@Override
	public List<Carburant> getCarburants() {
		return carburantOperations.getAllCarburants();
	}

	@Override
	public Carburant findCarburant(Long id) {
		return carburantOperations.findCarburant(id);
	}

	@Override
	public void persistCarburant(Carburant carburant) {
		carburantOperations.persistCarburant(carburant);
		getCarburants();
	}

	@Override
	public void updateCarburant(Carburant carburant) {
		carburantOperations.updateCarburant(carburant);
		getCarburants();
	}

	@Override
	public void deleteCarburant(Carburant carburant) {
		carburantOperations.deleteCarburant(carburant);
		getCarburants();
	}

}
