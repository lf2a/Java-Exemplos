package com.lf2a.Java_Examples;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) throws Exception {
		try (FileReader reader = new FileReader("Java-Examples/src/main/java/com/lf2a/Java_Examples/read.txt")) {
			char[] chars = new char[10024];
			while (reader.read(chars) != -1) {
				System.out.println(chars);
			}
		}
	}
}
