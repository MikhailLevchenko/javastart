package com.yahoo.mikhailjs.task6;

public class SearchInArray {

	public static int search(int n, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 2, 4, 5, 0, 9, 7 };
		int a = 0;
		int index;

		for (int i = 0; i <= 10; i++) {
			index = search(a, array);
			if (index != -1) {
				System.out.println(index + " index for number " + a);
			} else {
				System.out.println(a + " not found.");
			}
			a = (int) (Math.random() * 10);
		}
	}
  
}
