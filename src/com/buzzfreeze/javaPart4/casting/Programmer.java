package com.buzzfreeze.javaPart4.casting;

public class Programmer extends Employee  implements IWebsiteCreator {

	
	public Programmer(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
		
	}

	public void createWebsite(String template, String titileName) {


	}

	public void installWindows(String version, String productKey) {

	}

//  -> salary cannot use in this class
//	public int getSalary() {
//		return salary;
//	}

	public class Progarmmer2 {
		public String firstname;
		public String lastname;
		private int salary;

		public Progarmmer2() {
			this.firstname = "Kan";
			this.lastname = "Saen";
			this.salary = 9000; // default salary
		}

		public Progarmmer2(String firstnameInput, String lastnameInput) {
			this(); // default salary
			this.firstname = firstnameInput;
			this.lastname = lastnameInput;

		}

		public Progarmmer2(String firstnameInput, String lastnameInput, int salaryInput) {
			this.firstname = firstnameInput;
			this.lastname = lastnameInput;
			this.salary = salaryInput;
		}

	}

}
