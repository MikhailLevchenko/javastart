package com.yahoo.mikhailjs.task3.level2;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter four digit number:");
		n = getInt(sc);

		int d = n % 10;
		int c = n / 10 % 10;
		int b = n / 100 % 10;
		int a = n / 1000;

		int x = a + b;
		int y = c + d;

		a = x / 10;
		b = x % 10;
		c = y / 10;
		d = y % 10;

		if (x == y) {
			System.out.println(n + " is lucky number.");
		} else if (a + b == c + d) {
			System.out.println(n + " is double lucky number.");
		} else {
			System.out.println(n + " is number.");
		}

	}

	private static int getInt(Scanner sc) {
		while (true) {
			if (!sc.hasNext("[0-9]{4}")) {
				sc.next(".++");
				System.out.println("Enter four digit number:");
				continue;
			}
			return Integer.parseInt(sc.next("[0-9]{4}"), 10);
		}
	}

}
