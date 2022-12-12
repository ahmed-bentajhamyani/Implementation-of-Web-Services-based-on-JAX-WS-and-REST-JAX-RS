
package ma.fstt.ws.histocarb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.fstt.ws.histocarb package. 
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

    private final static QName _DeleteHistoCarb_QNAME = new QName("http://histocarb.ws.fstt.ma/", "deleteHistoCarb");
    private final static QName _DeleteHistoCarbResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "deleteHistoCarbResponse");
    private final static QName _FindHistoCarb_QNAME = new QName("http://histocarb.ws.fstt.ma/", "findHistoCarb");
    private final static QName _FindHistoCarbResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "findHistoCarbResponse");
    private final static QName _GetHistoCarbs_QNAME = new QName("http://histocarb.ws.fstt.ma/", "getHistoCarbs");
    private final static QName _GetHistoCarbsResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "getHistoCarbsResponse");
    private final static QName _GetTwoCarburant_QNAME = new QName("http://histocarb.ws.fstt.ma/", "getTwoCarburant");
    private final static QName _GetTwoCarburantResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "getTwoCarburantResponse");
    private final static QName _PersistHistoCarb_QNAME = new QName("http://histocarb.ws.fstt.ma/", "persistHistoCarb");
    private final static QName _PersistHistoCarbResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "persistHistoCarbResponse");
    private final static QName _UpdateHistoCarb_QNAME = new QName("http://histocarb.ws.fstt.ma/", "updateHistoCarb");
    private final static QName _UpdateHistoCarbResponse_QNAME = new QName("http://histocarb.ws.fstt.ma/", "updateHistoCarbResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.fstt.ws.histocarb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteHistoCarb }
     * 
     */
    public DeleteHistoCarb createDeleteHistoCarb() {
        return new DeleteHistoCarb();
    }

    /**
     * Create an instance of {@link DeleteHistoCarbResponse }
     * 
     */
    public DeleteHistoCarbResponse createDeleteHistoCarbResponse() {
        return new DeleteHistoCarbResponse();
    }

    /**
     * Create an instance of {@link FindHistoCarb }
     * 
     */
    public FindHistoCarb createFindHistoCarb() {
        return new FindHistoCarb();
    }

    /**
     * Create an instance of {@link FindHistoCarbResponse }
     * 
     */
    public FindHistoCarbResponse createFindHistoCarbResponse() {
        return new FindHistoCarbResponse();
    }

    /**
     * Create an instance of {@link GetHistoCarbs }
     * 
     */
    public GetHistoCarbs createGetHistoCarbs() {
        return new GetHistoCarbs();
    }

    /**
     * Create an instance of {@link GetHistoCarbsResponse }
     * 
     */
    public GetHistoCarbsResponse createGetHistoCarbsResponse() {
        return new GetHistoCarbsResponse();
    }

    /**
     * Create an instance of {@link GetTwoCarburant }
     * 
     */
    public GetTwoCarburant createGetTwoCarburant() {
        return new GetTwoCarburant();
    }

    /**
     * Create an instance of {@link GetTwoCarburantResponse }
     * 
     */
    public GetTwoCarburantResponse createGetTwoCarburantResponse() {
        return new GetTwoCarburantResponse();
    }

    /**
     * Create an instance of {@link PersistHistoCarb }
     * 
     */
    public PersistHistoCarb createPersistHistoCarb() {
        return new PersistHistoCarb();
    }

    /**
     * Create an instance of {@link PersistHistoCarbResponse }
     * 
     */
    public PersistHistoCarbResponse createPersistHistoCarbResponse() {
        return new PersistHistoCarbResponse();
    }

    /**
     * Create an instance of {@link UpdateHistoCarb }
     * 
     */
    public UpdateHistoCarb createUpdateHistoCarb() {
        return new UpdateHistoCarb();
    }

    /**
     * Create an instance of {@link UpdateHistoCarbResponse }
     * 
     */
    public UpdateHistoCarbResponse createUpdateHistoCarbResponse() {
        return new UpdateHistoCarbResponse();
    }

    /**
     * Create an instance of {@link HistoCarb }
     * 
     */
    public HistoCarb createHistoCarb() {
        return new HistoCarb();
    }

    /**
     * Create an instance of {@link Carburant }
     * 
     */
    public Carburant createCarburant() {
        return new Carburant();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHistoCarb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHistoCarb }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "deleteHistoCarb")
    public JAXBElement<DeleteHistoCarb> createDeleteHistoCarb(DeleteHistoCarb value) {
        return new JAXBElement<DeleteHistoCarb>(_DeleteHistoCarb_QNAME, DeleteHistoCarb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHistoCarbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHistoCarbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "deleteHistoCarbResponse")
    public JAXBElement<DeleteHistoCarbResponse> createDeleteHistoCarbResponse(DeleteHistoCarbResponse value) {
        return new JAXBElement<DeleteHistoCarbResponse>(_DeleteHistoCarbResponse_QNAME, DeleteHistoCarbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHistoCarb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindHistoCarb }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "findHistoCarb")
    public JAXBElement<FindHistoCarb> createFindHistoCarb(FindHistoCarb value) {
        return new JAXBElement<FindHistoCarb>(_FindHistoCarb_QNAME, FindHistoCarb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHistoCarbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindHistoCarbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "findHistoCarbResponse")
    public JAXBElement<FindHistoCarbResponse> createFindHistoCarbResponse(FindHistoCarbResponse value) {
        return new JAXBElement<FindHistoCarbResponse>(_FindHistoCarbResponse_QNAME, FindHistoCarbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoCarbs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistoCarbs }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "getHistoCarbs")
    public JAXBElement<GetHistoCarbs> createGetHistoCarbs(GetHistoCarbs value) {
        return new JAXBElement<GetHistoCarbs>(_GetHistoCarbs_QNAME, GetHistoCarbs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoCarbsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistoCarbsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "getHistoCarbsResponse")
    public JAXBElement<GetHistoCarbsResponse> createGetHistoCarbsResponse(GetHistoCarbsResponse value) {
        return new JAXBElement<GetHistoCarbsResponse>(_GetHistoCarbsResponse_QNAME, GetHistoCarbsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwoCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTwoCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "getTwoCarburant")
    public JAXBElement<GetTwoCarburant> createGetTwoCarburant(GetTwoCarburant value) {
        return new JAXBElement<GetTwoCarburant>(_GetTwoCarburant_QNAME, GetTwoCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwoCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTwoCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "getTwoCarburantResponse")
    public JAXBElement<GetTwoCarburantResponse> createGetTwoCarburantResponse(GetTwoCarburantResponse value) {
        return new JAXBElement<GetTwoCarburantResponse>(_GetTwoCarburantResponse_QNAME, GetTwoCarburantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistHistoCarb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistHistoCarb }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "persistHistoCarb")
    public JAXBElement<PersistHistoCarb> createPersistHistoCarb(PersistHistoCarb value) {
        return new JAXBElement<PersistHistoCarb>(_PersistHistoCarb_QNAME, PersistHistoCarb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistHistoCarbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistHistoCarbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "persistHistoCarbResponse")
    public JAXBElement<PersistHistoCarbResponse> createPersistHistoCarbResponse(PersistHistoCarbResponse value) {
        return new JAXBElement<PersistHistoCarbResponse>(_PersistHistoCarbResponse_QNAME, PersistHistoCarbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHistoCarb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHistoCarb }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "updateHistoCarb")
    public JAXBElement<UpdateHistoCarb> createUpdateHistoCarb(UpdateHistoCarb value) {
        return new JAXBElement<UpdateHistoCarb>(_UpdateHistoCarb_QNAME, UpdateHistoCarb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHistoCarbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHistoCarbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://histocarb.ws.fstt.ma/", name = "updateHistoCarbResponse")
    public JAXBElement<UpdateHistoCarbResponse> createUpdateHistoCarbResponse(UpdateHistoCarbResponse value) {
        return new JAXBElement<UpdateHistoCarbResponse>(_UpdateHistoCarbResponse_QNAME, UpdateHistoCarbResponse.class, null, value);
    }

}
