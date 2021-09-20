/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program will take in the current age of the user and the age they would like to retire at.
 *  Then it will subtract the two and tell the user how many years until they can retire.
 *  It also tells the user what year they can retire, given that it's 2021.
 */
import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retire = in.nextInt();
        int years = retire - age;
        System.out.println("You have " + years + " years left until you can retire.");
        System.out.println("It's 2021 so you can retire in " + (years + 2021) + ".");
    }
}
