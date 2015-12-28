package org.huahsin.webmethod;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
@Remote
public interface IHelloWorld {

	@WebMethod
	String sayHelloWorld();
}
