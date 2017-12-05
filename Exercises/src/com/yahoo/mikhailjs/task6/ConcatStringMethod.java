/*
 * 2) Реализуйте метод параметрами которого являются:
 * целое число, вещественное число и строка.
 * Возвращает он конкатенацию строки с
 * суммой вещественного и целого числа.
 */
package com.yahoo.mikhailjs.task6;

public class ConcatStringMethod {

	public static void main(String[] args) {
		System.out.println(concat(5, 18.75, "Test"));
	}

	public static String concat(int x, double d, String s) {
		s = s + (d + x);
		return s;
	}
  
}
