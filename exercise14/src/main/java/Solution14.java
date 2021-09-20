/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program takes in an amount of money and determines weather or not to tax it
 *  based on what state the user inputs.  If the state is Wisconson it will tax the user
 *  5.5%, and display the total amount of the order.  If the state is anything else, it will
 *  not tax the user.
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        double amount;
        double total;
        double tax;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        amount = input.nextInt();
        System.out.print("What is the state? ");
        String state = input.next();
        total = amount;

        if(state.equals("WI")) {
            tax = amount * 0.055;
            total = tax + amount;

            System.out.println("The subtotal is $" + String.format("%.2f", amount) + ".");
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
        }
        System.out.println("The total is $" + String.format("%.2f", total) + ".");
    }
}
