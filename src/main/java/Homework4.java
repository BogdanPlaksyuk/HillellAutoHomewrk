public class Homework4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Your matrix:");
        printMatrix(matrix);
        System.out.println("Main Diag");
        printMainDiag(matrix);
        System.out.println();
        System.out.println("Side Diag");
        printSideDiag(matrix);
    }

    private static void printMatrix(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printMainDiag(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
    }

    private static void printSideDiag(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - i - 1] + "\t");
        }
    }

}
