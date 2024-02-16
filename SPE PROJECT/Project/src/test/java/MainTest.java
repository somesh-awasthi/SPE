import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        testSquareRoot();
        testFactorial();
        testNaturalLogarithm();
        testPowerFunction();
    }

    public static void testSquareRoot() {
        System.out.println("Testing Square Root Function:");
        double input = 16;
        double expectedResult = 4;
        double result = calculateSquareRoot(input);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + result);
        System.out.println();
    }

    public static void testFactorial() {
        System.out.println("Testing Factorial Function:");
        int input = 5;
        double expectedResult = 120;
        double result = calculateFactorial(input);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + result);
        System.out.println();
    }

    public static void testNaturalLogarithm() {
        System.out.println("Testing Natural Logarithm Function:");
        double input = 2.71828; // Euler's number
        double expectedResult = 1;
        double result = calculateNaturalLogarithm(input);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + result);
        System.out.println();
    }

    public static void testPowerFunction() {
        System.out.println("Testing Power Function:");
        double base = 2;
        double exponent = 3;
        double expectedResult = 8;
        double result = calculatePowerFunction(base, exponent);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + result);
        System.out.println();
    }

    public static double calculateSquareRoot(double input) {
        return Math.sqrt(input);
    }

    public static double calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static double calculateNaturalLogarithm(double input) {
        return Math.log(input);
    }

    public static double calculatePowerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
