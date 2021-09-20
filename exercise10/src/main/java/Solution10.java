/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program will take in the price and quantity of three items from the user.
 *  The program will then calculate the total price for all items, the tax for all the items,
 *  and finally display the total to the user.
 */

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        int q1, q2, q3;
        double p1, p2, p3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        p1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        q1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        p2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        q2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        p3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        q3 = input.nextInt();

        double subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        System.out.println("Subtotal: $" + (String.format("%.2f", subtotal)));
        double tax = 0.055 * subtotal;
        System.out.println("Tax: $" + (String.format("%.2f", tax)));
        double total = subtotal + tax;
        System.out.println("Total: $" + (String.format("%.2f", total)));
    }
}
