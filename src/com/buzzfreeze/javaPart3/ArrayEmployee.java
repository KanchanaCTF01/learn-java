package com.buzzfreeze.javaPart3;

public class ArrayEmployee {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("Name" + i, "Lastname" + i,"CEO"+i , i * 10000);
			System.out.println("I am "+employees[i].firstname +" "+ employees[i].lastname +", my position is " + employees[i].position+", my salary is " + employees[i].getSalary());
		}
		
	}

}
