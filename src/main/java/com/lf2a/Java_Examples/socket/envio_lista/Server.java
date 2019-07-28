package com.lf2a.Java_Examples.socket.envio_lista;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	private int port = 8082;
	private Socket socket = null;
	private ServerSocket ss = null;

	public Server() {
		try {
			ss = new ServerSocket(port);
			System.out.println("servidor iniciado na porta: " + ss.getLocalPort() + "...");

			socket = ss.accept();
			System.out.println("Cliente " + socket.getRemoteSocketAddress());

			List<String> listNama = new ArrayList<>();
			listNama.add("luiz");
			listNama.add("filipy");
			listNama.add("aston martin");

			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(listNama);
			oos.flush();

			oos.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
		}
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server();
	}
}
