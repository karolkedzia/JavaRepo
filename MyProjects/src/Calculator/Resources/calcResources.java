package Calculator.Resources;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Calculator.Resources.calcResources.multiplication;

public class calcResources {
    public static void addition(){
        int x, y;
        Scanner addition = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            x = addition.nextInt();

            System.out.println("Enter the second number:");
            y = addition.nextInt();

            System.out.println("Your result is: " + (x + y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void subtraction(){
        int x, y;
        Scanner subtraction = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            x = subtraction.nextInt();

            System.out.println("Enter the second number:");
            y = subtraction.nextInt();

            System.out.println("Your result is: " + (x - y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void multiplication(){
        int x, y;
        Scanner multiplication = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            x = multiplication.nextInt();

            System.out.println("Enter the second number:");
            y = multiplication.nextInt();

            System.out.println("Your result is: " + (x * y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void division() {
        int x, y;
        Scanner division = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            x = division.nextInt();

            System.out.println("Enter the second number:");
            y = division.nextInt();

            System.out.println("Your result is: " + (x / y));
        }catch (ArithmeticException exception) {
            System.out.println("You cannot divide by \"0\"");
            System.out.println(exception.toString());
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }
}