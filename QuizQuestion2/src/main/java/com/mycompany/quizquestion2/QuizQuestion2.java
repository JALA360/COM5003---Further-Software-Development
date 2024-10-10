/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizquestion2;

import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class QuizQuestion2 {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the speed of the car
        System.out.print("Enter the speed of the car: ");
        int speed = scanner.nextInt();

        // Check if the speed is within the safe range
        if (speed >= 40 && speed <= 80) {
            System.out.println("safe");
        } else if (speed < 40) {
            System.out.println("under speed");
        } else {
            System.out.println("overspeed");
        }
        scanner.close();
    }
}