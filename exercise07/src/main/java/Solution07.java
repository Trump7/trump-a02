/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program will take in the length and width of a room from the user.
 *  Then it will calculate the area in feet and meters and print them for the user.
 */

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length =  input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();
        int areaF = width * length;
        double areaM = areaF * 0.09290304;

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(areaF + " square feet");
        System.out.print(String.format("%.3f", areaM) + " square meters");
    }
}
