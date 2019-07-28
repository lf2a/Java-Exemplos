package com.lf2a.Java_Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your name: ");
		String name = br.readLine();
		System.out.println("Hello, " + name + "!");
	}
}
