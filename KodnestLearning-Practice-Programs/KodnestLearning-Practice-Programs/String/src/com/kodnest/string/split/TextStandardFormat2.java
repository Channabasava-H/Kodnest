package com.kodnest.string.split;

import java.util.Scanner;

public class TextStandardFormat2 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String input = scanner.nextLine();

// Call the function to capitalize the first letter of each word in the input sentence

String result = capitalizeWords(input);

// Display the formatted sentence

System.out.println("Formatted Sentence: " + result);

}

// Function to capitalize the first letter of each word in a sentence

public static String capitalizeWords(String input) {

// Split the input sentence into words based on spaces and punctuation marks

String[] words = input.split("[\\s\\p{Punct}]+");

// Initialize a StringBuilder to build the formatted sentence

StringBuilder formattedSentence = new StringBuilder();

// Iterate through the words and capitalize the first letter of each

for (String word : words) {

if (!word.isEmpty()) {

char firstLetter = Character.toUpperCase(word.charAt(0));

String restOfWord = word.substring(1).toLowerCase();

formattedSentence.append(firstLetter).append(restOfWord).append(" ");

}

}

// Remove the trailing space and return the formatted sentence

return formattedSentence.toString().trim();

}

}