package com.lf2a.Java_Examples.socket.envio_lista;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class Client {
	private String serverName = "localhost";
	private int serverPort = 8082;
	private Socket socket = null;

	public Client() {
		try {
			socket = new Socket(serverName, serverPort);
			System.out.println("conectado ao servidor " + socket.getRemoteSocketAddress());

			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Object object = ois.readObject();

			List<String> list = (List<String>) object;
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

			ois.close();
			socket.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		Client client1 = new Client();
	}
}
