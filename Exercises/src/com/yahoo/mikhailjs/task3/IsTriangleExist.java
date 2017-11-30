package com.yahoo.mikhailjs.task3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsTriangleExist {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first side:");
		a = getSide(sc);
		System.out.println("Enter the second side:");
		b = getSide(sc);
		System.out.println("Enter the third side:");
		c = getSide(sc);

		System.out.print(String.format(
				"Triangle (%d %d %d)", a, b, c));
		
		if ((b + c > a) & (a + c > b) & (a + b > c)) {
			System.out.println(" exist.");
		} else {
			System.out.println(" not exist!");
		}
		
		sc.close();
	}

	private static int getSide(Scanner sc) {
		
		int side;
		
		while (true) {
			if (sc.hasNextInt()) {
				side = sc.nextInt();
				break;
			} else {
				sc.next(Pattern.compile(".++"));
				System.out.println("Enter integer value:");
				continue;
			}
		}

		return side;
	}

}
