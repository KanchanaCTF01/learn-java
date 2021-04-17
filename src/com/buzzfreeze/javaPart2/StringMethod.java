package com.buzzfreeze.javaPart2;

public class StringMethod {

	public static void main(String[] args) {
		System.out.println("-------- 7.1 ----------");
		StringEqual();
		System.out.println("-------- 7.2 ----------");
		StringContain();
		System.out.println("-------- 7.3 ----------");
		StringLength();
		System.out.println("-------- 7.4 ----------");
		StringSubstring();
		System.out.println("-------- 7.5 ----------");
		StringTrim();
		System.out.println("-------- 7.6 ----------");
		StringToUpperCase();
		System.out.println("-------- 7.7 ----------");
		StringChaining();

	}

	public static void StringEqual() {
		String string1 = "You and Me";
		String string2 = "you and me";

		if (string1.equals(string2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

	public static void StringContain() {
		String myWord = "Kanchana Seangdaeng";
		String check = "Kan";

		if (myWord.contains(check))
			System.out.println(check);
	}

	public static void StringLength() {
		String myWord = "Kanchana Seangdaeng";
		System.out.println(myWord.length());
	}

	public static void StringSubstring() {
		String myWord = "Kanchana Seangdaeng";
		System.out.println(myWord.substring(4));
	}

	public static void StringTrim() {
		String myWord = "     Kanchana Seangdaeng    ";
		System.out.println(myWord.trim());
	}

	public static void StringToUpperCase() {
		String myWord = "Kanchana Seangdaeng";
		System.out.println(myWord.toUpperCase());
	}

	public static void StringChaining() {
		String myWord = "     Kanchana Seangdaeng    ";
		System.out.println(myWord.trim().toUpperCase());
	}

}
