/*
 * Напечатайте таблицу умножения на 5. предпочтительно печатать
 * 1 x 5 = 5, 2 x 5 = 10, а не просто 5, 10 и т. д.
 */
package com.yahoo.mikhailjs.task4;

public class MultipliedByFive {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j < 9) {
					System.out.print(String.format("%d x %d =%2d, ",
                                                                        i, j, j * i));
				} else {
					System.out.print(String.format("%d x %d =%2d.\n",
                                                                        i, j, j * i));
				}
			}
		}
	}
}
