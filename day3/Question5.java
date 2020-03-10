package com.capgemini.Quiz.day3;

public class Question5 {
	
		
		String name;
		long accountno;
		double accbalance;
		static String bankname;/*we use static as
		                         it is common 
		                         to all account holders*/
		
		
		void printdetails() {
			
			System.out.println("name "+name);
			System.out.println("account number "+accountno);
			System.out.println("account balance " +accbalance);
			System.out.println("bank name " +bankname);
		}
		

}
