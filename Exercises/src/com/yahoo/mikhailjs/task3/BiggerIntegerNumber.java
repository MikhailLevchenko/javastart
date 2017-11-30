package com.yahoo.mikhailjs.task3;

import java.util.Scanner;

public class BiggerIntegerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1;
		int x2;
		int max;

		System.out.println("Enter the first number:");
		x1 = getNum(sc);
		System.out.println("Enter the second number:");
		x2 = getNum(sc);
		if (x2 > x1) {
			max = x2;
		} else {
			max = x1;
		}

		int y1;
		int y2;

		System.out.println("Enter the third number:");
		y1 = getNum(sc);
		System.out.println("Enter the fourth number:");
		y2 = getNum(sc);
		if (y2 > y1) {
			if (y2 > max) {
				max = y2;
			}
		} else {
			if (y1 > max) {
				max = y1;
			}
		}

		System.out.println(String.format("Your numbers: %d, %d, %d, %d.", x1, x2, y1, y2));
		System.out.println(String.format("And the more of them is: %d.", max));
        
		sc.close();
	}

	private static int getNum(Scanner sc) {

		while (true) {
			if (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter the number:");
				continue;
			}
			return sc.nextInt();
		}
	}

}
