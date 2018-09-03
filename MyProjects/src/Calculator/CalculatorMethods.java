package Calculator;

import java.util.InputMismatchException;

import static Calculator.Resources.calcResources.*;
import static Calculator.Resources.calcResources.systemScanner;

public class CalculatorMethods{

    public static void main(String[] args) {

        String runAgain = "";

        do {
                systemScanner();
                try {

                    System.out.println("Welcome to the Calc Program v1.1.2. Choose one of the available options.");
                    System.out.println("1.Addition");
                    System.out.println("2.Subtraction");
                    System.out.println("3.Multiplication");
                    System.out.println("4.Division");

                    int choice = systemScanner().nextInt();

                    if (choice==1) {
                        addition();
                    }
                    else if (choice==2) {
                        subtraction();
                    }
                    else if (choice==3) {
                        multiplication();
                    }
                    else if (choice==4) {
                        division();
                    }
                    else {
                        System.out.println("You have not made any choice. You should enter a number between 1-4. End the program and try again.");
                    }

                }catch (InputMismatchException exception) {
                    System.out.println("You should enter a number between 1-4. End of the program and try again.");
                    System.out.println(exception.toString());
                }

                System.out.println("Choose 'yes' if you want to start the calculator again. Press any key to finish.");
                runAgain = systemScanner().next();

        } while (runAgain.equalsIgnoreCase("yes")) ;
                System.out.println("Thanks for using Calc program. See you again!");
    }

}
