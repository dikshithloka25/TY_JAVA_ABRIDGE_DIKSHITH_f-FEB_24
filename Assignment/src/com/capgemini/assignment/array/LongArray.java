package com.capgemini.assignment.array;

public class LongArray {
	public static void main(String[] args) {
		System.out.println("Teachers mobile numbers ");
		long[] tecMobNo = teachersMobileNo();
		printMobileno(tecMobNo);
		System.out.println("*********************************************");

		System.out.println("Students mobile numbers ");
		long[] stuMobNo = studentsMobileNo();
		printMobileno(stuMobNo);

	}

	static void printMobileno(long[] n) {

		for (int i = 0; i < n.length; i++) {

			System.out.println(n[i]);
		}

	}

	static long[] studentsMobileNo() {
		long[] mobileno = { 9899908791l, 9848714080l, 9995544679l };
		return mobileno;

	}

	static long[] teachersMobileNo() {
		long[] mobileno = { 9891254291l, 9887914080l, 9290465469l };
		return mobileno;

	}

}
