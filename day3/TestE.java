package com.capgemini.Quiz.day3;

public class TestE {

	public static void main(String[] args) {
		Question5 s1 = new Question5();
		s1.name = "dikshith";
		s1.accountno = 20434610935l;
		s1.accbalance = 640000;
		Question5.bankname = "S B I";
		s1.printdetails();
		System.out.println("************************");

		Question5 s2 = new Question5();
		s2.name = "bharath";
		s2.accountno = 1029876054l;
		s2.accbalance = 38000000;

		s2.printdetails();
		System.out.println("************************");
	}

}
