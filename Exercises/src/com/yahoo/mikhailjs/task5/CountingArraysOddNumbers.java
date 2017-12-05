package com.yahoo.mikhailjs.task5;

public class CountingArraysOddNumbers {

	public static void main(String[] args) {

		int count = 0;
		int[] array = {0,5,2,4,-7,1,3,19};
		
		for(int number : array) {
			count += Math.abs(number) % 2;
		}
		System.out.println(String.format("Array contains %d odd numbers.", count));
	}

}
