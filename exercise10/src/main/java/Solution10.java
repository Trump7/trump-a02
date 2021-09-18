import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        int q1, q2, q3;
        double p1, p2, p3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        p1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        q1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        p2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        q2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        p3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        q3 = input.nextInt();

        double subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        System.out.println("Subtotal: $" + (String.format("%.2f", subtotal)));
        double tax = 0.055 * subtotal;
        System.out.println("Tax: $" + (String.format("%.2f", tax)));
        double total = subtotal + tax;
        System.out.println("Total: $" + (String.format("%.2f", total)));
    }
}
