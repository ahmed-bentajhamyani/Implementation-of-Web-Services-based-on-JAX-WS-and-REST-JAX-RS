
package ma.fstt.ws.station;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.fstt.ws.station package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteStation_QNAME = new QName("http://station.ws.fstt.ma/", "deleteStation");
    private final static QName _DeleteStationResponse_QNAME = new QName("http://station.ws.fstt.ma/", "deleteStationResponse");
    private final static QName _FindStation_QNAME = new QName("http://station.ws.fstt.ma/", "findStation");
    private final static QName _FindStationResponse_QNAME = new QName("http://station.ws.fstt.ma/", "findStationResponse");
    private final static QName _GetStations_QNAME = new QName("http://station.ws.fstt.ma/", "getStations");
    private final static QName _GetStationsResponse_QNAME = new QName("http://station.ws.fstt.ma/", "getStationsResponse");
    private final static QName _PersistStation_QNAME = new QName("http://station.ws.fstt.ma/", "persistStation");
    private final static QName _PersistStationResponse_QNAME = new QName("http://station.ws.fstt.ma/", "persistStationResponse");
    private final static QName _UpdateStation_QNAME = new QName("http://station.ws.fstt.ma/", "updateStation");
    private final static QName _UpdateStationResponse_QNAME = new QName("http://station.ws.fstt.ma/", "updateStationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.fstt.ws.station
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteStation }
     * 
     */
    public DeleteStation createDeleteStation() {
        return new DeleteStation();
    }

    /**
     * Create an instance of {@link DeleteStationResponse }
     * 
     */
    public DeleteStationResponse createDeleteStationResponse() {
        return new DeleteStationResponse();
    }

    /**
     * Create an instance of {@link FindStation }
     * 
     */
    public FindStation createFindStation() {
        return new FindStation();
    }

    /**
     * Create an instance of {@link FindStationResponse }
     * 
     */
    public FindStationResponse createFindStationResponse() {
        return new FindStationResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link PersistStation }
     * 
     */
    public PersistStation createPersistStation() {
        return new PersistStation();
    }

    /**
     * Create an instance of {@link PersistStationResponse }
     * 
     */
    public PersistStationResponse createPersistStationResponse() {
        return new PersistStationResponse();
    }

    /**
     * Create an instance of {@link UpdateStation }
     * 
     */
    public UpdateStation createUpdateStation() {
        return new UpdateStation();
    }

    /**
     * Create an instance of {@link UpdateStationResponse }
     * 
     */
    public UpdateStationResponse createUpdateStationResponse() {
        return new UpdateStationResponse();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "deleteStation")
    public JAXBElement<DeleteStation> createDeleteStation(DeleteStation value) {
        return new JAXBElement<DeleteStation>(_DeleteStation_QNAME, DeleteStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "deleteStationResponse")
    public JAXBElement<DeleteStationResponse> createDeleteStationResponse(DeleteStationResponse value) {
        return new JAXBElement<DeleteStationResponse>(_DeleteStationResponse_QNAME, DeleteStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "findStation")
    public JAXBElement<FindStation> createFindStation(FindStation value) {
        return new JAXBElement<FindStation>(_FindStation_QNAME, FindStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "findStationResponse")
    public JAXBElement<FindStationResponse> createFindStationResponse(FindStationResponse value) {
        return new JAXBElement<FindStationResponse>(_FindStationResponse_QNAME, FindStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "getStations")
    public JAXBElement<GetStations> createGetStations(GetStations value) {
        return new JAXBElement<GetStations>(_GetStations_QNAME, GetStations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "getStationsResponse")
    public JAXBElement<GetStationsResponse> createGetStationsResponse(GetStationsResponse value) {
        return new JAXBElement<GetStationsResponse>(_GetStationsResponse_QNAME, GetStationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "persistStation")
    public JAXBElement<PersistStation> createPersistStation(PersistStation value) {
        return new JAXBElement<PersistStation>(_PersistStation_QNAME, PersistStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "persistStationResponse")
    public JAXBElement<PersistStationResponse> createPersistStationResponse(PersistStationResponse value) {
        return new JAXBElement<PersistStationResponse>(_PersistStationResponse_QNAME, PersistStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "updateStation")
    public JAXBElement<UpdateStation> createUpdateStation(UpdateStation value) {
        return new JAXBElement<UpdateStation>(_UpdateStation_QNAME, UpdateStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://station.ws.fstt.ma/", name = "updateStationResponse")
    public JAXBElement<UpdateStationResponse> createUpdateStationResponse(UpdateStationResponse value) {
        return new JAXBElement<UpdateStationResponse>(_UpdateStationResponse_QNAME, UpdateStationResponse.class, null, value);
    }

}
