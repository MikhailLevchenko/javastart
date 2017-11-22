/*
 * 1.) Разобраться с 16-й системой исчисления. Узнать какое
 * число зашифровано в названии группы ACDC.
 */

package com.yahoo.mikhailjs.task1;

public class ValueOfACDC {

	/*
	 * A:10, C:12, D:13;
	 * 
	 * 0xACDC = 12·16⁰+13·16¹+12·16²+10·16³ = 10·4096+12·256+13·16+12 =
	 * 40960+3072+208+12 = 44032+220 = 44252
	 * 
	 * Ответ: 0xACDC = 44252.
	 */

	public static void main(String[] args) {

		System.out.println("Integer Value of ACDC is  " + 0x0000ACDC + ".");
		System.out.println("Short   Value of ACDC is " + 0xFFFFACDC + ".");
	}

}
