package Capstone1;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String input;
		String output;
		String reTry;
		System.out.println("Welcome to the Pig Latin Translator!\n");

		do {
			System.out.println("Please enter a word to be translated: ");
			input = scnr.next();
			input = input.toLowerCase();// turn input into lower case

			// find where vowels are
			if (findFirstVowel(input)) {
				System.out.println(input + "way");// if starts with vowel add way
			} else {
				String part1 = input.substring(0, findIndexVowel(input));
				String part2 = input.substring(findIndexVowel(input));
				System.out.println(part2 + part1 + "ay");
			}

			System.out.println("Would you like to translate another line? (y/n) : ");
			reTry = scnr.next();
		} while (reTry.equalsIgnoreCase("y"));
		
		System.out.println("\n" + "Thanks for playing! Goodbye.");
	}

	public static boolean findFirstVowel(String input) {// find vowel
		if (input.startsWith("a")) {
			return true;
		} else if (input.startsWith("e")) {
			return true;
		} else if (input.startsWith("i")) {
			return true;
		} else if (input.startsWith("o")) {
			return true;
		} else if (input.startsWith("u")) {
			return true;
		} else {
			return false;
		}
	}

	public static int findIndexVowel(String input) {

		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);

			if (letter == 'a') {
				return i;
			} else if (letter == 'e') {
				return i;
			} else if (letter == 'i') {
				return i;
			} else if (letter == 'o') {
				return i;
			} else if (letter == 'u') {
				return i;
			} else {
			}
		}
		return 99;
	}

}
