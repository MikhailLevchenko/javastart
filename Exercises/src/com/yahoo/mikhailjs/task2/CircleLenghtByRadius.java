/*
 * 3.)Написать программу которая вычислит и выведет на экран
 * длину окружности, если ее радиус считывается с клавиатуры.
 */

package com.yahoo.mikhailjs.task2;

import java.util.Scanner;

public class CircleLenghtByRadius {

	public static void main(String[] args) {
		double radius;
		double lenght;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Enter the Circle radius:");
		radius = sc.nextDouble();
		lenght = 2 * radius * Math.PI;
		System.out.println("Circle lenght " + lenght);
		sc.close();
	}

}
