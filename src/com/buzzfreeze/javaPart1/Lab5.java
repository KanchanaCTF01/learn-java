package com.buzzfreeze.javaPart1;

public class Lab5 {

	public static void main(String[] args) {
		switchCase();
	}

	public static void switchCase() {
		int score = 80;
		String scoreString = "";

		switch (score) {
		case 80:
			scoreString = "A";
			break;
		case 70:
			scoreString = "B";
			break;
		case 60:
			scoreString = "C";
			break;
		case 50:
			scoreString = "D";
			break;
		case 40:
			scoreString = "F";
			break;
		default:
			scoreString = "E";
			break;
		}
		System.out.println(scoreString);
	}

}
