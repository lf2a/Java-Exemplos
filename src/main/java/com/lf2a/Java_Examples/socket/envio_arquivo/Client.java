package com.lf2a.Java_Examples.socket.envio_arquivo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class Client {

	private String serverName = "localhost";
	private int serverPort = 8082;
	private Socket socket = null;

	public Client() {
		try {
			socket = new Socket(serverName, serverPort);
			System.out.println("conectado ao servidor " + socket.getRemoteSocketAddress());

			System.out.println("obtendo arquivo do servidor");
			int FILE_SIZE = 6022386;
			byte[] myByteArray = new byte[FILE_SIZE];

			String path = System.getProperty("user.dir");
			String img = path + "/src/main/java/com/lf2a/Java_Examples/socket/envio_arquivo/aston_recebido.jpg";

			InputStream is = socket.getInputStream();
			int bytesRead = is.read(myByteArray, 0, myByteArray.length);
			int current = bytesRead;
			
			do {
				bytesRead = is.read(myByteArray, current, (myByteArray.length - current));
				if (bytesRead >= 0) {
					current += bytesRead;
				}
			} while (bytesRead > -1);

			FileOutputStream fos = new FileOutputStream(img);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(myByteArray, 0, current);
			bos.flush();

			System.out.println("arquivo obtido");

			is.close();
			fos.close();
			bos.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		Client client = new Client();
	}
}
