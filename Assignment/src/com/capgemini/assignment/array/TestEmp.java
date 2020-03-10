package com.capgemini.assignment.array;

public class TestEmp {
	public static void main(String[] args) {
		
	
	Employee[] emp = new Employee[3];
	Employee e1 = new Employee(1456,"sampath",9505514745l); 
	Employee e2 = new Employee(1987,"sunil",9704448666l);
	Employee e3 = new Employee(1998,"sachin",9298456447l);
	emp[0]=e1;
	emp[1]=e2;
	emp[2]=e3;
	
	System.out.println("IBM Employees");
	System.out.println("---------");
	printEmployeeDetails(emp);
	System.out.println("CAPGEMINI Employees");
	System.out.println("----------");
	Employee[] em = getEmployeeDetails();
	printEmployeeDetails(em);

	
	}
	
	
	static void printEmployeeDetails(Employee[] empl) {

		for (int i = 0; i < empl.length; i++) {
			System.out.println("Employee ID :" + empl[i].empid);
			System.out.println("Employee name:" + empl[i].ename);
			System.out.println("Employee phone no:" + empl[i].empphno);
			System.out.println("**********************");

		}
	}
	
	static Employee[] getEmployeeDetails() {
		Employee[] emp = new Employee[3];
		Employee e1 = new Employee(2001,"sehwag",9501457745l); 
		Employee e2 = new Employee(2002,"rohit",9704448999l);
		Employee e3 = new Employee(2003,"dixith",9298459877l);
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		return emp;
	}
	
	
}