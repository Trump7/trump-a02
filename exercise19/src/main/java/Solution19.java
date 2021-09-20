/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program will ask the user for their weight in pounds and their height in inches.
 *  It will then calculate their BMI.  Then the program determines whether the user is
 *  underweight, overweight, or ideal.  Finally, the program prints that information and their
 *  BMI.
 */

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();
        System.out.print("What is your height, in inches? ");
        double height = input.nextDouble();

        double BMI = (weight / (height * height)) * 703;
        if(BMI > 25){
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5) {
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are underweight. You should see your doctor.");
        }
        else{
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are within the ideal weight range.");
        }

    }
}
