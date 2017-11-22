/*
 * 2)Написать программу которая вычислит и выведет на экран
 * площадь треугольника если известны его стороны.
 */

package com.yahoo.mikhailjs.exercses.task2;

public class SquareByThreeSides {

	public static void main(String[] args) {

		double a = 3;
		double b = 4;
		double c = 5;
		double p;
		double square;

		p = (a + b + c) / 2;
		square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.print("Sides A " + a + "cm,");
		System.out.print(" B " + b + "cm,");
		System.out.println(" C " + c + "cm.");
		System.out.println("Square of triangle ABC " + square + "cm².");
	}

}
