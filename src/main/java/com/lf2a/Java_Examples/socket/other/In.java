package com.lf2a.Java_Examples.socket.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONObject;

public class In {
	private String host;
	private int port;
	private String message;

	public In(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public final String getMessage() {
		return this.message;
	}

	public final void send(JSONObject json) {
		try (Socket socket = new Socket(host, port)) {

			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);

			pw.println("teste");

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			String fromServer = reader.readLine();
			this.message = fromServer;

			System.out.println("[from server to client] " + fromServer);

			socket.close();

		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}
