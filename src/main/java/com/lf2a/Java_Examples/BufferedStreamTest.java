package com.lf2a.Java_Examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		try {
			byte[] data = new byte[1];

//			inFile > outFile
			File inFile = new File(
					"/Java-Examples/src/main/java/com/lf2a/Java_Examples/BufferedStreamIn");
			File outFile = new File(
					"/Java-Examples/src/main/java/com/lf2a/Java_Examples/BufferedStreamOut");

			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFile));

			while (bis.read(data) != -1) {
				bos.write(data);
			}

			bos.flush();

			bis.close();
			bos.close();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
