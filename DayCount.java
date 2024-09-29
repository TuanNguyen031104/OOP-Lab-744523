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
import java.util.HashMap;
import java.util.Map;

public class DayCount {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.4
    
    private static final Map<String, Integer> monthMap = new HashMap<>();

    static {
        monthMap.put("January", 1);
        monthMap.put("Jan", 1);
        monthMap.put("Jan.", 1);
        monthMap.put("February", 2);
        monthMap.put("Feb", 2);
        monthMap.put("Feb.", 2);
        monthMap.put("March", 3);
        monthMap.put("Mar", 3);
        monthMap.put("Mar.", 3);
        monthMap.put("April", 4);
        monthMap.put("Apr", 4);
        monthMap.put("Apr.", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("Jun", 6);
        monthMap.put("Jun.", 6);
        monthMap.put("July", 7);
        monthMap.put("Jul", 7);
        monthMap.put("Jul.", 7);
        monthMap.put("August", 8);
        monthMap.put("Aug", 8);
        monthMap.put("Aug.", 8);
        monthMap.put("September", 9);
        monthMap.put("Sep", 9);
        monthMap.put("Sep.", 9);
        monthMap.put("October", 10);
        monthMap.put("Oct", 10);
        monthMap.put("Oct.", 10);
        monthMap.put("November", 11);
        monthMap.put("Nov", 11);
        monthMap.put("Nov.", 11);
        monthMap.put("December", 12);
        monthMap.put("Dec", 12);
        monthMap.put("Dec.", 12);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input year (Example: 2024): ");
        int year = scanner.nextInt();
        scanner.nextLine();
                
        System.out.print("Input month (name, abbreviation, number): ");
        String monthInput = scanner.nextLine().trim();
        int month = parseMonth(monthInput);
        
        int days = getDaysInMonth(year, month);
        
        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            System.out.println("Month no " + month + " of the year " + year + " has " + days + " days.");
        }        
    }

    public static int parseMonth(String monthInput) {
        if (monthInput.matches("\\d+")) {
            int monthNumber = Integer.parseInt(monthInput);
            return (monthNumber >= 1 && monthNumber <= 12) ? monthNumber : 0;
        }
        return monthMap.getOrDefault(monthInput, 0);
    }
    
    public static int getDaysInMonth (int year, int month) {
        int days = 0;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 4, 6, 9, 11 -> days = 30;
                case 2 -> {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                }
                default -> days = 31;
            }
        }
        return days;
    }
}
