package edu.DashaSutunkina;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month <= 2 || month == 12) {
            System.out.println("this is winter");
        } else if (month <= 5) {
            System.out.println("this is spring");
        } else if (month <= 8) {
            System.out.println("this is summer");
        } else if (month <= 11) {
            System.out.println("this is autumn");
        } else {
            System.out.println("error");
        }
    }
}
