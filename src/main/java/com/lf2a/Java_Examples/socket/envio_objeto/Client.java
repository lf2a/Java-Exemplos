package com.lf2a.Java_Examples.socket.envio_objeto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import com.lf2a.Java_Examples.socket.envio_objeto.Test;

public class Client {
	private String serverName = "localhost";
	private int serverPort = 3004;
	private Socket socket = null;

	public Client() {
		try {
			socket = new Socket(serverName, serverPort);
			System.out.println("Connected to server " + socket.getRemoteSocketAddress());

			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Object object = ois.readObject();

			Test test = (Test) object;
			System.out.println("Nome : " + test.getNome());
			System.out.println("Idade : " + test.getIdade());
			System.out.println("Peso : " + test.getPeso());

			ois.close();
			socket.close();
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Client client1 = new Client();
	}
}
