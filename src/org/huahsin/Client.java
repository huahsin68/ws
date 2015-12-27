package org.huahsin;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.huahsin.webmethod.IHelloWorld;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/ws1?wsdl");
		
		QName qname = new QName("http://webmethod.huahsin.org/", "HelloWorldImplService");
		Service service = Service.create(url, qname);
		IHelloWorld hw = service.getPort(IHelloWorld.class);
		System.out.println(hw.sayHelloWorld());
	}
}
