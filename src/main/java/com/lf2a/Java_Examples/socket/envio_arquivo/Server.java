package com.lf2a.Java_Examples.socket.envio_arquivo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port = 8082;
	private Socket socket = null;
	private ServerSocket ss = null;

	public Server() {
		try {
			ss = new ServerSocket(port);
			System.out.println("servidor iniciado na porta: " + ss.getLocalPort());

			socket = ss.accept();
			System.out.println("Cliente " + socket.getRemoteSocketAddress());

			System.out.println("enviando arquivo");
			String path = System.getProperty("user.dir");
			String img = path + "/src/main/java/com/lf2a/Java_Examples/socket/envio_arquivo/aston.jpg";

			File file = new File(img);
			byte[] b = new byte[(int) file.length()];

			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(b, 0, b.length);

			OutputStream os = socket.getOutputStream();
			os.write(b, 0, b.length);
			os.flush();
			System.out.println("arquivo enviado");

			fis.close();
			bis.close();
			os.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
		}
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server();
	}
}
