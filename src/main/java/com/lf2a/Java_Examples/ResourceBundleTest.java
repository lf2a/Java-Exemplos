package com.lf2a.Java_Examples;

import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("com.lf2a.Java_Examples.testHello");

		System.out.print(resource.getString("com.lf2a.Java_Examples.a") + " ");
		System.out.println(resource.getString("com.lf2a.Java_Examples.b") + "!");
	}
}
