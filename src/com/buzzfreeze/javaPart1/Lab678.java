package com.buzzfreeze.javaPart1;

public class Lab678 {
	public static void main(String[] args) {

		System.out.println("--------------Lab 6---------------");
		whileLoop();
		System.out.println("-----------------------");
		sumNum();
		System.out.println("-----------------------");
		divideNum();
		System.out.println("-----------------------");
		forEeach();

		System.out.println("--------------Lab 7---------------");
		doWhile();
		System.out.println("-----------------------");
		evenOdd();

		System.out.println("--------------Lab 8---------------");
		breakFor();

	}

	// Lab6
	public static void whileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Round " + i);
			i++;
		}
	}

	public static void sumNum() {
		int i = 0;
		int sum = 0;
		while (i < 10) {
			i++;
			sum += i;
		}
		System.out.println("Total is " + sum);
	}

	public static void divideNum() {
		int i = 0;
		while (i < 100) {
			i++;
			if (i % 12 == 0) {
				System.out.println("Evenly divisible by 12 are: " + i);
			}
		}
	}

	public static void forEeach() {
		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int counter : myArray) {
			System.out.println("Counter : " + counter);
		}
	}

	// Lab7
	public static void doWhile() {
		int i = 20;
		do {
			System.out.println("Counter : " + i);
			i--;
		} while (i > 0);
	}

	public static void evenOdd() {
		int i = 2;
		do {
			if (i % 2 == 0) {
				System.out.println(i + " is Odds");
				i++;
			}
			System.out.println(i + " is Evens");

		} while (i % 2 == 0);
	}

	// Lab8
	public static void breakFor() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Counter : " + i);
			if (i == 11)
				break;
		}
		System.out.println("----Break----");
	}
}
