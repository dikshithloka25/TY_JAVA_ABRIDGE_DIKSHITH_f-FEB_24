package com.capgemini.Quiz.day5;

public class Test7 implements Question7 {

	public String getName(){
        return "test-name";
  }
  public static void main (String[] args){
        Test7 t = new Test7();
        System.out.println(t.getName());
  

}

}
