import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        String state, county;
        double tax, total;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double order = input.nextDouble();
        System.out.print("What state do you live in? ");
        state = input.next();
        total = order;

        if(state.equals("Wisconsin") || state.equals("wisconsin")){
            tax = 0.05;

            System.out.print("What county do you live in? ");
            county = input.next();
            if(county.equals("Eau Claire") || county.equals("eau claire")){
                tax += 0.005;
            }
            else if(county.equals("Dunn") || county.equals("dunn")){
                tax += 0.004;
            }
            tax = tax * order;
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
            total = order + tax;
        }
        else if(state.equals("Illinois") || state.equals("illinois")){
            tax = 0.08;
            tax = tax * order;
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
            total = order + tax;
        }

        System.out.println("The total is $" + String.format("%.2f", total) + ".");
    }
}
