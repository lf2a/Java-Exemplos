package com.lf2a.Java_Examples;

public class Class {
	public static void main(String[] args) {
		Object obj = new Object() {
			public String toString() {
				return "Luiz Filipy";
			}
		};
		System.out.println(obj);
	}
}
