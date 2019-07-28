package com.lf2a.Java_Examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayStreamTest {
	public static void main(String[] args) {
		try {
			File file = new File(
					"/Java-Examples/src/main/java/com/lf2a/Java_Examples/ByteArrayStream");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			byte[] bytes = new byte[10];

			while (bis.read(bytes) != -1) {
				baos.write(bytes);
			}
			baos.close();
			bis.close();

			bytes = baos.toByteArray();
			for (int i = 0; i < bytes.length; i++) {
				System.out.print((char) bytes[i]);
			}
			System.out.println();

			Scanner scanner = new Scanner(System.in);
;
			int pos = scanner.nextInt();

			bytes[pos - 1] = (byte) scanner.next().charAt(0);

			scanner.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			byte[] tmp = new byte[1];
			while (bais.read(tmp) != -1)
				bos.write(tmp);
			bais.close();
			bos.flush();
			bos.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
