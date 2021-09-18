import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int inv = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble() / 100;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double end = (inv * (1 + (rate * years))) + 0.004;

        System.out.println("After " + years + " years at " + (rate * 100) + "%, the investment will be worth $" + String.format("%.2f", end) + ".");
    }
}
