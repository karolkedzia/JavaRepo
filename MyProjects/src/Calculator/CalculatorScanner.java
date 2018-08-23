import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {

        String runAgain = "";
        Scanner run = new Scanner(System.in);

        do {

            //Start of calc program
            double x, y;
            Scanner number = new Scanner(System.in);

            String operator;
            Scanner op = new Scanner(System.in);

            System.out.println("Enter the first number:");
            x = number.nextDouble();

            System.out.println("Enter the operator: '+', '-', '*' or '/'");
            operator = op.next();

            System.out.println("Enter the second number:");
            y = number.nextDouble();

            switch(operator) {
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
                    System.out.println("Your result is: " + (x / y));
                    break;

                default:
                    System.out.println("You entered the wrong operator. End the program and restart it.");

            }
            //End of calc program


            System.out.println("Choose 'yes' if you want to start the calculator again. Press any key to finish.");
            runAgain = run.next();

        } while(runAgain.equalsIgnoreCase("yes"));
        System.out.println("Thanks for using my calculator. See you again!");
    }

}
