import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        String realPass = "abc$123";

        Scanner input = new Scanner(System.in);

        System.out.print("What is the username? ");
        String user = input.next();
        System.out.print("What is the password? ");
        String pass = input.next();

        if(pass.equals(realPass)) {
            System.out.println("Welcome back, " + user + "!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
