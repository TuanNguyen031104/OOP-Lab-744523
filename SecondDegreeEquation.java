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

public class SecondDegreeEquation {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 2.2.6 Part 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a (a =/= 0): ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0 for a quadratic equation.");
        } else {
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("The equation has two distinct real roots: x1 = %.2f, x2 = %.2f%n", root1, root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.printf("The equation has one double root: x = %.2f%n", root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }

        scanner.close();
    } 
}
