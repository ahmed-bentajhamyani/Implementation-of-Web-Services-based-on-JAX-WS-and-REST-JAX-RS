package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.ws.CarburantServiceImpl;

public class CarburantServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/service/station", new CarburantServiceImpl());
	}

}
