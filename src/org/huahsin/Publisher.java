package org.huahsin;

import javax.xml.ws.Endpoint;

import org.huahsin.webmethod.HelloWorldImpl;

public class Publisher {

	public static void main(String args[]) {
		Endpoint.publish("http://localhost:8080/ws1", new HelloWorldImpl());
		
		System.out.println("ws1 publisher is ready.");
	}
}
