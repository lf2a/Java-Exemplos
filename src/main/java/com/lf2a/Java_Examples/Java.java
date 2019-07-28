package com.lf2a.Java_Examples;

import java.util.Random;

interface ITest {
	int rand(int a, int b);
}

public class Java {
	public static void main1(String[] args) {
		ITest a = (max, min) -> {
			if (min >= max) {
				throw new IllegalArgumentException("O valor minimo não pode ser maior que o valor máximo - (max, min)");
			} else {
				return new Random().ints(min, (max + 1)).limit(1).findFirst().getAsInt(); // java8
//				return new Random().nextInt(max - min) - min;
			}
		};
		try {
			System.out.println(a.rand(100, 10)); // certo
//			System.out.println(a.rand(10, 100)); // errado

			/*
			 * java8 gera 4 numeros de 10 a 100
			 */
			new Random().ints(4, 10, 100).forEach(System.out::println);

		} catch (Exception e) {
			System.err.println("error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
