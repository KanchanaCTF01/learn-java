package com.buzzfreeze.javaPart1;

public class Lab2 {
	public static void main(String [] args) {
		bark();
		System.out.println("----------------------------");
		convertPrimitive();
		System.out.println("----------------------------");
		assignedFinal();
		
	}

	public static void bark() {
		String myDog = "Hong";
		System.out.println("The Dog name = " + myDog);
	}
	
	public static void convertPrimitive() {
		
		int myInt = 20;
		String myString = "Hi";
		boolean myBoolean = true;
		float myFloatNum = 5.69999996f;
		char myChar = '\u1233';		
		double myDouble =5.4d;
				
		System.out.println("This is a int : " + myInt);
		System.out.println("This is a String : " + myString);
		System.out.println("This is a boolean : " + myBoolean);
		System.out.println("This is a float : " + myFloatNum);
		System.out.println("This is a char : " + myChar);
		System.out.println("This is a double : " + myDouble);
		
		System.out.println("----------------------------");
		
		int newInt = (int)myFloatNum;
		float newFloat = myInt;
		//float newDouble = myDouble; ==>cannot convert type
		int newChar = myChar;		
		
		System.out.println("float -> int :" + newInt);		
		System.out.println("int -> float : " + newFloat);
		System.out.println("double -> float //cannot covert");
		System.out.println("char -> int : " + newChar);
		

	}
	public static void assignedFinal() {
		
		final String hello ="Hello";
		
		//hello ="World"; ==>the final local variable cannot be assigned.
		
		System.out.println("This is a final " + hello);
	
	}

}
