package com.buzzfreeze.helloWorld;

public class HelloWorld {
	public static void main(String [] args) {
		test2();
		
	}
	
	public static void bark() {
		String myDog = "Hong";
		System.out.println("The Dog name = " + myDog);
	}
	
	public static void test2() {
		int i = 20;
		float x = 56.9f;
		float xt = 56.5f;
		char y = '\u9999';
		char yt = '\u0001';
		i++; i++; i++; i++; i++;
		System.out.println("i++ 5 times = " + i);
		--i; --i; --i; --i; --i;
		System.out.println("--i 5 time = " + i);
		
		if (( x != xt) && ( x == 56.9f ))
			System.out.println(true);
		
		if (( yt == 0001) || (y == yt))
			System.out.println(true);
		
		

	}
	public static void test1() {
		
		int myInt = 20;
		String myString = "Hi";
		boolean myBoolean = true;
		float myFloatNum = 5.69999996f;
		char myLetter = '\u1233';		
		double myDouble =5.4d;
		final String hello ="Hello";
		
		System.out.println("This is int " + myInt);
		System.out.println("This is String " + myString);
		System.out.println("This is boolean " + myBoolean);
		System.out.println("This is float " + myFloatNum);
		System.out.println("This is char " + myLetter);
		System.out.println("This is double " + myDouble);
		System.out.println("This is final " + hello);
		
		float newFloat = myInt;
		//int newInt = myFloatNum; *connot convert type
		int newChar = myLetter;		
		//float newDouble = myDouble; *connot convert type
	    //hello ="World"; *the final local variable cannot be assigned.
		
		System.out.println("int -> float " + newFloat);
		System.out.println("char -> int " + newChar);
	
	}
}

