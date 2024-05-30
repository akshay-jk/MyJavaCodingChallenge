package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program to find the parity of the input
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the number\t");
        int NumberToBeChecked = Inp.nextInt();
        Main.checkParity(NumberToBeChecked);
    }

    public static void checkParity(int num) {
        System.out.println(num + " is an " + (num % 2 == 0 ? "EVEN" : "ODD") + " number");
    }
}