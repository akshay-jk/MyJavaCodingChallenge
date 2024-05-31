package com.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program to verify the input is prime
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");

        //Obtaining limit from user
        int NumberToBeChecked = Inp.nextInt();

        if (NumberToBeChecked <= 2) {
            System.out.println("Lowest prime number is 2");
        } else {
            ArrayList<Integer> PrimeNumbers = new ArrayList<>();
            for (int i = 2; i < NumberToBeChecked; i++) {
                if (isPrimeNumber(i)) PrimeNumbers.add(i);
            }
            System.out.print(PrimeNumbers + " are the prime numbers between 0 and " + NumberToBeChecked);
        }
    }

    //Function that contains the logic
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}