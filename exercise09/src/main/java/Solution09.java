/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program will ask the user for the length and width of the ceiling.
 *  It will then calculate how many buckets of paint are nessesary to pain the ceiling.
 *  Finally it will tell the user how many buckets they need.
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gallons = 0;

        System.out.print("What is the width of the ceiling? ");
        int width = input.nextInt();
        System.out.print("What is the length of the ceiling? ");
        int length = input.nextInt();

        int squareF = length * width;

        gallons = (squareF / 350.0) + .5;

        System.out.println("You will need to purchase " + String.format("%.0f", gallons) + " gallons of paint to cover " + squareF + " square feet.");
    }
}
