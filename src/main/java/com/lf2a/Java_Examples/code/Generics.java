package com.lf2a.Java_Examples.code;

class Test<T> {

	@SuppressWarnings("unused")
	private T v;

	public T test(T v) {
		this.v = v;
		return v;
	}
}

public class Generics {
	public static void main(String[] args) {
		Test<String> t = new Test<>();
		System.out.println(t.test("Luiz"));

		Test<Integer> ti = new Test<>();
		if (ti.test(1999) instanceof Integer) {
			System.out.println("É inteiro");
			System.out.println(ti.hashCode());
		}
	}
}
