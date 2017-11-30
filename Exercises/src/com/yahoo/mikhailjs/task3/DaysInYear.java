package com.yahoo.mikhailjs.task3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DaysInYear {

	public static void main(String[] args) {

		int year;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year:");
		while (true) {
			if (sc.hasNextInt()) {
				year = sc.nextInt();
				break;
			} else {
				sc.next(Pattern.compile(".++"));
				System.out.println("Enter integer value:");
				continue;
			}
		}
		sc.close();

		if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) {
			System.out.println("365 days in " + year + " year.");
		} else {
			System.out.println("366 days in " + year + " year.");
		}
	}

}
