package com.capgemini.Quiz.day4;

public class Question5_1 {
	Question5 op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Question5();
		int rsquare = op.square(radius);// code reusability.
		return pi * rsquare;
	}

}
