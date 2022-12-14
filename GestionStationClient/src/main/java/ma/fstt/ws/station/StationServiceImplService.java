
package ma.fstt.ws.station;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "StationServiceImplService", targetNamespace = "http://station.ws.fstt.ma/", wsdlLocation = "http://localhost:7779/service/station?wsdl")
public class StationServiceImplService
    extends Service
{

    private final static URL STATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException STATIONSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName STATIONSERVICEIMPLSERVICE_QNAME = new QName("http://station.ws.fstt.ma/", "StationServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7779/service/station?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STATIONSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        STATIONSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public StationServiceImplService() {
        super(__getWsdlLocation(), STATIONSERVICEIMPLSERVICE_QNAME);
    }

    public StationServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public StationServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, STATIONSERVICEIMPLSERVICE_QNAME);
    }

    public StationServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public StationServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StationServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StationService
     */
    @WebEndpoint(name = "StationServiceImplPort")
    public StationService getStationServiceImplPort() {
        return super.getPort(new QName("http://station.ws.fstt.ma/", "StationServiceImplPort"), StationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StationService
     */
    @WebEndpoint(name = "StationServiceImplPort")
    public StationService getStationServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://station.ws.fstt.ma/", "StationServiceImplPort"), StationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STATIONSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw STATIONSERVICEIMPLSERVICE_EXCEPTION;
        }
        return STATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
