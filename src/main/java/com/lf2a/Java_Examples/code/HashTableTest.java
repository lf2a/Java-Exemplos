package com.lf2a.Java_Examples.code;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<Integer, String> livro = new Hashtable<Integer, String>();
		livro.put(1, "livro1");
		livro.put(2, "livro2");
		livro.put(3, "livro3");
		livro.put(4, "livro4");

		System.out.println(livro);
		System.out.println(livro.get(2));
		livro.remove(2);
		System.out.println(livro);

		System.out.println();

		Iterator<Integer> it = livro.keySet().iterator();
		while (it.hasNext()) {
			Integer chave = it.next();
			String valor = livro.get(chave);
			System.out.printf("chave: %d valor: %s\n", chave, valor);

		}
	}
}
