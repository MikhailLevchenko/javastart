package com.yahoo.mikhailjs.task5;

import java.util.Arrays;
import java.util.Scanner;

public class CreateIntArray {

	public static void main(String[] args) {
		
		int l;
		int[] array;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array length:");
		l=getInt(sc);
		array = new int[l];
		for (int i =0; i<l; i++) {
			System.out.println(String.format("element %d/%d: ",i+1,l));
			while (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter integer value:");
			}
			array[i] = sc.nextInt();
			}
		
		System.out.println("array"+Arrays.toString(array));
		sc.close();
	}

	public static int getInt(Scanner sc) {
		
		int i;
		
		for(;;) {
			while (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter integer value:");
			}
			i = sc.nextInt();
			if (i >= 0) {
				return i;
			}
			System.out.println("Enter positive value:");
		}
	}
}
