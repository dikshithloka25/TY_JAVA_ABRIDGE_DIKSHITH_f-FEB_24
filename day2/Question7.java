package com.capgemini.Quiz.day2;

public class Question7 {
	
		int count=0;//will get memory each time when the instance is created  
		  
		Question7(){  
		count++; 
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		
			Question7 c1=new Question7();  
			Question7 c2=new Question7();  
			Question7 c3=new Question7();  
		}  
		}  


