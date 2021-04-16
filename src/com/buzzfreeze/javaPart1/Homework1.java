package com.buzzfreeze.javaPart1;

public class Homework1 {

	public static void main(String[] args) {
		System.out.println("Method return int = " + sumNum(0, 100));
		System.out.println("-----------------------------------");
		compareNum(3, 0);

	}

	public static int sumNum(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void compareNum(int t1, int t2) {
		if (t1 > t2) {
			System.out.println(t1 + " > " + t2);

		} else if (t1 < t2) {
			System.out.println(t1 + " < " + t2);

		} else {
			System.out.println(t1 + " = " + t2);
		}

	}

}
