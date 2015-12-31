
package org.huahsin.jaxws.staff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.huahsin.jaxws.staff package. 
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

    private final static QName _GetID_QNAME = new QName("http://staff.huahsin.org/", "getID");
    private final static QName _GetIDResponse_QNAME = new QName("http://staff.huahsin.org/", "getIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.huahsin.jaxws.staff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetID }
     * 
     */
    public GetID createGetID() {
        return new GetID();
    }

    /**
     * Create an instance of {@link GetIDResponse }
     * 
     */
    public GetIDResponse createGetIDResponse() {
        return new GetIDResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staff.huahsin.org/", name = "getID")
    public JAXBElement<GetID> createGetID(GetID value) {
        return new JAXBElement<GetID>(_GetID_QNAME, GetID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staff.huahsin.org/", name = "getIDResponse")
    public JAXBElement<GetIDResponse> createGetIDResponse(GetIDResponse value) {
        return new JAXBElement<GetIDResponse>(_GetIDResponse_QNAME, GetIDResponse.class, null, value);
    }

}
