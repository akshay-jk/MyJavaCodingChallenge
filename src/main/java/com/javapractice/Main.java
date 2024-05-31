package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program to verify the input is prime
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");

        int NumberToBeChecked = Inp.nextInt();
        System.out.println(NumberToBeChecked + " is " + (isPrimeNumber(NumberToBeChecked) ? "a" : "not") + " prime number");
    }

    //Function that contains the logic
    public static boolean isPrimeNumber(int num) {
        if (num < 1) return false;
        for (int i = 1; i < num; i++) {
            if (i != 1 && num % i == 0) return false;
        }
        return true;
    }
}