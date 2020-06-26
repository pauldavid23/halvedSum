package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number to halve sum: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            int limit = num;
            int total = num;
            int theNum = num;
            int newTotal = 0;
            while (limit > 0 ) {
                System.out.print(total + " ");
                newTotal += total;
                total = num / 2;
                limit/=2;
                num/=2;
            }
            System.out.println(" ");
            System.out.println("The sum of " + theNum + " is " + newTotal );

        } else {
            System.out.println("Invalid input!");
        }

    }
}
