package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the depth of pyramid\t");
        int depth = Inp.nextInt();

        printInvertedPyramid(depth);

    }

    public static void printInvertedPyramid(int pyramidDepth) {
        int pyramidWidth = ((2 * pyramidDepth) - 1);

        for (int i = 0; i < pyramidDepth; i++) {
            String pyramidLine = "";

            int hyphenCount = i, starCount = (pyramidWidth / 2) - i;

            pyramidLine += " - ".repeat(hyphenCount);
            pyramidLine += " * ".repeat(starCount);
            pyramidLine += " * ";
            pyramidLine += " * ".repeat(starCount);
            pyramidLine += " - ".repeat(hyphenCount);

            System.out.println(pyramidLine);

        }

    }

}