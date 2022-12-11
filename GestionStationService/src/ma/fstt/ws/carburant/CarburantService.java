package ma.fstt.ws.carburant;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.Carburant;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface CarburantService {
	@WebMethod
	public List<Carburant> getCarburants();

	@WebMethod
	public Carburant findCarburant(Long id);

	@WebMethod
	public void persistCarburant(Carburant carburant);

	@WebMethod
	public void updateCarburant(Carburant carburant);

	@WebMethod
	public void deleteCarburant(Carburant carburant);
}
