package com.capgemini.assignment.first;

public class Factorial {
	public static void main(String[] args) {
		int val = fact(5);
		System.out.println(val);

	}

	static int fact(int i) {
		int f = 1;
		for (int j = 1; j <= i; j++) {
			f = f * j;
		}
		return f;

	}

}
