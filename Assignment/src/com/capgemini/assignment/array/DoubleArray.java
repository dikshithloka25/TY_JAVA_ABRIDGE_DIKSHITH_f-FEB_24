package com.capgemini.assignment.array;

public class DoubleArray {
	public static void main(String[] args) {
		System.out.println("Btech semester wise percentages of RAJ");
		double[] raj = rajPercentages();
		printPercentages(raj);
		System.out.println("**************************");
		System.out.println("Btech semester wise percentages of RAVI");
		double[] ravi = raviPercentages();
		printPercentages(ravi);

	}

	static void printPercentages(double[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

	static double[] rajPercentages() {
		double[] percentages = { 64.21, 68.42, 74.31, 78.46 };
		return percentages;
	}

	static double[] raviPercentages() {
		double[] percentages = { 68.21, 74.42, 98.01, 89.46 };
		return percentages;
	}

}