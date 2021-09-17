import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();
        int total = pizza * slices;
        int ppp = total / people;
        int leftovers = total % slices;
        System.out.println(people + " people with " + pizza + " pizzas (" + total + " slices)");
        System.out.println("Each person gets " + ppp + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");
    }
}
