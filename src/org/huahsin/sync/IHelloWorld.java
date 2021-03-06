
package org.huahsin.sync;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHelloWorld", targetNamespace = "http://webmethod.huahsin.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHelloWorld {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://webmethod.huahsin.org/", className = "org.huahsin.sync.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://webmethod.huahsin.org/", className = "org.huahsin.sync.SayHelloWorldResponse")
    @Action(input = "http://webmethod.huahsin.org/IHelloWorld/sayHelloWorldRequest", output = "http://webmethod.huahsin.org/IHelloWorld/sayHelloWorldResponse")
    public String sayHelloWorld();

}
