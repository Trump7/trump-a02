/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program asks the user whether they are converting F to C or C to F.
 *  Then the user can enter the amount of degrees.  The program then converts the temperature
 *  and displays the converted teperature.  If neither option is selected, the program tells
 *  the user they entered an invalid character.
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        String choice;
        double temp;
        double convTemp;

        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        choice = input.next();
        if(choice.equals("C") || choice.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = input.nextDouble();
            convTemp = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + String.format("%.2f", convTemp) + ".");
        }
        else if(choice.equals("F") || choice.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextDouble();
            convTemp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + String.format("%.2f", convTemp) + ".");
        }
        else{
            System.out.println("Invalid character input.");
        }
    }
}
