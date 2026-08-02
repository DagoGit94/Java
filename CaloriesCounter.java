/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caloriescounter;

import java.util.Scanner;

/**
 *
 * @author dagoa
 */
public class CaloriesCounter {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Welcome message
        System.out.println("Welcome to Calorie Counter Pro");
        
        // Step 1: Declare variables
        String food1, food2, food3;
        int calories1, calories2, calories3;
        int totalCalories;
        
        // Step 2 Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Step 3: Prompt user for first food item and its calories
        System.out.print("Enter the name of the first food item: ");
        food1 = scanner.nextLine();
        System.out.print("Enter the calories for " + food1 + ": ");
        calories1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Step 4: Prompt user for second food item and its calories
        System.out.print("Enter the name of the second food item: ");
        food2 = scanner.nextLine();
        System.out.print("Enter the calories for " + food2 + ": ");
        calories2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Step 5: Prompt user for third food item and its calories
        System.out.print("Enter the name of the third food item: ");
        food3 = scanner.nextLine();
        System.out.print("Enter the calories for " + food3 + ": ");
        calories3 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Step 6: Calculate total calorie intake
        totalCalories = calories1 + calories2 + calories3;
 
        // Step 7: Display the summary
        System.out.println(" Your Calorie Intake:");
        System.out.println("1. " + food1 + " - " + calories1 + " calories");
        System.out.println("2. " + food2 + " - " + calories2 + " calories");
        System.out.println("3. " + food3 + " - " + calories3 + " calories");
 
        // Step 8: Display total calories
        System.out.println(" Total Calorie Intake: " + totalCalories + " calories");
 
        // Step 9: Thank the user and close Scanner
        System.out.println("Thank you for using Calorie Counter Pro!");
        scanner.close();
        
        
        
    }
}
