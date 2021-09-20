/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program takes in the principal, the rate, the number of years, and the times its compounded per year.
 *  It then calculates how much money will be made from that investment and adds it to the original investment.
 *  Finally, it prints the total money made from the compounded interest.
 */

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int p = input.nextInt();
        System.out.print("What is the rate? ");
        double r = input.nextDouble() / 100;
        System.out.print("What is the number of years? ");
        int t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double total = p * Math.pow((1 + (r / n)), (n * t));

        System.out.println("$" + p + " invested at " + (r * 100) + "% for " + t + " years compounded " + n + " times per year is $" + String.format("%.2f", total) + ".");
    }
}
