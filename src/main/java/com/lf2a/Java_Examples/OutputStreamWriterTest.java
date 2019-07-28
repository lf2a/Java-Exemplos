package com.lf2a.Java_Examples;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTest {
	public static void main(String[] args) throws Exception {
		try (Writer writer = new OutputStreamWriter(new FileOutputStream("/home/casa-notebook/Documentos/GitHub.com/01 - Amostras/proj/Java-Examples/src/main/java/com/lf2a/Java_Examples/read.txt"))) {
			for (int i = 0; i < 10; i++) {
				writer.write("brasil");
				writer.write("\r\n");
			}
		}
	}
}
