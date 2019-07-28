package com.lf2a.Java_Examples;

public class Methods {
	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a = Methods.sum(1, 2, 3, 4);
		System.out.println(a);
	}
}
