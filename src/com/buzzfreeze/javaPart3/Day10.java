package com.buzzfreeze.javaPart3;

public class Day10 {

	public static void main(String[] args) {

		CEO kan = new CEO("Kan", "Saen", "CEO", 30000);
		Employee jo = new Employee("Jo", "Jeak", "CFO", 15000);

		System.out.println(
				"My name is " + kan.firstname + " " + kan.lastname +", Position : " + kan.position+ ", Salary : " + kan.getSalary());
		System.out.println(
				"My friend is " + jo.firstname + " " + jo.lastname +", Position : " + jo.position+ ", Salary : " + jo.getSalary());
	}

}
