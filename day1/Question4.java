package com.capgemini.Quiz.day1;

public class Question4 {
	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		if ((a = 1) == b) {     /* Here a value changes to a=1 */
			System.out.println(a);

		} else {
			System.out.println(++a);
		}
	}

}
