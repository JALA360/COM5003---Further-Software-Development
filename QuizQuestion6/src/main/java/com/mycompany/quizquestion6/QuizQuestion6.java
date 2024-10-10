/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizquestion6;

/**
 *
 * @author jacob
 */
public class QuizQuestion6 {

    public static void main(String[] args) {
        // Loop through numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}