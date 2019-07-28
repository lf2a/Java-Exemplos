package com.lf2a.Java_Examples.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Teste1 {

	public static void main(String args[]) throws IOException {

		ServerSocket server = new ServerSocket(3000);
		System.out.println("Listening for connection on port 3000 ....");
		while (true) {
			Socket clientSocket = server.accept();
			InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			String line = reader.readLine();

			System.out.println(line);
			while (!line.isEmpty()) {
				System.out.println(line);
				line = reader.readLine();
			}
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
			pw.println("teste");
		}
	}
}
