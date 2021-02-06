package villanueva;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    /**
     * Adds two integers and returns the sum
     * @param a integer
     * @param b integer
     * @return the sum a + b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtract two integers and returns the result
     * @param a integer
     * @param b integer
     * @return the sum a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }


    /**
     * Main uses the above methods
     * @param args an array of strings
     */
    public static void main(String[] args) {

        try {
            System.out.println("********************************************");
            System.out.println("*** This program makes some calculations ***");
            System.out.println("********************************************\n");

            // some values
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int a = scanner.nextInt();
            System.out.print("Now another integer: ");
            int b = scanner.nextInt();

            //creating my calculator object
            Calculator calculator = new Calculator();

            //performing operations
            System.out.format("\n%d + %d = %d\n", a, b, calculator.add(a,b));
            System.out.format("%d - %d = %d\n", a, b, calculator.subtract(a,b));
        } catch (InputMismatchException e) {
            System.out.println("\nUps. That wasn't an integer!\nBye...");
        }
    }
}
