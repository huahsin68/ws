package org.huahsin.webmethod;

import javax.jws.WebService;

@WebService(endpointInterface="org.huahsin.webmethod.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

	@Override
	public String sayHelloWorld() {
		
		return "Hello World";
	}

}
