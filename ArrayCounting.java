/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20226095.nguyenminhtuan.lab1;

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCounting {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.5
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array;

        System.out.print("Number of elements in the array: ");
        int n = scanner.nextInt();
        array = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}
