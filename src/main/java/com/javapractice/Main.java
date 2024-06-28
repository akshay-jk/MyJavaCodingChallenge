package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the height of pyramid\t");
        int pyramidHeight = Inp.nextInt();

        printInvertedPyramidMirror(pyramidHeight);

    }

    public static void printInvertedPyramidMirror(int pyramidHeight) {

        int Height = pyramidHeight, Width = (Height == 1) ? Height : (2 * Height);

        for (int h = Height; h >= -Height; h--) {
            String DynamicWidth = "";

            DynamicWidth += " - ".repeat((int) ((Math.floor(Width / 2)) - Math.abs(h)));
            DynamicWidth += " * ".repeat(Math.abs(h));

            DynamicWidth += " * ";

            DynamicWidth += " * ".repeat(Math.abs(h));
            DynamicWidth += " - ".repeat((int) (Math.floor(Width / 2)) - Math.abs(h));

            System.out.println(DynamicWidth);
        }
    }

}