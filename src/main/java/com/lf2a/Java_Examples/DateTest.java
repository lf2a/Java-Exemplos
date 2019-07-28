package com.lf2a.Java_Examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());

		DateFormat dateFormat = new SimpleDateFormat("EE-MM-dd-yyyy-HH-mm-ss");

		System.out.println(dateFormat.format(date));
	}
}
