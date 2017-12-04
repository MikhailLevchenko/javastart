package com.yahoo.mikhailjs.task5;

import java.util.Arrays;

public class ExtendsArray {

	public static void main(String[] args) {

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1000 * Math.random());
		}
		System.out.println(Arrays.toString(array));

		int[] array2 = Arrays.copyOf(array, 2 * array.length);
		for (int i = 0; i < array.length; i++) {
			array2[i + array.length] = 2 * array[i];
		}
		
		System.out.println(Arrays.toString(array2));
	}

}
