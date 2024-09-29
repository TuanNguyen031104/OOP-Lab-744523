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

public class LinearEquation {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 2.2.6 Part 1
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a (a =/= 0): ");
    double a = scanner.nextDouble();
    
    if(a == 0) {
        System.out.println("'a' can not be 0.");
    } else {
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        
        double x = -b/a;
        
        System.out.printf("The solution for %.2fx + %.2f = 0 is %.2f%n", a, b, x);
        }
    
    scanner.close();
    }
}