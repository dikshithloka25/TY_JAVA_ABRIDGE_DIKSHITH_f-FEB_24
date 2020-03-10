package com.capgemini.Quiz.day2;

public class TestQuestion10 {
	  public static void main(String args[]) 
	    { 
	      
	       Question10 q1 = new Question10(); 
	        q1.engMarks = 50; 
	        q1.mathsMarks = 80; 
	        q1.phyMarks = 90; 
	        q1.firstsubject();
	  
	   System.out.println("**********************************");    
	        Question10 q2 = new Question10(); 
	        q2.engMarks = 80; 
	        q2.mathsMarks = 60; 
	        q2.phyMarks = 85;
	        q2.secondsubject();
}
}