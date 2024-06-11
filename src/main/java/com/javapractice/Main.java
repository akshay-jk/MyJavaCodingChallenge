package com.javapractice;

import java.util.Scanner;

import com.javapractice.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the real part of first number\t");
        int firstRealPart = Inp.nextInt();

        System.out.print("Enter the imaginary part of first number\t");
        int firstImaginaryPart = Inp.nextInt();

        ComplexNumber CompNum = new ComplexNumber(firstRealPart, firstImaginaryPart);

        System.out.print("Enter the real part of second number\t");
        int secondRealPart = Inp.nextInt();

        CompNum.addRealPart(secondRealPart);

        System.out.print("Enter the imaginary part of second number\t");
        int secondImaginaryPart = Inp.nextInt();

        CompNum.addImaginaryPart(secondImaginaryPart);

        CompNum.printDetails();

    }
}