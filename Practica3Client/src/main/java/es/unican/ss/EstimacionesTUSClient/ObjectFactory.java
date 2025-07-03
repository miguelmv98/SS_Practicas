
package es.unican.ss.EstimacionesTUSClient;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.unican.ss.EstimacionesTUSClient package. 
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

    private final static QName _ProximosAutobuses_QNAME = new QName("http://www.unican.es/ss/SSEstimacionesTUS", "proximosAutobuses");
    private final static QName _ProximosAutobusesResponse_QNAME = new QName("http://www.unican.es/ss/SSEstimacionesTUS", "proximosAutobusesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.unican.ss.EstimacionesTUSClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProximosAutobuses }
     * 
     */
    public ProximosAutobuses createProximosAutobuses() {
        return new ProximosAutobuses();
    }

    /**
     * Create an instance of {@link ProximosAutobusesResponse }
     * 
     */
    public ProximosAutobusesResponse createProximosAutobusesResponse() {
        return new ProximosAutobusesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProximosAutobuses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProximosAutobuses }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/SSEstimacionesTUS", name = "proximosAutobuses")
    public JAXBElement<ProximosAutobuses> createProximosAutobuses(ProximosAutobuses value) {
        return new JAXBElement<ProximosAutobuses>(_ProximosAutobuses_QNAME, ProximosAutobuses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProximosAutobusesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProximosAutobusesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/SSEstimacionesTUS", name = "proximosAutobusesResponse")
    public JAXBElement<ProximosAutobusesResponse> createProximosAutobusesResponse(ProximosAutobusesResponse value) {
        return new JAXBElement<ProximosAutobusesResponse>(_ProximosAutobusesResponse_QNAME, ProximosAutobusesResponse.class, null, value);
    }

}
