package com.buzzfreeze.javaPart1;

public class Lab4 {

	public static void main(String[] args) {
		controlFlowIf();
		System.out.println("-----------------------------");
		controlFlowBoolean();

	}
	
	public static void controlFlowIf() {
		int score = 49;
		if (score >= 80 ) {
			System.out.println("Good");
		} else if ((score >= 50) && (score < 80)) {
			System.out.println("Normal");
		} else {
			System.out.println("Fail");
		}
	}
	public static void controlFlowBoolean() {
		int score = 49;
		boolean isHandSome = true;
		
		if ((score >= 80 ) || (isHandSome == true)) {
			System.out.println("Good");
		} else if ((score >= 50) && (score < 80)) {
			System.out.println("Normal");
		} else {
			System.out.println("Fail");
		}
	}
		
}

