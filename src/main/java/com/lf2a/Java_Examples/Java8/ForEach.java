package com.lf2a.Java_Examples.Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("luiz");
		nomes.add("filipy");
		nomes.add("Maria");

		for (String nome : nomes) {
			System.out.println("normal: " + nome);
		}

		// ou

		nomes.forEach(nome -> {
			System.out.println("com lambda: " + nome);
		});

		// dict
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
	}
}
