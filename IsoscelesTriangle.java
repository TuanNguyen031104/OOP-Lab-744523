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

public class IsoscelesTriangle {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.3
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the height of the triangle
        System.out.print("Enter the height of the isosceles triangle (n): ");
        int n = scanner.nextInt();

        // Loop to create each row of the triangle
        for (int i = 0; i < n; i++) {
            // Print spaces for left padding
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
