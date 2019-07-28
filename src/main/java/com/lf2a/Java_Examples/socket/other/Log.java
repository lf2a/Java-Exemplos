package com.lf2a.Java_Examples.socket.other;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	public static final void log(String msg) {
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String temp = "[" + formatter.format(date) + "] " + msg + "\r\n";

			FileOutputStream outputStream = new FileOutputStream(
					"/home/" + System.getProperty("user.name") + "/japi.log", true);
			byte[] strToBytes = temp.getBytes();
			outputStream.write(strToBytes);

			outputStream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
