import java.util.*;
public class 2d_matrix_multiplication {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        // Result matrix will have dimensions: rowsA x colsB
        int[][] result = new int[rowsA][colsB];

        // Perform standard matrix multiplication (Row x Column)
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for Matrix A
        System.out.print("Enter rows and columns for Matrix A: ");
        int rA = sc.nextInt();
        int cA = sc.nextInt();

        // Input dimensions for Matrix B
        System.out.print("Enter rows and columns for Matrix B: ");
        int rB = sc.nextInt();
        int cB = sc.nextInt();

        // Rule: Columns of A must equal Rows of B
        if (cA != rB) {
            System.out.println("Error: Multiplication impossible. Columns of A must equal rows of B.");
            return;
        }

        int[][] matrixA = new int[rA][cA];
        int[][] matrixB = new int[rB][cB];

        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rB; i++) {
            for (int j = 0; j < cB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
} 
