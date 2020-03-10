package com.capgemini.Quiz.day3;

public class Question6 {
	
       double overloadedMethod(double d)
    {
        return d *= d;
    }
     
    int overloadedMethod(int i)               /*it is continueous looping 
    											show recursive error*/
    {
        return overloadedMethod(i *= i);
    }
     
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
     
    public static void main(String[] args)
    {
    	Question6 main = new Question6();
         
        System.out.println(main.overloadedMethod(100));
    }
}
