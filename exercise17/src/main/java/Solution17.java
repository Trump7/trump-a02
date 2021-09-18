import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BAC = 0.0;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int mF = input.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int oz = input.nextInt();
        System.out.print("What is your weight, in pounds? ");
        int lbs = input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int hrs = input.nextInt();

        if(mF == 1){
            BAC = ((oz * (5.14/lbs) * 0.73)) - (0.015 * hrs);
        }
        else{
            BAC = ((oz * (5.14/lbs) * 0.66)) - (0.015 * hrs);
        }

        final String canDrive = BAC >= 0.08
                ? "It is not legal for you to drive."
                : "It is legal for you to drive.";

        System.out.println("\nYour BAC is " + String.format("%.6f", BAC));
        System.out.println(canDrive);
    }
}
