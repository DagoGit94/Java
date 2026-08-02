/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.budgettacker;

import java.util.Scanner;

/**
 *
 * @author dagoa
 */
public class BudgetTacker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double monthlyInc, rent, groceries, transportation, entertainment;
        
        
        System.out.print("Please enter your monthly income ");;
        
        monthlyInc = scanner.nextDouble();
        
        System.out.print("How much is your rent ? ");
        rent = scanner.nextDouble();
        
        System.out.print("How much are your groceries ? ");
        groceries = scanner.nextDouble();
        
        System.out.print("How much is your transportation ? ");
        transportation = scanner.nextDouble();
        
        System.out.print("How much is your entertaiment ? ");
        entertainment = scanner.nextDouble();
        
        double totalExpenses = (rent + groceries + transportation + entertainment);
        double remaining = (monthlyInc - totalExpenses);
        
        double rentPer = Math.round(rent / monthlyInc)*100;
        double groceriesPer = (groceries / monthlyInc)*100;
        double transPer = (transportation / monthlyInc)*100;
        double entertainPer = (entertainment / monthlyInc)*100;
        
        System.out.println("===Budget Tracker===");
        System.out.println("Income : $"+monthlyInc);
        System.out.println("Total Expenses : $"+totalExpenses);
        System.out.println("Remaining budget : $"+remaining);
        System.out.println();
        System.out.println("perchentage of income spent on each category");
        System.out.println("Rent : " +rentPer+ "%");
        System.out.println("Groceries : " +groceriesPer+ "%");
        System.out.println("transportation : " +transPer+ "%");
        System.out.println("Entertainment : " +entertainPer+ "%");
        
        
        
        
    }
}
