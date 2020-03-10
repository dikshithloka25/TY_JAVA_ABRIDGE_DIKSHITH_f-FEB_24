package com.capgemini.Quiz.day3;

public class Question4 {
	int seats;
	String name;
	String level;
	Question4(int seats,String name,String level){
		this.seats = seats;
		this.name=name;
		this.level=level;
		
	}
	Question4(String name,String level){
		this(70,name,level);
	}
	Question4(String level){
		this(80,"INDIGO",level);
	}
	void printdetails() {
		System.out.println("WELCOME TO AIRLINES");
		System.out.println("seats :"+seats);
		System.out.println("COMPANY NAME :"+name);
		System.out.println("CLASS  :"+level);
	}
}
