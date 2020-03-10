package com.capgemini.Quiz.day2;

public class Question3 {
	     
	    String name; 
	    long modelno;
	    int cost;
	    
	    
	    
	 
	    Question3(String name, long modelno,int cost) 
	    { 
	    	System.out.println("car available");
	        this.name = name; 
	        this.modelno = modelno;
	        this.cost = cost;
	        
	    } 
	    void printcardetails() {
	    	System.out.println("name : " +name);
	    	System.out.println("model : " +modelno);
	    	System.out.println("cost : "+cost);
	    }
	} 


