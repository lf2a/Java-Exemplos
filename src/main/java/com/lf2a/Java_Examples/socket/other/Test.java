package com.lf2a.Java_Examples.socket.other;

import org.json.simple.JSONObject;

@SuppressWarnings("unused")
public class Test {

	@SuppressWarnings("unchecked")
	public static void client() {

		JSONObject json = new JSONObject();
		json.put("keyApi", "filipy");
		json.put("break", "breakServerNow");
		json.put("response", "0");
		json.put("age", new Integer(27));
		json.put("salary", new Double(600000));

		In client = new In("localhost", 1234);
		client.send(json);
		System.out.println("test: " + client.getMessage());

	}

	public static void server() {

		Out server = new Out(1234, "filipy");
		server.start();
		System.out.println(server.getJson());

	}

	public static void main(String[] args) {
		Test.server();
	}
}
