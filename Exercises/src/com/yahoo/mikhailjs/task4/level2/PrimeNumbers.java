/*
 * 2) С помощью циклов вывести на экран все простые числа от 1 до 100.
 * Первые простые числа это — 2,3,5,7...
 */
package com.yahoo.mikhailjs.task4.level2;

public class PrimeNumbers {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				if (i % j != 0) {
					continue;
				} else if (i != j) {
					break;
				}
				if (i > 2) {
					System.out.print(", ");
				}
				System.out.print(i);
				break;
			}
		}
		System.out.print(".\n");
	}

}
