package com.capgemini.assignment.array;

public class TestObj {
public static void main(String[] args) {

	ObjectArray[] b=new ObjectArray[2];
	ObjectArray s1=new ObjectArray(1,"dikshith");
	ObjectArray s2=new ObjectArray(2,"rahul");
	b[0]=s1;
	b[1]=s2;
	display(b);
}
	static void display(ObjectArray[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i].x);
		System.out.println(n[i].y);
		}
	}


}

