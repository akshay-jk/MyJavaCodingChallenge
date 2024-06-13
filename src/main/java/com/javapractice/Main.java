package com.javapractice;

import java.util.Scanner;

import com.javapractice.SwapNumber;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the first number\t");
        int NumOne = Inp.nextInt();

        System.out.print("Enter the second number\t");
        int NumTwo = Inp.nextInt();

        SwapNumber swapClass = new SwapNumber(NumOne, NumTwo);

        System.out.println("Before swapping, A is " + swapClass.getNumberOne() + ", B is " + swapClass.getNumberTwo());
        swapClass.doSwapNumbers();
        System.out.println("After swapping, A is " + swapClass.getNumberOne() + ", B is " + swapClass.getNumberTwo());
    }
}