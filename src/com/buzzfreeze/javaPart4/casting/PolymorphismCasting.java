package com.buzzfreeze.javaPart4.casting;

import java.util.ArrayList;

public class PolymorphismCasting {

	public static void main(String[] args) {
		Employee jo = new Employee("Wisanu", "Jeakjan", "HR", 15000);
		Employee kan = new CEO("Kanchana", "Saengdaeng", "CEO", 30000);
		Programmer prog = new Programmer("Malai", "Sukdee", "UX", 40000);
		CEO kan2 = (CEO)kan;
		
		ArrayList<Employee> myEmployeeList = new ArrayList<>();
		myEmployeeList.add(jo);
		myEmployeeList.add(kan2);
		myEmployeeList.add(prog);
		
		Employee jo2 = myEmployeeList.get(0);
		CEO kan3 = (CEO) myEmployeeList.get(1);
		Programmer prog2 = (Programmer) myEmployeeList.get(2);
				
		jo2.hello();
		kan3.hello();
		prog2.hello();

	}

}
