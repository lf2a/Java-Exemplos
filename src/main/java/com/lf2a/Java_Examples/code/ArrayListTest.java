package com.lf2a.Java_Examples.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<String>();

		nome.add("Luiz");
		nome.add("José");
		nome.add("Pedro");
		nome.add("Steve");
		nome.add("Filipy");
		nome.set(2, "Maria"); // Pedro -> Maria
		nome.remove(3);

		System.out.println("contém Almeida? " + nome.contains("Almeida"));

		Object[] nom = nome.toArray();
		for (Object object : nom) {
			System.out.print(object + " ");
		}

		Iterator<String> nomes = nome.iterator();

		while (nomes.hasNext()) {
			System.out.println(nomes.next());
		}

		List<Integer> idade = new ArrayList<Integer>(Arrays.asList(12, 15, 7, 19));

		idade.forEach(idades -> System.out.println(idades));

		nome.clear();
		idade.clear();
	}
}
