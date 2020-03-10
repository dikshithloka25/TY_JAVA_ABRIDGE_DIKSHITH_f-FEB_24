package com.capgemini.assignment.second;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
	
		/*
		 * int age; String ename; String Address; Double phno; String mail;
		 */	Scanner sc=new Scanner(System.in);
	while (true){
		System.out.println("Choose  1 for Name");
		System.out.println("Choose 2 for Age");
		System.out.println("choose 3 for Address");
		System.out.println("choose 4 for phone number");
		System.out.println("choose 5 for Email");
		System.out.println("choose 6 for Exit");
		
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Enter your Name :");
		String	ename=sc.next();
		System.out.println(ename);

			break;
		case 2:
			System.out.println("Enter your Age :");
			int age=sc.nextInt();
			break;
		case 3:
			System.out.println("Enter your Address :");
			String Address=sc.next();
			break;
		case 4:
			System.out.println("Enter your Phone Number :"
					+ "");
			Double phno=sc.nextDouble();
			break;
		case 5:
			System.out.println("Enter your Email :");
			String mail=sc.next();
			break;
		case 6:
			System.out.println("Exit........Thank you!!!");
			
		
				
		}
		
		
		
		
	}
	
	
	
}
	

}
	
	


