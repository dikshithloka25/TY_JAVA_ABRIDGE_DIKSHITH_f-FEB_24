package com.capgemini.Quiz.day6;

public class Question1 {
	 double width, height, depth; 
	  
	    // constructor used when all dimensions 
	    // specified 
	    Question1 (double w, double h, double d) 
	    { 
	        width = w; 
	        height = h; 
	        depth = d; 
	    } 
	  
	    // constructor used when no dimensions 
	    // specified 
	    Question1 () 
	    { 
	        width = height = depth = 0; 
	    } 
	  
	    // constructor used when cube is created 
	    Question1 (double len) 
	    { 
	        width = height = depth = len; 
	    } 
	  
	    // compute and return volume 
	    double volume() 
	    { 
	        return width * height * depth; 
	    } 

	// Driver code 
		
		
	    public static void main(String args[]) 
	    { 
	        // create boxes using the various 
	        // constructors 
	    	Question1  mybox1 = new Question1 (10, 20, 15); 
	    	Question1  mybox2 = new Question1 (); 
	    	Question1  mycube = new Question1 (7); 
	  
	        double vol; 
	  
	        // get volume of first box 
	        vol = mybox1.volume(); 
	        System.out.println(" Volume of mybox1 is " + vol); 
	  
	        // get volume of second box 
	        vol = mybox2.volume(); 
	        System.out.println(" Volume of mybox2 is " + vol); 
	  
	        // get volume of cube 
	        vol = mycube.volume(); 
	        System.out.println(" Volume of mycube is " + vol); 
	    } 

}
