package Calculator;

import static Calculator.Resources.calcResources.*;
import static Calculator.Resources.calcResources.systemScanner;

public class CalculatorMethods{

    public static void main(String[] args) {

        String runAgain = "";

        do {
            systemScanner();
            menu();

                System.out.println("Choose 'yes' if you want to start the calculator again. Press any key to finish.");
                runAgain = systemScanner().next();

        } while (runAgain.equalsIgnoreCase("yes")) ;
                System.out.println("Thanks for using Calc program. See you again!");
    }

}
