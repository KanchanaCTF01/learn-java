package com.buzzfreeze.javaPart1;

public class Lab3 {

	public static void main(String[] args) {
		
		unaryOperators();
		System.out.println("--------------------------------");
		conditionalOperators();
	}
	
	public static void unaryOperators() {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("i++ 5 times = "+i);
		System.out.println("--------------------------------");
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println("--i 5 times = "+i);
	}
	
	public static void conditionalOperators() {
		
		float x = 56.9f;
		float xt = 56.5f;
		char y = '\u9999';
		char yt = '\u0001';
		
		if (( x != xt) && ( x == 56.9f ))
			System.out.println(true);
		
		if (( yt == 0001) || (y == yt)) 
			System.out.println(true);
		
	}

}
