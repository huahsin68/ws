package org.huahsin.webmethod;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface="org.huahsin.webmethod.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

	@Override
	public String sayHelloWorld() {
		
		return "Hello World";
	}

}
