package com.yahoo.mikhailjs.task4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculateFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int MIN = 1;
		int MAX = 12;
		int fValue;

		System.out.println("Enter number to calculate factorial:");
		while (true) {
			if (sc.hasNextInt()) {
				fValue = sc.nextInt();
				if (fValue > MAX) {
					System.out.println(String.format("Try number less %d:", MAX));
					continue;
				} else if (fValue <= MIN) {
					System.out.println(String.format("Try number more %d:", MIN));
					continue;
				}
				break;
			} else {
				sc.next(Pattern.compile(".++"));
				System.out.println("Enter integer value:");
				continue;
			}
		}
		
		long factorial = fValue;
		
		System.out.print(String.format("%1$d!=%1$d", fValue));
		do {
			factorial *= --fValue;
			System.out.print(String.format("*%d", fValue));
		} while (fValue > 1);
		System.out.print(String.format("=%d", factorial));

		sc.close();
	}

}
