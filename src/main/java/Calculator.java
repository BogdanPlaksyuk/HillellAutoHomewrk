import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber = entered_number("first");
        double secondNumber = entered_number("second");
        sum(firstNumber, secondNumber);
        odd(firstNumber, secondNumber);
        mult(firstNumber, secondNumber);
        div(firstNumber, secondNumber);
        rem(firstNumber, secondNumber);
    }

    public static double entered_number(String count) {
        System.out.println("Enter " + count + " number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void sum(double firstAddend, double secondAddend) {
        double sum = firstAddend + secondAddend;
        System.out.println("Sum =" + sum);
    }

    public static void odd(double minuend, double subtrahend) {
        double odd = minuend - subtrahend;
        System.out.println("Odd =" + odd);
    }

    public static void mult(double multiplicand, double multiplier) {
        double mult = multiplicand * multiplier;
        System.out.println("Mult =" + mult);
    }

    public static void div(double dividend, double divisor) {
        double div = dividend / divisor;
        System.out.println("Div =" + div);
    }

    public static void rem(double dividend, double divisor) {
        double rem = dividend % divisor;
        System.out.println("Rem =" + rem);
    }
}
