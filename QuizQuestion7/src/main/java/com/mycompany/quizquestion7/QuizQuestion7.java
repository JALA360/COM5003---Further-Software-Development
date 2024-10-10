package com.mycompany.quizquestion7;

import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class QuizQuestion7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for pressure and temperature
        System.out.print("Enter pressure: ");
        double pressure = scanner.nextDouble();

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        // Check user input for pressure and temperature
        if (pressure >= 150 && temperature >= 700) {
            System.out.println("High risk");
        } else {
            System.out.println("Normal");
        }
        scanner.close();
    }
}