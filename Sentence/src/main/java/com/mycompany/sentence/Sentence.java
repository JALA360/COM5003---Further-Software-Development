package com.mycompany.sentence;

import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class Sentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for inputting a sentence
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        // Converts user input uppercase letters
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase: " + upperCaseSentence);

        // Count the number of words in the user input
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);

        // Reverse the user input
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed: " + reversedSentence);

        // Check if the user input contains the word Java
        boolean containsJava = sentence.toLowerCase().contains("java");
        System.out.println("Contains 'Java': " + containsJava);

        // Replace all spaces in the user input with underscores ("_")
        String underscoredSentence = sentence.replace(" ", "_");
        System.out.println("Underscored: " + underscoredSentence);

        // Final results
        System.out.println("\nOriginal Sentence: " + sentence);
        System.out.println("Uppercase Sentence: " + upperCaseSentence);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Reversed Sentence: " + reversedSentence);
        System.out.println("Contains 'Java': " + containsJava);
        System.out.println("Underscored Sentence: " + underscoredSentence);

        scanner.close();
    }
}