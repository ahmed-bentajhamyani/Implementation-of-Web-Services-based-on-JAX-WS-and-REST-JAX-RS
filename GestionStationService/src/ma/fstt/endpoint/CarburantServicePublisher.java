package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.ws.carburant.CarburantServiceImpl;

public class CarburantServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7778/service/carburant", new CarburantServiceImpl());
	}

}
