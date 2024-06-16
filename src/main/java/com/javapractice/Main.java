package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the limit\t");
        int limit = Inp.nextInt();

        doPrintNaturalNumbers(limit);
    }

    public static void doPrintNaturalNumbers(int limit) {
        for (int i = 1; i <= limit; i++) System.out.print(i + " ");
    }
}