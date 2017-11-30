package com.yahoo.mikhailjs.task4;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width;
		int height;

		System.out.println("Enter border width:");
		width = getInt(sc);
		System.out.println("Enter border height:");
		height = getInt(sc);
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

	private static int getInt(Scanner sc) {
		while (true) {
			if (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter integer value:");
				continue;
			}
			return sc.nextInt();
		}
	}
}
