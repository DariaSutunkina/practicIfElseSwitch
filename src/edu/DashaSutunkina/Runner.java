package edu.DashaSutunkina;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mouth = scanner.nextInt();
        if (mouth <= 2 || mouth == 12) {
            System.out.println("this is winter");
        } else if (mouth <= 5) {
            System.out.println("this is spring");
        } else if (mouth <= 8) {
            System.out.println("this is summer");
        } else if (mouth <= 11) {
            System.out.println("this is autumn");
        } else {
            System.out.println("error");
        }
    }
}
