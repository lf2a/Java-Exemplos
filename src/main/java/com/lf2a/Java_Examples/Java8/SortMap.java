package com.lf2a.Java_Examples.Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
	public static void t1() {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		Map<String, Integer> result2 = new LinkedHashMap<>();
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

		System.out.println("Sorted...");
		System.out.println(result);
		System.out.println(result2);
	}

	public static void t2() {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		Map<String, Integer> result = unsortMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(/*Comparator.reverseOrder()*/)).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		Map<String, Integer> result2 = new LinkedHashMap<>();
//		unsortMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//				.forEachOrdered(x -> result2.put(x.getKey(), x.getValue())); // reverso
		unsortMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.forEachOrdered(x -> result2.put(x.getKey(), x.getValue())); // normal

		System.out.println("Sorted...");
		System.out.println(result);
		System.out.println(result2);
	}

	public static void main(String[] args) {
		SortMap.t1();
		SortMap.t2();
	}
}
