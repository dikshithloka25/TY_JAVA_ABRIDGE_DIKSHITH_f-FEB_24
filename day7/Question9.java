package com.capgemini.Quiz.day7;

public abstract class Question9 {
	private int a,b;
	public void call(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
}
