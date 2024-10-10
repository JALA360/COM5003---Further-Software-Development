/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizquestion1;

import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class QuizQuestion1 {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for an integer input
        System.out.print("Enter a value for y: ");
        int y = scanner.nextInt();
        
        // Check if y is between 10 and 30
        if (y >= 10 && y <= 30) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        scanner.close();
    }
}