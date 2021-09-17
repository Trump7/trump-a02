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
        if(350 % squareF > 1){
            gallons = squareF / 350;
        }


        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + squareF + " square feet.");
    }
}
