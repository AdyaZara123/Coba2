import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];
        int[][] sumMatrix = new int[rows][columns];


        System.out.println("Input baris kolom matrik:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Input nilai " + (i + 1) + "," + (j + 1) + " = ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nMatrix:");
        printMatrix(matrix);

        // Compute transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }


        System.out.println("\nMatrik transpose:");
        printMatrix(transpose);

        // Sum the original matrix and its transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix[i][j] + transpose[i][j];
            }
        }


        System.out.println("\nJumlahkan matrik asli dengan transposenya:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
