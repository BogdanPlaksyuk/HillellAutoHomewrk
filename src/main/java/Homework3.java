import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int[] array = scanArray();
        polindrom(array);
    }

    private static int[] scanArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array values");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void polindrom(int[] mass) {
        boolean b = true;
        for (int i = 0; i < mass.length / 2; i++) {
            if (mass[i] != mass[mass.length - i - 1]) {
                b = false;
                System.out.println("Not Polindrom");
                break;
            }
        }
        if (b) {
            System.out.println("Polindrom");
        }
    }
}
