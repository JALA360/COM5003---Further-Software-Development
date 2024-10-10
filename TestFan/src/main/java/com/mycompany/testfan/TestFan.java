package com.mycompany.testfan;

import java.util.Scanner;

public class TestFan {

    public static void main(String[] args) {
        // Create a Fan object
        Fan myFan = new Fan();
        Scanner scanner = new Scanner(System.in); // Scanner to read user input

        // User input for if the fan is on or off
        System.out.println("Do you want to turn the fan on? (yes/no): ");
        String userResponse = scanner.nextLine().trim().toLowerCase();

        if (userResponse.equals("yes")) {
            // Turn fan on
            myFan.turnOn();
            System.out.println("Fan is on.");

            // User input for setting a fan speed
            System.out.println("Please enter fan speed (1-5): ");
            int userSpeed = scanner.nextInt(); // User's input

            // Setting fan speed on user input
            myFan.setSpeed(userSpeed);
            System.out.println("Fan is running at speed: " + myFan.getSpeed());
        } else if (userResponse.equals("no")) {
            // End the program if input is NO
            System.out.println("Fan off");
        } else {
            // Invalid input - Input validation
            System.out.println("Invalid input. Enter 'yes' or 'no'.");
        }

        scanner.close();
    }
}