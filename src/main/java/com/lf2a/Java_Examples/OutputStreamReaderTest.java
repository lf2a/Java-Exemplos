package com.lf2a.Java_Examples;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class OutputStreamReaderTest {
	public static void main(String[] args) throws Exception {
		try (Reader reader = new InputStreamReader(new FileInputStream("/home/casa-notebook/Documentos/GitHub.com/01 - Amostras/proj/Java-Examples/src/main/java/com/lf2a/Java_Examples/read.txt"))) {
			char[] chars = new char[1024];
			while (reader.read(chars) != -1) {
				System.out.print(new String(chars));
			}
		}
	}

}
