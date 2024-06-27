package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the height of triangle\t");
        int triangleHeight = Inp.nextInt();

        printRightAngledRightSidedInvertedTriangle(triangleHeight);
    }

    public static void printRightAngledRightSidedInvertedTriangle(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(" - ".repeat(i) + " * ".repeat(height - i));
        }
    }

}