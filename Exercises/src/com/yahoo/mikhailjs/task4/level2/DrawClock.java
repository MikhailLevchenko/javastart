/*
 * 3) Выведите на экран «песочные часы» максимальная ширина которых
 * считывается с клавиатуры (число нечетное).
 * 
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 
 * В примере ширина равна 5.
 */
package com.yahoo.mikhailjs.task4.level2;

import java.util.Scanner;

public class DrawClock {

	public static void main(String[] args) {
		int width;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width:");
		width = getMaxWidth(sc);

		for (int i = 0; i <= width; i++) {
			if (width - i == width / 2) {
				continue;
			}
			for (int k = 1; k <= width; k++) {
				if ((k <= i) ^ (k > width - i)) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	private static int getMaxWidth(Scanner sc) {
		int width;
		while (true) {
			if (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter integer value:");
				continue;
			}
			width = sc.nextInt();
			if (width % 2 == 0 || width < 3) {
				System.out.println("Enter odd number 3, 5, 7..:");
				continue;
			}
			break;
		}
		return Math.abs(width);
	}
}
