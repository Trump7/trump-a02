import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euro = input.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchange = input.nextDouble();
        double total = (exchange * euro) + 0.005;
        System.out.println(euro + " euros at an exchange rate of " + exchange + " is " + String.format("%.2f", total) + " U.S. dollars.");
    }
}
