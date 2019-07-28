package com.lf2a.Java_Examples.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> pessoa = new HashMap<Integer, String>();

		pessoa.put(19, "Filipy");
		pessoa.put(12, "Pedro");
		pessoa.put(29, "Maria");

		System.out.println(pessoa);
		System.out.println(pessoa.get(19));
		pessoa.remove(29);
		System.out.println(pessoa);

		System.out.println();

		Iterator<Integer> idade = pessoa.keySet().iterator();
		while (idade.hasNext()) {
			Integer chave = idade.next();
			String valor = pessoa.get(chave);

			System.out.printf("chave: %d valor: %s\n", chave, valor);
		}

		System.out.println();

		Iterator<Entry<Integer, String>> itpessoa = pessoa.entrySet().iterator();
		while (itpessoa.hasNext()) {
			Entry<Integer, String> e = itpessoa.next();
			System.out.printf("[chave: %d valor: %s]\n", e.getKey(), e.getValue());
		}
	}
}
