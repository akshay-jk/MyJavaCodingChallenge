package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the height of pyramid\t");
        int height = Inp.nextInt();

        printPyramid(height);

    }

    public static void printPyramid(int pyramidHeight) {
        int pyramidWidth = ((2 * pyramidHeight) - 1);

        for (int i = 0; i < pyramidHeight; i++) {
            String pyramidLine = "";

            int hyphenCount = (pyramidWidth / 2) - i, starCount = i;

            pyramidLine += " - ".repeat(hyphenCount);
            pyramidLine += " * ".repeat(starCount);
            pyramidLine += " * ";
            pyramidLine += " * ".repeat(starCount);
            pyramidLine += " - ".repeat(hyphenCount);

            System.out.println(pyramidLine);

        }

    }

}