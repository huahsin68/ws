package org.huahsin;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.huahsin.async.HelloWorldImplService;
import org.huahsin.async.IHelloWorld;
import org.huahsin.async.SayHelloWorldResponse;

public class Client {

	static private double rate = 0.0;
	static private String msg = "";
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, ExecutionException {
		Client e = new Client();
		
		System.out.println("before: " + msg);
		e.sayHelloWorldMethod();
		Thread.sleep(1000);
		System.out.println("after: " + msg);
	}
	
	private void sayHelloWorldMethod() throws MalformedURLException, InterruptedException, ExecutionException {
		URL url = new URL("http://localhost:8080/ws1?wsdl");
		QName qname = new QName("http://webmethod.huahsin.org/", "HelloWorldImplService");
		HelloWorldImplService service = new HelloWorldImplService(url, qname);
		IHelloWorld hello = service.getHelloWorldImplPort();
		
		Response res = hello.sayHelloWorldAsync();
		SayHelloWorldResponse output = (SayHelloWorldResponse) res.get();
		output.getReturn();
		
		hello.sayHelloWorldAsync(new AsyncHandler() {

			@Override
			public void handleResponse(Response res) {
				try {
					setMessage(((SayHelloWorldResponse)res.get()).getReturn());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	private void setMessage(String msg) {
		this.msg = msg;
		System.out.println("Set message: " + msg);
	}
}
