package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {

        String runAgain = "";
        Scanner run = new Scanner(System.in);

            do {
                try {
                    //Start of calc program
                    int x, y;
                    String operator;
                    Scanner scannerConstructor = new Scanner(System.in);

                    System.out.println("Enter the first number:");
                    x = scannerConstructor.nextInt();

                    System.out.println("Enter the operator: '+', '-', '*' or '/'");
                    operator = scannerConstructor.next();

                    System.out.println("Enter the second number:");
                    y = scannerConstructor.nextInt();

                    switch (operator) {
                        case "+":
                            System.out.println("Your result is: " + (x + y));
                            break;

                        case "-":
                            System.out.println("Your result is: " + (x - y));
                            break;

                        case "*":
                            System.out.println("Your result is: " + (x * y));
                            break;

                        case "/":
                            try {
                                System.out.println("Your result is: " + (x / y));
                            } catch (ArithmeticException exception) {
                                System.out.println("You cannot divide by \"0\"");
                                System.out.println(exception.toString());
                            } finally {
                                break;
                            }
                        default:
                            System.out.println("You entered the wrong operator. End the program and restart it.");

                    }
                }catch (InputMismatchException exception) {
                    System.out.println("You should enter a number");
                    System.out.println(exception.toString());
                }
                //End of calc program

                System.out.println("Choose 'yes' if you want to start the calculator again. Press any key to finish.");
                runAgain = run.next();

                } while (runAgain.equalsIgnoreCase("yes")) ;
                System.out.println("Thanks for using my calculator. See you again!");

    }
}
