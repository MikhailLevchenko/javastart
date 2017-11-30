package com.yahoo.mikhailjs.task4;

import java.util.Scanner;

public class Strips {

	public static void main(String[] args) {

		int ROWS = 5;
		int strips;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter strips count:");
		while (true) {
			if (sc.hasNextInt()) {
				strips = sc.nextInt();
				break;
			} else {
				sc.next(".++");
				System.out.println("Enter integer number:");
				continue;
			}
		}
		System.out.print("\n");

		int row = 1;

		do {
			row++;
			System.out.print("\t");
			for (int strip = 1; strip <= strips; strip++) {
				if (strip % 2 == 1) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.print("\n");
		} while (row <= ROWS);

		sc.close();
	}

}
