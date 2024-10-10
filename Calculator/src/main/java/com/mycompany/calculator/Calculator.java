/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asks the user to input two numbers
            // Asks for first number
            System.out.print("First number: "); // User input for first integer
            double num1 = scanner.nextDouble(); // Gets user input
            
            // Asks for second number
            System.out.print("Second number: "); // User input for second integer
            double num2 = scanner.nextDouble(); // Gets user input

            // Ask the user to choose an operation
            System.out.println("Choose an operation: "); // User input for chosen operation
            System.out.println("1.(+) 2.(-) 3.(*) 4.(/)"); // Operation options
            int choice = scanner.nextInt(); // Gets user input

            // Perform the operation
            double result = 0; // Variable to store result
            switch (choice) {
                case 1:
                    result = num1 + num2; // Sum for addition for the 2 numbers
                    System.out.println("Result: " + result); // Outputs operation answer
                    break;
                case 2:
                    result = num1 - num2; // Sum for subtracting for the 2 numbers
                    System.out.println("Result: " + result); // Outputs operation answer
                    break;
                case 3:
                    result = num1 * num2; // Sum for multiplying for the 2 numbers
                    System.out.println("Result: " + result); // Outputs operation answer
                    break;
                case 4:
                    if (num2 != 0) { // Checks user input for the number zero
                        result = num1 / num2; // Sum for division for the 2 numbers
                        System.out.println("Result: " + result); // Outputs operation answer
                    } else {
                        System.out.println("Dividing by zero is not possible."); // Informs user that division by zero is not possible
                    }
                    break;
                default:
                    System.out.println("Invalid choice."); // Handles invalid operation input
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only."); // Handles non-numeric input
        } finally {
            scanner.close(); // Close scanner
        }
    }
}
