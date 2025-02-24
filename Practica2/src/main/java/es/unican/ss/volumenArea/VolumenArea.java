
package es.unican.ss.volumenArea;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "VolumenArea", targetNamespace = "http://www.unican.es/ss/VolumenArea/", wsdlLocation = "file:/c:/SS_Practicas/Practica2/src/main/resources/VolumenArea.wsdl")
public class VolumenArea
    extends Service
{

    private final static URL VOLUMENAREA_WSDL_LOCATION;
    private final static WebServiceException VOLUMENAREA_EXCEPTION;
    private final static QName VOLUMENAREA_QNAME = new QName("http://www.unican.es/ss/VolumenArea/", "VolumenArea");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/c:/SS_Practicas/Practica2/src/main/resources/VolumenArea.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VOLUMENAREA_WSDL_LOCATION = url;
        VOLUMENAREA_EXCEPTION = e;
    }

    public VolumenArea() {
        super(__getWsdlLocation(), VOLUMENAREA_QNAME);
    }

    public VolumenArea(WebServiceFeature... features) {
        super(__getWsdlLocation(), VOLUMENAREA_QNAME, features);
    }

    public VolumenArea(URL wsdlLocation) {
        super(wsdlLocation, VOLUMENAREA_QNAME);
    }

    public VolumenArea(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VOLUMENAREA_QNAME, features);
    }

    public VolumenArea(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VolumenArea(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VolumenAreaInterface
     */
    @WebEndpoint(name = "SOAPPort")
    public VolumenAreaInterface getSOAPPort() {
        return super.getPort(new QName("http://www.unican.es/ss/VolumenArea/", "SOAPPort"), VolumenAreaInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VolumenAreaInterface
     */
    @WebEndpoint(name = "SOAPPort")
    public VolumenAreaInterface getSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.unican.es/ss/VolumenArea/", "SOAPPort"), VolumenAreaInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VOLUMENAREA_EXCEPTION!= null) {
            throw VOLUMENAREA_EXCEPTION;
        }
        return VOLUMENAREA_WSDL_LOCATION;
    }

}
