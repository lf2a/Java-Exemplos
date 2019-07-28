package com.lf2a.Java_Examples;

class Animal {
	public void t1() {
		System.out.println("animal1");
	}
}

public class OOP_01 extends Animal {

	public void t1() {
		System.out.println("oop1");
		
	}

	public static void main(String[] args) {

		OOP_01 oop = new OOP_01();
		oop.t1();

		Animal a = new OOP_01();
		a.t1();
	}
}
