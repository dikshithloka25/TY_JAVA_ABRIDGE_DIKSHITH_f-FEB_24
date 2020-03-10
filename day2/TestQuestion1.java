package com.capgemini.Quiz.day2;

public class TestQuestion1 {
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		int a = 2;
		double b = 3.2;
		q1.add(a, a);
		q1.add(b, b);
		System.out.println(q1.x + " "+q1.y);
	}

}
