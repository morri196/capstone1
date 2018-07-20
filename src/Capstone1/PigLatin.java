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
			input = input.toLowerCase();//turn input into lower case
			
			
			//find where vowels are
			System.out.println(input.contains("i")); 
			System.out.println(input.indexOf("i")); 
			System.out.println(input.startsWith("i")); 
			
	        //if starts with vowel add way
			//use strings startsWith
			
			System.out.println("Would you like to translate another line? (y/n) : ");
			reTry = scnr.next();
		}	while (reTry.equalsIgnoreCase("y"));
			System.out.println("Thanks for playing! Goodbye.");
		
	//find vowel
	//public static int findVowel(String [] vowels) {
		
	}
}
	

