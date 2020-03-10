package com.capgemini.Quiz.day2;

public class Question6 {
	public static void main(String[] args) {
		int result;
		result = square();
		System.out.println("Squared value of 10 is: " + result);
	}

	static int square() {
		int a;
		int b = 10;
		a = b * b;

		return a;
	}

}
