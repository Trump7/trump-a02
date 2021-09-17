import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retire = in.nextInt();
        int years = retire - age;
        System.out.println("You have " + years + " years left until you can retire.");
        System.out.println("It's 2021 so you can retire in " + (years + 2021) + ".");
    }
}
