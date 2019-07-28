package com.lf2a.Java_Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedTest {
	public static void main(String[] args) {
		try {

			BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));

			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Java-Examples/src/main/java/com/lf2a/Java_Examples/BufferedTest"));

			String input = null;

			while (!(input = bufReader.readLine()).equals("quit")) {
				bufWriter.write(input);

				bufWriter.newLine();
			}

			bufReader.close();
			bufWriter.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
