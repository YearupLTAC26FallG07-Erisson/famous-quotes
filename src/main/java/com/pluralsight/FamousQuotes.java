package com.pluralsight;

import java.util.*;

public class FamousQuotes {
    public static void main(String[] args) {

        String[] quotes = {
                "The only way to do great work is to love what you do.",
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Your time is limited, don't waste it living someone else's life.",
                "The future belongs to those who believe in the beauty of their dreams.",
                "In the middle of difficulty lies opportunity.",
                "Do what you can, with what you have, where you are.",
                "It always seems impossible until it's done.",
                "Creativity is intelligence having fun.",
                "Don't count the days, make the days count.",
                "Believe you can and you're halfway there."
        };

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        // Loop keeps the program running until keepRunning is set to false
        while (keepRunning) {
            try {
                System.out.print("Select a number between 1 and 10: ");
                int index = scanner.nextInt();

                System.out.println("Your quote is: " + quotes[index - 1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: That quote number does not exist! Please choose between 1 and 10.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! You must enter a number.");
                scanner.next(); // Clear the bad input out of the scanner memory
            }

            // Ask the user if they want to see another saying
            System.out.print("\nDo you want to see another quote? (yes/no): ");
            String response = scanner.next();

            // If they type anything other than "yes", the loop stops
            if (!response.equalsIgnoreCase("yes")) {
                keepRunning = false;
            }
            System.out.println(); // Prints a blank line for clean spacing
        }

        System.out.println("Thank you for using the program! Goodbye.");
    }
}
