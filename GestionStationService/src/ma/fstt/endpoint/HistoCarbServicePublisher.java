package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.ws.histocarb.HistoCarbServiceImpl;

public class HistoCarbServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/service/histocarb", new HistoCarbServiceImpl());
	}
}
