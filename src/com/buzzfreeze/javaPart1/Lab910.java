package com.buzzfreeze.javaPart1;

public class Lab910 {

	public static void main(String[] args) {
		System.out.println("--------------Lab 9---------------");
		continueFor();
		System.out.println("--------------Lab 10---------------");
		continueLoop();

	}

	// Lab 9
	public static void continueFor() {

		for (int i = 0; i <= 20; i++) {
			System.out.println("Counter :" + i);
			if (i == 11)
				continue;
			System.out.println("Continue, still not working");
		}
	}

	// Lab 10
	public static void continueLoop() {

		for (int i = 1; i <= 10; i++) {
			if (i == 2)
				continue;
			System.out.println("Counter :" + i);
		}
	}
}
