package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the first number\t");
        int NumOne = Inp.nextInt();

        System.out.print("Enter the second number\t");
        int NumTwo = Inp.nextInt();

        int HighestCommonFactor = findHighestCommonFactor(NumOne, NumTwo);
        int LowestCommonMultiple = findLowestCommonMultiple(NumOne, NumTwo);

        System.out.println("The highest common factor is " + HighestCommonFactor);
        System.out.println("The lowest common multiple is " + LowestCommonMultiple);

    }

    public static int findHighestCommonFactor(int NumOne, int NumTwo) {
        int ExpectedValue = Math.min(NumOne, NumTwo);
        while (ExpectedValue > 0) {
            if (NumOne % ExpectedValue == 0 && NumTwo % ExpectedValue == 0)
                break;
            ExpectedValue--;
        }
        return ExpectedValue;
    }

    public static int findLowestCommonMultiple(int NumOne, int NumTwo) {
        int ExpectedValue = Math.max(NumOne, NumTwo);
        while (ExpectedValue <= findProduct(NumOne, NumTwo)) {
            if (ExpectedValue % NumOne == 0 && ExpectedValue % NumTwo == 0)
                break;
            ExpectedValue++;
        }
        return ExpectedValue;
    }

    public static int findProduct(int NumOne, int NumTwo) {
        return NumOne * NumTwo;
    }
}