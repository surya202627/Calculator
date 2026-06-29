package calculator;

import java.util.Scanner;

public class Calculator {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Console Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + addition(num1, num2));
                        break;

                    case 2:
                        System.out.println("Result = " + subtraction(num1, num2));
                        break;

                    case 3:
                        System.out.println("Result = " + multiplication(num1, num2));
                        break;

                    case 4:
                        double result = division(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result = " + result);
                        }
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
