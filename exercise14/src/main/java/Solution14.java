import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        double amount;
        double total;
        double tax;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        amount = input.nextInt();
        System.out.print("What is the state? ");
        String state = input.next();
        total = amount;

        if(state.equals("WI")) {
            tax = amount * 0.055;
            total = tax + amount;

            System.out.println("The subtotal is $" + String.format("%.2f", amount) + ".");
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
        }
        System.out.println("The total is $" + String.format("%.2f", total) + ".");
    }
}
