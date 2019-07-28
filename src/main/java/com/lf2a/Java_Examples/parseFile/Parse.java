package com.lf2a.Java_Examples.parseFile;

import java.util.ArrayList;

public class Parse {

	private byte comment = 0;

	private String[] keywords = { "path", "file", "nome" };

	private String tempContent = "";
	private int status = 99;

	private ArrayList<String> keyList = new ArrayList<String>();
	private ArrayList<String> valueList = new ArrayList<String>();

	public ArrayList<String> getKey() {
		return keyList;
	}

	public ArrayList<String> getValue() {
		return valueList;
	}

	Parse(String path) {
		getToken(File.read(path));
	}

	private boolean isKeyWord(String str) {

		for (String string : keywords) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}

	private void getToken(char[] c) {
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case '/':
				comment = (c[i += 1] == '*') ? (byte) 2 : (byte) 0;
				if (comment == 0) {
					tempContent += "/";
				}
				break;
			case '*':
				comment = (c[i += 1] == '/') ? (byte) 0 : (byte) 2;
				if (comment == 2) {
					tempContent += "*";
				}
				break;
			case '"':
				break;
			case '(':
				status = 10;
				break;
			case ')':
				if (comment != 2) {
					if (isKeyWord(tempContent.toLowerCase())) {
						keyList.add(tempContent.toLowerCase());
					} else {
						System.err.println("Keyword Not Allowed");
						System.exit(0);
					}
				}
				tempContent = "";
				status = 20;
				break;
			case '[':
				status = 10;
				break;
			case ']':
				if (comment != 2) {
					valueList.add(tempContent);
				}
				tempContent = "";
				status = 20;
				break;
			default:
				if (status != 20) {
					if (comment != 2) {
						if (c[i] != '\n') {
							tempContent += String.valueOf(c[i]);
						}
					}
				}
				break;
			}
		}
	}

	/*
	 * test
	 */
	public static void main(String[] args) {
		Parse p = new Parse("path");

		for (int i = 0; i < p.keyList.size(); i++) {
			System.out.println("key: " + p.keyList.get(i));
			System.out.println("value: " + p.valueList.get(i));
			System.out.println();
		}
	}
}
