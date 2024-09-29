/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20226095.nguyenminhtuan.lab1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class AddMatrices {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.6

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixA;
        int[][] matrixB;

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        matrixA = new int[rows][cols];
        matrixB = new int[rows][cols];

        System.out.print("Enter the elements of Matrix A: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the elements of Matrix B: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition:");
        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
