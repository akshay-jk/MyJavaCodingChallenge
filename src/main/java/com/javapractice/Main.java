package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the limit\t");
        int limit = Inp.nextInt();

        printRightTriangle(limit);

    }

    public static void printRightTriangle(int triangleHeight) {
        for (int i = 0; i < triangleHeight; i++) {
            System.out.println("*".repeat(i + 1) + "-".repeat(triangleHeight - (i + 1)));
        }
    }
}