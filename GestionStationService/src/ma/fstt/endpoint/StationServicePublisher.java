package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.ws.station.StationServiceImpl;

public class StationServicePublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/service/station", new StationServiceImpl());
	}
}
