package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Calculator.Resources.calcResources.*;

public class CalculatorMethods{

    public static void main(String[] args) {

        String runAgain = "";
        Scanner run = new Scanner(System.in);

        do {
                Scanner systemScan = new Scanner(System.in);

                try {

                    System.out.println("Welcome to the calc program. Choose one of the available options.");
                    System.out.println("1.Addition");
                    System.out.println("2.Subtraction");
                    System.out.println("3.Multiplication");
                    System.out.println("4.Division");

                    int choice = systemScan.nextInt();

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
                runAgain = run.next();

        } while (runAgain.equalsIgnoreCase("yes")) ;
                System.out.println("Thanks for using my calculator. See you again!");
    }

}
