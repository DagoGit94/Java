/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinterestcalculator;

import java.util.Scanner;

/**
 *
 * @author dagoa
 */
public class SimpleInterestCalculator {

    public static void main(String[] args) {
         // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);
 
        // Step 2: Prompt user for inputs
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
 
        // Step 3: Calculate simple interest
        double interest = (principal * rate * time) / 100;
 
        // Step 4: Display the result
        System.out.println("Simple Interest: $" + interest);
        
        // Step 5: Close the Scanner object
        scanner.close();
    }
}
