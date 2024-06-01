package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program to verify the input is prime
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");

        //Obtaining limit from user
        int UserInput = Inp.nextInt();

        //Obtaining the result using normal function
        int FactorialValue01 = findFactorial(UserInput);
        System.out.println(FactorialValue01 + " is the factorial of " + UserInput + ". (Normal Method Computation)");

        //Obtaining the result using recursive function
        int FactorialValue02 = findFactorialByRecursion(UserInput);
        System.out.println(FactorialValue02 + " is the factorial of " + UserInput + ". (Recursive Method Computation)");
    }

    //Function that contains the logic
    public static int findFactorial(int num) {
        if (num == 0 || num == 1) return 1;

        int factorialNum = 1;
        for (int i = num; i > 1; --i) factorialNum *= i;
        return factorialNum;
    }

    //Function that contains the logic using recursion.
    public static int findFactorialByRecursion(int num) {
        if (num == 0 || num == 1) return 1;
        else return num * findFactorialByRecursion(num - 1);
    }
}