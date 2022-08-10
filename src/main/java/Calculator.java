import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        double firstNumber = entered_number();
        System.out.println("Enter second number");
        double secondNumber = entered_number();
        System.out.println("Sum= "+ sum(firstNumber, secondNumber));
        System.out.println("Odd= "+ odd(firstNumber, secondNumber));
        System.out.println("Mult= "+ mult(firstNumber, secondNumber));
        System.out.println("Div= "+ div(firstNumber, secondNumber));
        System.out.println("Rem= "+ rem(firstNumber, secondNumber));
    }

    public static double entered_number() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double sum(double firstAddend, double secondAddend) {
        return firstAddend + secondAddend;
    }

    public static double odd(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public static double mult(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    public static double div(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double rem(double dividend, double divisor) {
        return dividend % divisor;
    }
}
