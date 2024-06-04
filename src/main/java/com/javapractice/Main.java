package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");

        //Obtaining limit from user
        int UserInput = Inp.nextInt();

        //Obtaining the result using normal function call
        System.out.println(UserInput + " is " + (isArmstrongNumber(UserInput) ? "an" : "not an") + " armstrong number");

    }

    //Function to check armstrong number
    public static boolean isArmstrongNumber(int num) {
        int inputNumber = num;
        int aggregatorValue = 0;
        while (inputNumber != 0) {
            aggregatorValue = aggregatorValue + (doCube(inputNumber % 10));
            inputNumber = inputNumber / 10;
        }
        if(num == aggregatorValue) return true;
        return false;
    }

    //Function that return the cube
    public static int doCube(int num) {
        return (int) Math.pow(num, 3);
    }
}