package com.capgemini.Quiz.day3;

public class Question1 {
 int id;
 String name;
 int age;
 
 Question1(int id,String name,int age){
	 this.id = id;
	 this.name = name;
	 this.age = age;
 }
 Question1(int id,String name){
	 this.id = id;
	 this.name = name;
 }
 void printdetails() {
	 System.out.println("ID :"+id);
	 System.out.println("name :"+name);
	 if(age!=0) {
	 System.out.println("Age :"+age);
 }
	 }
 
}
