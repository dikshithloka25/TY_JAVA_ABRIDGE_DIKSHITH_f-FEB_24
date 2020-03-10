package com.capgemini.Quiz.day5;

public class Question3 {
	static{
        System.out.println("static");
  }

  {
        System.out.println("block");
  }

  public Question3 (){
        System.out.println("A");
  }

  public static void main(String[] args){
	  Question3 a = new Question3();
  }

}
