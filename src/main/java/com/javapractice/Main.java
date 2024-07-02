package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the size of square\t");
        int SquareSize = Inp.nextInt();

        printSquare(SquareSize);
    }

    public static void printSquare(int SquareSize) {
        for (int i = 0; i < SquareSize; i++) {
            String Str = "";
            for (int j = 0; j < SquareSize; j++) {
                if (i == 0 || i == SquareSize - 1) {
                    Str += " * ";
                } else {
                    Str = (j == 0 || j == SquareSize - 1) ? Str + " * " : Str + " - ";
                }
            }
            System.out.println(Str);
        }
    }
}