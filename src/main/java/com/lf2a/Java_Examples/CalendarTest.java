package com.lf2a.Java_Examples;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/"
				+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.getTime());
	}
}
