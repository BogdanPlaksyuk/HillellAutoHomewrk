public class Homework5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Your matrix:");
        printMatrix(matrix);
        System.out.println("Sum of matrix lines:");
        lineSum(matrix);
    }

    private static void printMatrix(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void lineSum(int[][] doubleArray) {
        int[] sum = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                sum[i] += doubleArray[i][j];
            }
            System.out.println("Sum of line " + (i + 1) + " = " + sum[i]);
        }
    }
}
