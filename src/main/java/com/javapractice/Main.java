package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program to verify the input is prime
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");

        //Obtaining limit from user
        int UserInput = Inp.nextInt();

        //Obtaining the result using normal function call
        System.out.println(UserInput + " is " + (isNeonNumber(UserInput) ? "a" : "not a") + " neon number");

    }

    //Function to check neon number
    public static boolean isNeonNumber(int num) {
        int squareOfNumber = doSquare(num);
        int sumOfSquaredNumber = doAddDigits(squareOfNumber);
        if (num == sumOfSquaredNumber) return true;
        return false;
    }

    //Function that return the square
    public static int doSquare(int num) {
        return (int) Math.pow(num, 2);
    }

    //Function that sums all the digits
    public static int doAddDigits(int num) {
        int inputNumber = num;
        int sumOfDigits = 0;

        while (inputNumber != 0) {
            sumOfDigits += (inputNumber % 10);
            inputNumber = inputNumber / 10;
        }
        return sumOfDigits;
    }
}