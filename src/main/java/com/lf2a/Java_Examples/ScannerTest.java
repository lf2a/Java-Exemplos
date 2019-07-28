package com.lf2a.Java_Examples;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Name: ");
		String name = sc.nextLine();
		sc.close();
		System.out.printf("Hello %s !\n", name);
	}
}
