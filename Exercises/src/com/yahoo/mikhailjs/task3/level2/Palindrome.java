/*
 * 4) С клавиатуры вводиться шестизначное число.
 *  Проверить, является ли оно палиндромом.
 *  
 *  Примечание: палиндромом называется число,
 *  	слово или текст, которые одинакового читаются
 *  	слева направо и справа налево.
 *  Например, это числа 143341, 5555, 7117 и т. д.
 */
package com.yahoo.mikhailjs.task3.level2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Input a six-digit number:");
		n = getInt(sc);
		sc.close();
		int p = n;

		if (n / 100000 == n % 10) {
			n = n / 10 % 10000;
			if (n / 1000 == n % 10) {
				n = n / 10 % 100;
				if (n / 10 == n % 10) {
					System.out.println(p + " number is palindrome.");
					return;
				}
			}
		}
		System.out.println(p + " is six-digit number.");
	}

	private static int getInt(Scanner sc) {
		while (true) {
			if (!sc.hasNext("[0-9]{6}")) {
				sc.next(".++");
				System.out.println("Input a six-digit number:");
				continue;
			}
			return Integer.parseInt(sc.next("[0-9]{6}"), 10);
		}
	}

}
