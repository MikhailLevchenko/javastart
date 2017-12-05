package com.yahoo.mikhailjs.task5;

import java.util.Scanner;

public class CharsInString {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input string for letter 'b' counting.");
		for (char i : sc.nextLine().toCharArray()) {
			if (i == 'b') {
				count += 1;
			}
		}
		System.out.println("Character 'b' retries " + count + " times.");
		sc.close();
	}

}
