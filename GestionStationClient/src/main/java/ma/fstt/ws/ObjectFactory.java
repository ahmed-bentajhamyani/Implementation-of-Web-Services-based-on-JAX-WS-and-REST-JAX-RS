
package ma.fstt.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the web.service.carburant package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _DeleteCarburant_QNAME = new QName("http://ws.fstt.ma/", "deleteCarburant");
	private final static QName _DeleteCarburantResponse_QNAME = new QName("http://ws.fstt.ma/",
			"deleteCarburantResponse");
	private final static QName _FindCarburant_QNAME = new QName("http://ws.fstt.ma/", "findCarburant");
	private final static QName _FindCarburantResponse_QNAME = new QName("http://ws.fstt.ma/", "findCarburantResponse");
	private final static QName _GetCarburants_QNAME = new QName("http://ws.fstt.ma/", "getCarburants");
	private final static QName _GetCarburantsResponse_QNAME = new QName("http://ws.fstt.ma/", "getCarburantsResponse");
	private final static QName _PersistCarburant_QNAME = new QName("http://ws.fstt.ma/", "persistCarburant");
	private final static QName _PersistCarburantResponse_QNAME = new QName("http://ws.fstt.ma/",
			"persistCarburantResponse");
	private final static QName _UpdateCarburant_QNAME = new QName("http://ws.fstt.ma/", "updateCarburant");
	private final static QName _UpdateCarburantResponse_QNAME = new QName("http://ws.fstt.ma/",
			"updateCarburantResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema
	 * derived classes for package: web.service.carburant
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DeleteCarburant }
	 * 
	 */
	public DeleteCarburant createDeleteCarburant() {
		return new DeleteCarburant();
	}

	/**
	 * Create an instance of {@link DeleteCarburantResponse }
	 * 
	 */
	public DeleteCarburantResponse createDeleteCarburantResponse() {
		return new DeleteCarburantResponse();
	}

	/**
	 * Create an instance of {@link FindCarburant }
	 * 
	 */
	public FindCarburant createFindCarburant() {
		return new FindCarburant();
	}

	/**
	 * Create an instance of {@link FindCarburantResponse }
	 * 
	 */
	public FindCarburantResponse createFindCarburantResponse() {
		return new FindCarburantResponse();
	}

	/**
	 * Create an instance of {@link GetCarburants }
	 * 
	 */
	public GetCarburants createGetCarburants() {
		return new GetCarburants();
	}

	/**
	 * Create an instance of {@link GetCarburantsResponse }
	 * 
	 */
	public GetCarburantsResponse createGetCarburantsResponse() {
		return new GetCarburantsResponse();
	}

	/**
	 * Create an instance of {@link PersistCarburant }
	 * 
	 */
	public PersistCarburant createPersistCarburant() {
		return new PersistCarburant();
	}

	/**
	 * Create an instance of {@link PersistCarburantResponse }
	 * 
	 */
	public PersistCarburantResponse createPersistCarburantResponse() {
		return new PersistCarburantResponse();
	}

	/**
	 * Create an instance of {@link UpdateCarburant }
	 * 
	 */
	public UpdateCarburant createUpdateCarburant() {
		return new UpdateCarburant();
	}

	/**
	 * Create an instance of {@link UpdateCarburantResponse }
	 * 
	 */
	public UpdateCarburantResponse createUpdateCarburantResponse() {
		return new UpdateCarburantResponse();
	}

	/**
	 * Create an instance of {@link Carburant }
	 * 
	 */
	public Carburant createCarburant() {
		return new Carburant();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCarburant
	 * }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link DeleteCarburant }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "deleteCarburant")
	public JAXBElement<DeleteCarburant> createDeleteCarburant(DeleteCarburant value) {
		return new JAXBElement<DeleteCarburant>(_DeleteCarburant_QNAME, DeleteCarburant.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link DeleteCarburantResponse }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link DeleteCarburantResponse }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "deleteCarburantResponse")
	public JAXBElement<DeleteCarburantResponse> createDeleteCarburantResponse(DeleteCarburantResponse value) {
		return new JAXBElement<DeleteCarburantResponse>(_DeleteCarburantResponse_QNAME, DeleteCarburantResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindCarburant
	 * }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement }{@code <}{@link FindCarburant
	 *         }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "findCarburant")
	public JAXBElement<FindCarburant> createFindCarburant(FindCarburant value) {
		return new JAXBElement<FindCarburant>(_FindCarburant_QNAME, FindCarburant.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link FindCarburantResponse }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link FindCarburantResponse }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "findCarburantResponse")
	public JAXBElement<FindCarburantResponse> createFindCarburantResponse(FindCarburantResponse value) {
		return new JAXBElement<FindCarburantResponse>(_FindCarburantResponse_QNAME, FindCarburantResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetCarburants
	 * }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement }{@code <}{@link GetCarburants
	 *         }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "getCarburants")
	public JAXBElement<GetCarburants> createGetCarburants(GetCarburants value) {
		return new JAXBElement<GetCarburants>(_GetCarburants_QNAME, GetCarburants.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetCarburantsResponse }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link GetCarburantsResponse }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "getCarburantsResponse")
	public JAXBElement<GetCarburantsResponse> createGetCarburantsResponse(GetCarburantsResponse value) {
		return new JAXBElement<GetCarburantsResponse>(_GetCarburantsResponse_QNAME, GetCarburantsResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PersistCarburant
	 * }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link PersistCarburant }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "persistCarburant")
	public JAXBElement<PersistCarburant> createPersistCarburant(PersistCarburant value) {
		return new JAXBElement<PersistCarburant>(_PersistCarburant_QNAME, PersistCarburant.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link PersistCarburantResponse }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link PersistCarburantResponse }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "persistCarburantResponse")
	public JAXBElement<PersistCarburantResponse> createPersistCarburantResponse(PersistCarburantResponse value) {
		return new JAXBElement<PersistCarburantResponse>(_PersistCarburantResponse_QNAME,
				PersistCarburantResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCarburant
	 * }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link UpdateCarburant }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "updateCarburant")
	public JAXBElement<UpdateCarburant> createUpdateCarburant(UpdateCarburant value) {
		return new JAXBElement<UpdateCarburant>(_UpdateCarburant_QNAME, UpdateCarburant.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link UpdateCarburantResponse }{@code >}
	 * 
	 * @param value Java instance representing xml element's value.
	 * @return the new instance of {@link JAXBElement
	 *         }{@code <}{@link UpdateCarburantResponse }{@code >}
	 */
	@XmlElementDecl(namespace = "http://ws.fstt.ma/", name = "updateCarburantResponse")
	public JAXBElement<UpdateCarburantResponse> createUpdateCarburantResponse(UpdateCarburantResponse value) {
		return new JAXBElement<UpdateCarburantResponse>(_UpdateCarburantResponse_QNAME, UpdateCarburantResponse.class,
				null, value);
	}

}
