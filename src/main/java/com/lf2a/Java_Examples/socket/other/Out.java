package com.lf2a.Java_Examples.socket.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class Out {
	private int port;
	private String message;
	private JSONObject json;
	private String key;

	public Out(int port, String key) {
		this.port = port;
		this.key = key;
	}

	public final JSONObject getJson() {
		return this.json;
	}

	public final void start() {
		try (ServerSocket ss = new ServerSocket(port)) {
			while (true) {

				Socket socket = ss.accept();

				Log.log("Conectado");

				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));

				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);

				message = br.readLine();
				System.out.println("[from client to server] " + message);

				Object obj = JSONValue.parse(message); // parse string to obj to json
				JSONObject js = (JSONObject) obj; // parse obj to json

				if (js.get("keyApi").equals(this.key)) {
					this.json = js;
					Log.log("Recebido com sucesso");
					pw.println(this.json);

					if (js.get("break").equals("breakServerNow")) {
						socket.close();
						ss.close();
						break;
					}
				} else {
					pw.println("invalidApiKey");
				}
			}
		} catch (IOException e) {
			System.err.println(e);
			Log.log(e.toString());
		}
	}
}
