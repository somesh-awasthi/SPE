package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (√x)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");

            int choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find its square root: ");
                    double sqrtNum = scanner.nextDouble();
                    result = Math.sqrt(sqrtNum);
                    System.out.println("Square root of " + sqrtNum + " is: " + result);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int factNum = scanner.nextInt();
                    if (factNum < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                        break;
                    }
                    result = factorial(factNum);
                    System.out.println("Factorial of " + factNum + " is: " + result);
                    break;
                case 3:
                    System.out.print("Enter a number to find its natural logarithm: ");
                    double lnNum = scanner.nextDouble();
                    if (lnNum <= 0) {
                        System.out.println("Natural logarithm is not defined for non-positive numbers.");
                        break;
                    }
                    result = Math.log(lnNum);
                    System.out.println("Natural logarithm of " + lnNum + " is: " + result);
                    break;
                case 4:
                    System.out.print("Enter the base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
