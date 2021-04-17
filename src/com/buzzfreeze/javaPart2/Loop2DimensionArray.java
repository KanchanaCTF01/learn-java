package com.buzzfreeze.javaPart2;

public class Loop2DimensionArray {

	public static void main(String[] args) {
		System.out.println("---------8.1----------");
		loop2Array1();
		System.out.println("---------8.2----------");
		loop2Array2();

	}

	public static void loop2Array1() {
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int[] row : myArray) {
			for (int element : row) {
				System.out.println(element);
			}
		}
	}

	public static void loop2Array2() {
		int sum = 1;
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int row = 0 ; row < myArray.length; row++){ 
			for (int element = myArray[row].length-1; element < myArray[row].length; element++) {
				sum *= myArray[row][element];
			}
		}
     System.out.println(sum);
	}
}
