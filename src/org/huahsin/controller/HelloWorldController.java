package org.huahsin.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.huahsin.webmethod.IHelloWorld;

@ManagedBean
@RequestScoped
public class HelloWorldController {

	@EJB
	private IHelloWorld helloWorld;
	
	private String sayHello;
	
	public void call() {
		sayHello = helloWorld.sayHelloWorld();
	}

	public String getSayHello() {
		return sayHello;
	}

	public void setSayHello(String sayHello) {
		this.sayHello = sayHello;
	}
}
