package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the height of triangle\t");
        int triangleHeight = Inp.nextInt();

        printRightAngledLeftSidedInvertedTriangle(triangleHeight);
    }

    public static void printRightAngledLeftSidedInvertedTriangle(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(" * ".repeat(height - i) + " - ".repeat(i));
        }
    }

}