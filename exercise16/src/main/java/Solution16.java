/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program determines whether or not the user is old enough to drive
 *  If they are it diplays a message saying they can drive.  If not is says they legally
 *  cannot drive.
 */

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        final String msg = age >= 16
                ? "You are old enough to legally drive."
                : "YOu are not old enough to legally drive.";

        System.out.println(msg);
    }
}
