import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        final String msg = age >= 16
                ? "You are old enough to legally drive."
                : "YOu are not old enough to legally drive.";

        System.out.println(msg);
    }
}
