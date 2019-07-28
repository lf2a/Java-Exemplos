package com.lf2a.Java_Examples.Java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Item {

	private String name;
	private int qty;
	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

}

class Pais {
	private String sigla;
	private String pais;
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	Pais() {
	}

	Pais(String sigla, String pais) {
		this.sigla = sigla;
		this.pais = pais;
	}

	Pais(String sigla, String pais, int valor) {
		this.sigla = sigla;
		this.pais = pais;
		this.valor = valor;
	}

}

public class Streams {
	public static void t1() {
		List<String> nomes = Arrays.asList("luiz", "filipy", "brasil");

		List<String> res = nomes.stream().filter(nome -> !"luiz".equals(nome)).collect(Collectors.toList());

		res.forEach(System.out::println);
	}

	public static void t2() {

		List<Pais> paises = Arrays.asList(new Pais("BR", "Brasil"), new Pais("FR", "França"),
				new Pais("EUA", "Estados Unidos da America"));

		Pais res = paises.stream().filter(s -> "AU".equals(s.getSigla())).findAny().orElse(new Pais("null", "null"));

		String res2 = paises.stream().filter(x -> "CA".equals(x.getSigla())).map(Pais::getPais).findAny()
				.orElse("null");

		System.out.printf("%s{%s, %s}\n", res.getClass().getSimpleName(), res.getSigla(), res.getPais());
		System.out.println(res2);

		List<String> pais = paises.stream().map(Pais::getPais).collect(Collectors.toList());
		pais.forEach(System.out::println);

		List<String> res3 = paises.stream().map(x -> x.getSigla() + " - " + x.getPais()).collect(Collectors.toList());
		System.out.println(res3);

	}

	public static void t3() {
		List<String> nomes = Arrays.asList("luiz", "filipy", "araujo");

		List<String> nomesM = nomes.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nomesM);

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> res = num.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(res);
	}

	public static void t4() {
		List<Pais> paises = Arrays.asList(new Pais("BR", "Brasil"), new Pais("FR", "França"),
				new Pais("EUA", "Estados Unidos da America"));

		List<Pais> res = paises.stream().map(temp -> {
			Pais p = new Pais();
			p.setSigla(temp.getSigla());
			p.setPais(temp.getPais());

			if ("BR".equals(temp.getSigla())) {
				p.setPais("Brasil sil sil sil sil!");
			}
			return p;
		}).collect(Collectors.toList());

		res.forEach(r -> {
			System.out.printf("%s{%s, %s}\n", r.getClass().getSimpleName(), r.getSigla(), r.getPais());
		});
	}

	public static void t5() {
		List<String> nomes = Arrays.asList("luiz", "luiz", "luiz", "luiz", "filipy", "brasil", "brasil", "filipy",
				"filipy", "filipy", "luiz");

		Map<String, Long> res = nomes.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(res);

		Map<String, Long> nomes1 = new LinkedHashMap<String, Long>();
		res.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(r -> {
			nomes1.put(r.getKey(), r.getValue());
		});
		System.out.println(nomes1);
	}

	public static void t6() {
		List<Pais> paises = Arrays.asList(new Pais("BR", "Brasil", 2), new Pais("BR", "Brasil", 2),
				new Pais("BR", "Brasil", 2), new Pais("FR", "França", 3), new Pais("FR", "França", 6),
				new Pais("EUA", "Estados Unidos da America", 7), new Pais("EUA", "Estados Unidos da America", 9),
				new Pais("EUA", "Estados Unidos da America", 2), new Pais("EUA", "Estados Unidos da America", 4));

		Map<String, Long> res = paises.stream().collect(Collectors.groupingBy(Pais::getSigla, Collectors.counting()));
		System.out.println(res);

		Map<String, Integer> soma = paises.stream()
				.collect(Collectors.groupingBy(Pais::getSigla, Collectors.summingInt(Pais::getValor)));
		System.out.println(soma);

		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		System.out.println(counting);

		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

		System.out.println(sum);

		Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(Collectors.groupingBy(Item::getPrice));

		System.out.println(groupByPriceMap);

		Map<BigDecimal, Set<String>> result = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));

		System.out.println(result);
	}

	public static void t7() {
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

//        List<String> result = language.collect(Collectors.toList());

//        List<String> result = language.filter(x -> x!=null).collect(Collectors.toList());
		List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	public static void t8() {
		Stream<String> language = Stream.of("java", "python", "node");

		// Convert a Stream to List
		List<String> result = language.collect(Collectors.toList());

		result.forEach(System.out::println);
	}
	
	public static void t9() {
		String[] array = {"a", "b", "c", "d", "e"};

        //Arrays.stream
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(x -> System.out.println(x));

        //Stream.of
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {
//		Streams.t1();
//		Streams.t2();
//		Streams.t3();
//		Streams.t4();
//		Streams.t5();
//		Streams.t6();
//		Streams.t7();
//		Streams.t8();
		Streams.t9();
	}
}
