package com.capgemini.Quiz.day1;

public class Question7 {
	public static void main(String[] args) {
		 int i = 0, j = 9; 
	     do { 
	         i++;                    
	         if (j-- < i++) {         /* Here i will be incremented 2 times*/
	             break;       
	         } 
	     } while (i < 5);
	     System.out.println(i + " , " + j); 
	 } 

}
