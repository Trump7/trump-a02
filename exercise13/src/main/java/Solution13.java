import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int p = input.nextInt();
        System.out.print("What is the rate? ");
        double r = input.nextDouble() / 100;
        System.out.print("What is the number of years? ");
        int t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double total = p * Math.pow((1 + (r / n)), (n * t));

        System.out.println("$" + p + " invested at " + (r * 100) + "% for " + t + " years compounded " + n + " times per year is $" + String.format("%.2f", total) + ".");
    }
}
