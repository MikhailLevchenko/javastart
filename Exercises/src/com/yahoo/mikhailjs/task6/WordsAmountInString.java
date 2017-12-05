package com.yahoo.mikhailjs.task6;

public class WordsAmountInString {

	public static int count(String s) {

		int summa = 0;

		for (String i : s.split("[.,:\" ]")) {
			if (!i.isEmpty()) {
				summa += 1;
			}
		}
		
		return summa;
	}

	public static void main(String[] args) {

		String quote = "Larry Wall: " 
				+ "\"Real programmers " 
				+ "can write assembly " 
				+ "code in any language.\"";
		
		System.out.println(quote);
		System.out.println("\nQuote contains "+count(quote)+" words.");
	}
}
