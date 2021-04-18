package com.buzzfreeze.javaPart4.casting;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	public static void main(String[] args) {
		Employee em1 = new Employee("Kanchana", "Saengdaeng", "CEO", 30000);
		em1.checkPosition();
	}

	public Employee(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		position = positionInput;
		salary = salaryInput;
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println("My position is " + position);
	}

}
