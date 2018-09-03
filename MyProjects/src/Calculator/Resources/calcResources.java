package Calculator.Resources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calcResources {

    public static Scanner systemScanner() {
        Scanner sysScan = new Scanner(System.in);
        return sysScan;
    }

    public static void addition(){
        int x, y;

        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x + y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void subtraction(){
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x - y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void multiplication(){
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x * y));
        }catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    public static void division() {
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

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