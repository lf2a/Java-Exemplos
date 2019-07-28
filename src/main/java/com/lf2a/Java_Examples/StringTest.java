package com.lf2a.Java_Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) throws IOException {
		String text = "Hello My Name Is Luiz!";
		System.out.println(text);
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.length());
		System.out.println(text.replaceAll("Luiz", "Filipy"));
		System.out.println(text.substring(6));

		String test = "";
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			test = test + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("tempo total: " + (endTime - beginTime));
//		System.out.println(test);

		StringBuilder sb = new StringBuilder("");
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("tempo total: " + (endTime - beginTime));
//		System.out.println(sb);

		String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nec venenatis libero\n"
				+ " Aliquam quis lectus suscipit, ultrices ipsum lectus quis, egestas tortor.\n";
		for (int i = 0; i < text1.length(); i++) {
			System.out.print(text1.charAt(i));
		}

		System.out.println("\nindexOf: " + text1.indexOf("ipsum"));
		System.out.println("indexOf: " + text1.lastIndexOf("ipsum"));

		char[] charArr = text1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
		}

		String[] files = { "test.txt", "readme.md", "__init__.py", "pom.xml" };
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("txt")) {
				System.out.print(files[i] + " ");
			}
		}
//		or
//		for (String file : files) {
//			if (file.endsWith("txt")) {
//				System.out.println(file + " ");
//			}
//		}
		System.out.println("");

		String str1 = "fly";
		String str2 = "weight";
		String str3 = "flyweight";
		String str4 = null;

		str4 = str1 + str2;
		System.out.println(str3 == str4);

		str4 = (str1 + str2).intern();
		System.out.println(str4);
		System.out.println(str3 == str4);

		String text2 = "luiz filipy";

		String[] tokens = text2.split("i");
		for (String token : tokens) {
			System.out.print(token + " ");
		}
		System.out.println();

		String text3 = "abcdebcadxbc";

		Pattern pattern = Pattern.compile(".bc");
		Matcher matcher = pattern.matcher(text3);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println();

		String phones1 = "Justin 0939-100391\n" + "momor 0939-666888\n";
		Pattern pattern1 = Pattern.compile(".*0939-\\d{6}");
		Matcher matcher1 = pattern1.matcher(phones1);

		while (matcher1.find()) {
			System.out.println(matcher1.group());
		}

		String phones2 = "caterpillar 0952-600391\n" + "bush 0939-550391";
		matcher1 = pattern1.matcher(phones2);

		while (matcher1.find()) {
			System.out.println(matcher1.group());
		}
		//

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("abcdefgabcabc".replaceAll(".bc", "###"));

		String phoneEL = "[0-9]{4}-[0-9]{4}";
		String urlEL = "['\"]?.*?['\"]?.*?";
		String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*" + "@[a-z0-9-]+(.[a-z0-9-]+)*$";

		System.out.print("Phone Number: ");
		String input = br.readLine();

		if (input.matches(phoneEL))
			System.out.println("true");
		else
			System.out.println("false");

		System.out.print("URL: ");
		input = br.readLine();

		if (input.matches(urlEL))
			System.out.println("true");
		else
			System.out.println("false");

		System.out.print("Email: ");
		input = br.readLine();

		if (input.matches(emailEL))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
