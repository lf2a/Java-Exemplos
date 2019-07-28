package com.lf2a.Java_Examples.socket.envio_objeto;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port = 3004;
	private Socket socket = null;
	private ServerSocket serverSocket = null;

	public Server() {
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Server started on port " + serverSocket.getLocalPort() + "...");

			socket = serverSocket.accept();
			System.out.println("Client " + socket.getRemoteSocketAddress() + " connected to server...");

			Test test = new Test();
			test.setNome("Luiz Filipy");
			test.setIdade(19);
			test.setPeso(0.0);

			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(test);
			oos.flush();

			oos.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Server server1 = new Server();
	}
}
