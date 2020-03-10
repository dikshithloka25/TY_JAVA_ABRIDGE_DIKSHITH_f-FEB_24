package com.capgemini.Quiz.day6;

public class Question4 {
	public int getData() {//For method overloading,methods must have different 
		// signatures
		return 0;
	}

	public long getData1() {
		return 1;
	}

	public static void main(String[] args) {
		Question4 q = new Question4();
		System.out.println(q.getData());
	}

}
