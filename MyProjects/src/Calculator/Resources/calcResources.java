package Calculator.Resources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calcResources {

    public static Scanner systemScanner(){
        Scanner sysScan = new Scanner(System.in);
        return sysScan;
    }

    public static void menu(){
        try {
            System.out.println("Welcome to the Calc Program v1.1.4. Choose one of the available options.");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            loops();
        } catch(InputMismatchException exception) {
            System.out.println("You should enter a number between 1-4. End of the program and try again.");
            System.out.println(exception.toString());
        }
    }

    private static void loops(){
        int input = systemScanner().nextInt();

        if (input == 1){
            addition();
        } else if (input == 2){
            subtraction();
        } else if (input == 3){
            multiplication();
        } else if (input == 4){
            division();
        } else{
            System.out.println("You have not made any choice. You should enter a number between 1-4. End the program and try again.");
        }
    }
    private static void addition(){
        int x, y;

        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x + y));
        } catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    private static void subtraction(){
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x - y));
        } catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    private static void multiplication(){
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x * y));
        } catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }

    private static void division() {
        int x, y;
        try {
            System.out.println("Enter the first number:");
            x = systemScanner().nextInt();

            System.out.println("Enter the second number:");
            y = systemScanner().nextInt();

            System.out.println("Your result is: " + (x / y));
        } catch (ArithmeticException exception) {
            System.out.println("You cannot divide by \"0\"");
            System.out.println(exception.toString());
        } catch (InputMismatchException exception) {
            System.out.println("You should enter a number");
            System.out.println(exception.toString());
        }
    }
}