package com.capgemini.Quiz.day3;

public class TestD {
	public static void main(String[] args) {
		Question4 b1= new Question4(90,"SPICE JET","BUSINESS CLASS");
		b1.printdetails();
		
		System.out.println("------------------------------------");
		
		Question4 b2 = new Question4("KINGFISHER","ECONOMY CLASS");
		b2.printdetails();
		
		System.out.println("------------------------------------");
		
		Question4 b3 = new Question4("BUSINESS CLASS");
		b3.printdetails();
	}

}
