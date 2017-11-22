/*
 * 1) Написать программу которая считывает 5-и значное число 
 * с клавиатуры и выводит цифры из которого оно состоит.
 * Например : Считывается число 54698
 * Выводиться:
 * 5
 * 4
 * 6
 * 9
 * 8
 */

package com.yahoo.mikhailjs.task2;

import java.util.Scanner;

public class PrintingFiveDigits {

	public static void main(String[] args) {

		int number;
		int fiveDigits;
		Scanner sc = new Scanner(System.in);

		System.out.println("*Prints the five digits number\n"
            + "*or last five digits :)");
		System.out.println(" Enter the number:");
		number = sc.nextInt();
		fiveDigits = Math.abs(number % 100000);
		System.out.println("So I can print this " + fiveDigits
            + ", from Yours " + number + " number.");
		System.out.println(fiveDigits / 10000);
		System.out.println(fiveDigits / 1000 % 10);
		System.out.println(fiveDigits / 100 % 10);
		System.out.println(fiveDigits / 10 % 10);
		System.out.println(fiveDigits % 10);
		sc.close();
	}

}
