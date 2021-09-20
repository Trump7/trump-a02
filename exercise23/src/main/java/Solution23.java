/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Trump
 *  Pseudocode:
 *  This program walks the user through diagnossing their car problems.  It will ask a series of
 *  if else statements to determine the problem with the car.  If the user enters anything other
 *  than Y, y, N, or n then it will tell the user they entered an invalid character and
 *  proceed to stop the program, or exit out.
 */

import java.util.Scanner;

import static java.lang.System.exit;

public class Solution23 {
    public static void main(String[] args) {
        String temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key? (y or n) ");
        temp = input.next();

        if(temp.equals("y") || temp.equals("Y")){
            System.out.println("Are the battery terminals corroded? (y or n) ");
            temp = input.next();
            if(temp.equals("y") || temp.equals("Y")){
                System.out.println("Clean terminals and try starting again.");
                exit(0);
            }
            else if(temp.equals("n") || temp.equals("N")){
                System.out.println("Replace the cables and try again.");
                exit(0);
            }
            else{
                System.out.println("Invalid Character Entered");
                exit(0);
            }
        }
        else if(temp.equals("n") || temp.equals("N")){
            System.out.println("Does the car make a clicking noise. (y or n) ");
            temp = input.next();

            if(temp.equals("y") || temp.equals("Y")){
                System.out.println("Replace the battery.");
                exit(0);
            }
            else if(temp.equals("n") || temp.equals("N")){
                System.out.println("Does the car crank up but fail to start? (y or n) ");
                temp = input.next();

                if(temp.equals("y") || temp.equals("Y")){
                    System.out.println("Check spark plug connections.");
                    exit(0);
                }
                else if(temp.equals("n") || temp.equals("N")){
                    System.out.println("Does the engine start and then die? (y or n) ");
                    temp = input.next();

                    if(temp.equals("y") || temp.equals("Y")){
                        System.out.println("Does your car have fuel injection? (y or n) ");
                        temp = input.next();

                        if(temp.equals("y") || temp.equals("Y")){
                            System.out.println("Get it in for service.");
                            exit(0);
                        }
                        else if(temp.equals("n") || temp.equals("N")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                            exit(0);
                        }
                        else{
                            System.out.println("Invalid Character Entered");
                            exit(0);
                        }
                    }
                    else if(temp.equals("n") || temp.equals("N")){
                        System.out.println("This is not possible.");
                        exit(0);
                    }
                    else{
                        System.out.println("Invalid Character Entered");
                        exit(0);
                    }
                }
            }
            else{
                System.out.println("Invalid Character Entered");
                exit(0);
            }
        }
        else{
            System.out.println("Invalid Character Entered");
            exit(0);
        }

    }
}
