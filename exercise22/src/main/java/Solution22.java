/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program takes in three numbers from the user.  It then checks to see if all the numbers are different.
 *  If they are not it will end the program, but if they are it will determine which number is largest
 *  using if else statements.  The program will then display the biggest number out of the three.
 */

import java.util.Scanner;
import static java.lang.System.exit;

public class Solution22 {
    public static void main(String[] args) {
        int largest = 0, num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        if(num1 == num2 || num2 == num3 || num3 == num1){
            System.exit(0);
        }
        else if(num1 > num2 && num1 > num3){
            largest = num1;
        }
        else if(num2 > num1 && num2 > num3){
            largest = num2;
        }
        else if(num3 > num1 && num3 > num2){
            largest = num3;
        }

        System.out.println("The largest number is " + largest + ".");
    }
}
