package pckg_fst;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestApp {
    private static final int MIN = 0;
    private static final int MAX = 150;
    private static Scanner scanner;

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3, 3);
        printMatrix(matrix);
        inputUntilGuess(matrix);
    }

    private static void inputUntilGuess(int[][] matrix) {
        int userInput = userDefinedInput();

        while (!inputInMatrix(userInput, matrix)) {
            userInput = userDefinedInput();
        }

        System.out.println("Kraj...");
        scanner.close();
    }

    private static void printByRow(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean inputInMatrix(int input, int[][] matrix) {
        boolean foundInput = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == input) {
                    foundInput = true;
                    break;
                }
            }
        }

        return foundInput;
    }

    private static int userDefinedInput() {
        scanner = new Scanner(System.in);
        System.out.print("Unesite broj izmedu 0 i 150: ");
        return scanner.nextInt();
    }

    public static int[][] generateMatrix(int numRows, int numCols) {
        Random random = new Random();
        int[][] matrix = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = random.nextInt(MIN, MAX + 1);
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
