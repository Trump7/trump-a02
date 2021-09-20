/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program takes in a username and a password from the user.  If the password does not match
 *  the hardcoded password, it tells the user It doesn't know them.  If the password matches, it
 *  will present the user with a welcome message including their username.
 *
 */

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        String realPass = "abc$123";

        Scanner input = new Scanner(System.in);

        System.out.print("What is the username? ");
        String user = input.next();
        System.out.print("What is the password? ");
        String pass = input.next();

        if(pass.equals(realPass)) {
            System.out.println("Welcome back, " + user + "!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
