package com.yahoo.mikhailjs.task6;

import java.util.Arrays;

public class MaxIntFromArray {

	public static int getMaxValue(int[] array) {

		int max = array[0];

		for (int i : array) {
			if (i < max) {
				continue;
			}
			max = i;
		}
		return max;
	}

	public static void main(String[] args) {

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (10000 * Math.random());
		}
		System.out.println(Arrays.toString(array));
		System.out.println("max " + getMaxValue(array));
	}
}
