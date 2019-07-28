package com.lf2a.Java_Examples;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Java-Examples/src/main/java/com/lf2a/Java_Examples/buffredw.txt"))) {
			for (int i = 0; i < 100000; i++) {
				String str = "luiz filipy";
				bw.write(str);
			}
		}
	}
}
