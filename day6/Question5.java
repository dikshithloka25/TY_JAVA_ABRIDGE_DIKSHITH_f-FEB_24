package com.capgemini.Quiz.day6;

public class Question5 {
	public String function(String temp,int data) {
		return("Question5");
	}
	private String function(int data,String temp) {
		return("This is pawan kalyan");
	}
	public static void main(String[] args) {
		Question5 q=new Question5();
		System.out.println(q.function(5,"Question5"));
	}
}
