package com.capgemini.assignment.array;

public class Varargs {
	public static void main(String[] args) {
	sum();
	sum(10,20);
	sum(10,40,60,80);
	}
	static void sum(int...a) {
		int total = 0;
for (int x1 : a) {
total = total+x1;	
}
System.out.println("the sum "+total);
	}

}
