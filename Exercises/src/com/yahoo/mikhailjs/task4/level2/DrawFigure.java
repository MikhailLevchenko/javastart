/*
 * 1) С помощью цикла (только одного) нарисовать такую фигуру.
 * 
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 * 
 * Причем максимальная высота этой фигуры вводиться с клавиатуры
 * (в примере максимальная высота - 4)
 */
package com.yahoo.mikhailjs.task4.level2;

import java.util.Scanner;

public class DrawFigure {

	public static void main(String[] args) {
		int maxWidth;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter max width:");
		maxWidth = getMaxWidth(sc);

		int i = 1;
		int j = 1;
		int k;

		k = i;
		while (i < (2 * maxWidth)) {
			if (i > maxWidth) {
				k = maxWidth - i % maxWidth;
			}
			if (j <= k) {
				System.out.print("*");
				j++;
				continue;
			}
			System.out.print("\n");
			k = ++i;
			j = 1;
		}

		sc.close();
	}

	private static int getMaxWidth(Scanner sc) {
		while (true) {
			if (!sc.hasNextInt()) {
				sc.next(".++");
				System.out.println("Enter integer value:");
				continue;
			}
			return Math.abs(sc.nextInt());
		}
	}

}
