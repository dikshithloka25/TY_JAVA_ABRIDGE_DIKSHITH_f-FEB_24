package com.capgemini.Quiz.day6;

public class Question3 {
	private String function() {
		return ("i am the king maker");
	}
	/* it cannot be overridden in private to public
	 * 
	 */
	public final static String function(int data) {
		return("This is Question3");
	}
	public static void main(String[] args) {
		Question3 q=new Question3();
		System.out.println(q.function());
	}

}
