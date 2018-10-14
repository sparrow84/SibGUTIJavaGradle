package lesson02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Lesson02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputStreamReader in = new InputStreamReader(System.in);

        double x = 0;
        double y = 0;
        double result = 0;

        char action = ' ';

        System.out.println("\n");
        System.out.println("Calculator VOROBEYCALC 1.0\n");

        System.out.println("List of possible operations: " +
                "\n  summation      + " +
                "\n  subtraction    - " +
                "\n  multiplication * " +
                "\n  division       / " +
                "\n  quit           q");

        for (;;) {

            System.out.print("Type \'w\' for calculations or \'q\' for exit and press \"Enter\" -> ");

            String str = scanner.next();
            // выход при нажатии q
            if("q".equals(str)) {
                break;
            }

            x = setValue("x");

            action = choiceOperation();

            y = setValue("y");

            switch (action) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    result = x / y;
                    break;
            }

            System.out.println("Result = " + result);
        }
        System.out.println("Good bye!");
    }


    static double setValue(String varName) {

        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print("Enter " + varName + " value and press \"Enter\" -> ");

            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers are allowed. Re-enter.");
            } finally {
                scanner = new Scanner(System.in);
            }
        }
        return value;
    }

    static char choiceOperation() {
        InputStreamReader in = new InputStreamReader(System.in);
        char action;

        while (true) {
            System.out.print("Enter the symbol of the operation -> ");
            try {
                action = (char) in.read();
                if (action == '+' || action == '-' || action == '*' || action == '/') break;
                System.out.println("The action " + action + " is not supported. " +
                        "\nList of possible operations: " +
                        "\n  summation      + " +
                        "\n  subtraction    - " +
                        "\n  multiplication * " +
                        "\n  division       /");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in = new InputStreamReader(System.in);
            }
        }
        return action;
    }
}
