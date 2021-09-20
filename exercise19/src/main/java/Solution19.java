import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();
        System.out.print("What is your height, in inches? ");
        double height = input.nextDouble();

        double BMI = (weight / (height * height)) * 703;
        if(BMI > 25){
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5) {
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are underweight. You should see your doctor.");
        }
        else{
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ".");
            System.out.println("You are within the ideal weight range.");
        }

    }
}
